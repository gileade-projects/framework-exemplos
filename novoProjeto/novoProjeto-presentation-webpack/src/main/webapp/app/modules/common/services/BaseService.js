const BaseService = ($http, GumgaRest, $q) => {
    const Service = new GumgaRest()

    Service.getGumgaMenu = () => {
        return $http.get('./gumga-menu.json')
    }

    Service.getKeysJsonUrl = () => {
        return $http.get('./keys.json')
    }

    Service.getStateLabels = () => {
        return $http.get('./state-label.json');
    }

    Service.listOrganizations = () => {
        var usr = JSON.parse(sessionStorage.getItem('user'))
        if(usr && usr.token) {
            var token = usr.token
            return $http.get(APILocation.apiLocation + '/public/token/organizations/' + token + '/')
        }
        return $q(function(resolve) {
            resolve('Não tem usuario na session storage')
        })
    }

    Service.changeOrganization = (organizationId) => {
        var usr = JSON.parse(sessionStorage.getItem('user'))
        var token = usr.token
        return $http.get(APILocation.apiLocation + '/public/token/changeorganization/' + token + '/' + organizationId)
    }


    return Service
}

BaseService.$inject = ['$http', 'GumgaRest', '$q']

module.exports = BaseService;

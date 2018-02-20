package br.com.remocaoLogica.api;

import br.com.remocaoLogica.application.service.PessoaService;
import br.com.remocaoLogica.domain.model.Pessoa;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMethod;
import io.gumga.presentation.RestResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.BindingResult;
import io.gumga.application.GumgaTempFileService;
import io.gumga.domain.domains.GumgaImage;
import io.gumga.presentation.GumgaAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/pessoa")
@Transactional
public class PessoaAPI extends GumgaAPI<Pessoa, Long> {


    @Autowired
    public PessoaAPI(GumgaService<Pessoa, Long> service) {
        super(service);
    }

//    @Autowired
//    private PessoaService pessoaService;
//TODO delete comments
//    @RequestMapping(value = "/{param}/permanent", method = RequestMethod.GET)
//    public void deletePermanent(@PathVariable("param") Long id){
//        System.out.println(id);
//        pessoaService.deletePermanent(id);
//
//    }

}
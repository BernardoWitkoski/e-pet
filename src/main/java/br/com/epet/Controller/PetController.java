package br.com.epet.Controller;

import br.com.epet.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pets")
public class PetController {

    @Autowired
    private PetService service;

}

package br.com.epet.Controller;

import br.com.epet.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/owner")
public class OwnerController {

    @Autowired
    private OwnerService service;

    
}

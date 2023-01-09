package br.com.epet.Controller;

import br.com.epet.Dto.PetDTO;
import br.com.epet.Dto.PetFormDTO;
import br.com.epet.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pets")
public class PetController {

    @Autowired
    private PetService service;

    @PostMapping()
    public ResponseEntity<PetDTO> save(@RequestBody PetFormDTO body) {
        PetDTO pet = this.service.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(pet);
    }
}

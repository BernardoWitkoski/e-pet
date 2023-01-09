package br.com.epet.Service;

import br.com.epet.Dto.PetDTO;
import br.com.epet.Dto.PetFormDTO;

public interface PetService {

    PetDTO save(PetFormDTO pet);

}

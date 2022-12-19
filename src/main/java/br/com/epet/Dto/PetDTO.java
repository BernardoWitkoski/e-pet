package br.com.epet.Dto;

import br.com.epet.Constant.Specie;
import lombok.Data;

@Data
public class PetDTO {

    long id;

    String name;

    int age;

    private Specie specie;

    private double weight;

    
}

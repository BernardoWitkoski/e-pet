package br.com.epet.Dto;

import br.com.epet.Constant.Specie;
import lombok.Data;

@Data
public class PetDTO {

    private Long id;

    private String name;

    private int age;

    private Specie specie;

    private double weight;

    
}

package br.com.epet.Entity;

import br.com.epet.Constant.Specie;
import lombok.Data;

@Data
public class PetEntity {


    private Long id;

    private String name;

    private int age;

    private Specie specie;

    private double weight;



}

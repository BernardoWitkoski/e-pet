package br.com.epet.Entity;

import br.com.epet.Constant.Specie;
import lombok.Data;

@Data
public class PetEntity {

    long id;

    String name;

    private Specie specie;

    private double weight;



}

package br.com.epet.Entity;

import lombok.Data;

import java.util.List;

@Data
public class OwnerEntity {

    long id;

    String name;

    List<PetEntity> pets;

}

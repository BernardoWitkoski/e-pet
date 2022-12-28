package br.com.epet.Entity;

import lombok.Data;

import java.util.List;

@Data
public class OwnerEntity {

    private Long id;

    private String name;

    private List<PetEntity> pets;

}

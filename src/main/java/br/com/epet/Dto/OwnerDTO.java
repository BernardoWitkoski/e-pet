package br.com.epet.Dto;

import lombok.Data;

import java.util.List;

@Data
public class OwnerDTO {

    long id;

    String name;

    List<PetDTO> pets;
}

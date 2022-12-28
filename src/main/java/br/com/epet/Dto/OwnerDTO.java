package br.com.epet.Dto;

import lombok.Data;

import java.util.List;

@Data
public class OwnerDTO {

    private Long id;

    private String name;

    private List<PetDTO> pets;
}

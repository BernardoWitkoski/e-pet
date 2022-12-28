package br.com.epet.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("owner")
public class OwnerEntity {

    private Long id;

    private String name;

    private List<PetEntity> pets;

}

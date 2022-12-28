package br.com.epet.Repository;

import br.com.epet.Entity.PetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<PetEntity, Long> {
    
}

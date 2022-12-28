package br.com.epet.Repository;

import br.com.epet.Entity.OwnerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OwnerRepository extends MongoRepository<OwnerEntity, Long> {

}

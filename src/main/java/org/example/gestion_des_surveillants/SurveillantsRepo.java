package org.example.gestion_des_surveillants;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SurveillantsRepo extends CrudRepository<Surveillants, Long> {
}

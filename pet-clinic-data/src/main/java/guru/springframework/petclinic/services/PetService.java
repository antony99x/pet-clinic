package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

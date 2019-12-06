package matt.springframework.springpetclinic.services;

import matt.springframework.springpetclinic.model.Pet;

import java.util.List;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    List<Pet> findAll();
}

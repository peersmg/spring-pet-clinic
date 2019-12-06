package matt.springframework.springpetclinic.services;

import matt.springframework.springpetclinic.model.Vet;

import java.util.List;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    List<Vet> findAll();
}

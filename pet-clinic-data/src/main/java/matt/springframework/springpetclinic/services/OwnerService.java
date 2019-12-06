package matt.springframework.springpetclinic.services;

import matt.springframework.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    List<Owner> findAll();
}

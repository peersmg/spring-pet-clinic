package matt.springframework.springpetclinic.services;

import matt.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

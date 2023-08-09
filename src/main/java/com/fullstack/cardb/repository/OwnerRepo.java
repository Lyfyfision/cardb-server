package com.fullstack.cardb.repository;

import com.fullstack.cardb.domain.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface OwnerRepo extends CrudRepository<Owner, Long> {

    @Override
    Optional<Owner> findById(Long aLong);

    Optional<Owner> findByFirstName(String firstname);

}

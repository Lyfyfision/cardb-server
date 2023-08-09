package com.fullstack.cardb.repository;

import com.fullstack.cardb.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CarRepo extends CrudRepository<Car, Long> {

    List<Car> findCarById (@Param("id") Long id);

    List<Car> findCarByRegNum (@Param("regNum") String regNum);

    List<Car> findCarsByBrand (@Param("brand") String brand);

    List<Car> findCarByModel (@Param("model") String model);

}

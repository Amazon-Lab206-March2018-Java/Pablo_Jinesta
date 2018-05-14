package com.esppablo.license.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esppablo.license.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findAll();
	Optional<License> findByperson_id(Long id);
}
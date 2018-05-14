package com.esppablo.license.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esppablo.license.models.License;
import com.esppablo.license.repositories.LicenseRepository;

@Service

public class LicenseService {
	private LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// return all licenses
	public List<License> allLicenses(){
		return licenseRepository.findAll();
	}
	
	
	// add new License
	public void addLicense(License license) {
		licenseRepository.save(license);
	}
	
	// return driver license by ID
	public License findDriverByID(Long id) {
		Optional<License> license = licenseRepository.findByperson_id(id);
		return license.get();
	}
	
}

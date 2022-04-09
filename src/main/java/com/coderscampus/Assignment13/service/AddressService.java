package com.coderscampus.Assignment13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment13.domain.Address;
import com.coderscampus.Assignment13.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addresRepo;
	
	public Address save(Address address) {
		return addresRepo.save(address);
	}
}

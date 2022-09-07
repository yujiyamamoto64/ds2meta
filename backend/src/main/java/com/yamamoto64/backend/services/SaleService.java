package com.yamamoto64.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yamamoto64.backend.entities.Sale;
import com.yamamoto64.backend.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;

	public List<Sale> findSales() {
		return repo.findAll();
	}
}

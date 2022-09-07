package com.yamamoto64.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yamamoto64.backend.entities.Sale;
import com.yamamoto64.backend.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<List<Sale>> findSales() {
		List<Sale> list = service.findSales();
		return ResponseEntity.ok().body(list);
	}
}

package com.yamamoto64.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yamamoto64.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}

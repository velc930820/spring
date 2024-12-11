package com.andres.curso.springboot.jpa.springbootjparelationship.repositories;

import org.springframework.data.repository.CrudRepository;

import com.andres.curso.springboot.jpa.springbootjparelationship.entities.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{
    
}

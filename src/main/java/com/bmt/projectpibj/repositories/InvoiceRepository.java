package com.bmt.projectpibj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.projectpibj.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}

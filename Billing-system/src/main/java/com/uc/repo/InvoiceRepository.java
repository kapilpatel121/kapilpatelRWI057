package com.uc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
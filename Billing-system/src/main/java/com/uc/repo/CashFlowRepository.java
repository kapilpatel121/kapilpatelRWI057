package com.uc.repo;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uc.entity.CashFlow;


public interface CashFlowRepository extends JpaRepository<CashFlow, Long> {
	@Query(nativeQuery = true, value ="SELECT entity FROM CashFlow entity WHERE entity.date = :date")
	Optional<CashFlow> findByDate(@Param("date") Date date);
}


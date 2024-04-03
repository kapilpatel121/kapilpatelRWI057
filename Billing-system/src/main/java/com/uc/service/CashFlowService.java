package com.uc.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.uc.entity.CashFlow;
import com.uc.repo.CashFlowRepository;

@Service
public class CashFlowService {
	private final CashFlowRepository cashFlowRepository;

	public CashFlowService(CashFlowRepository cashFlowRepository) {
		this.cashFlowRepository = cashFlowRepository;
	}

	public Optional<CashFlow> getCashFlowsByDate(Date date) {
		return cashFlowRepository.findByDate(date);
	}

	// Other service methods for cash flow tracking
}

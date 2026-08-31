package com.pragma.loan.application;

import com.pragma.loan.domain.LoanStatus;
import com.pragma.loan.infrastructure.LoanRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public void updateStatus(Long loanId, LoanStatus newStatus) {
        LoanStatus currentStatus = loanRepository.getCurrentStatus(loanId);
        if (!LoanStatusTransition.isValidTransition(currentStatus, newStatus)) {
            throw new IllegalStateException("Invalid status transition");
        }
        loanRepository.updateStatus(loanId, newStatus);
    }
}
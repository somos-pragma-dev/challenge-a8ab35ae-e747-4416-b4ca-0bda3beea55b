package com.pragma.loan.infrastructure;

import com.pragma.loan.domain.LoanStatus;

public interface LoanRepository {
    LoanStatus getCurrentStatus(Long loanId);
    void updateStatus(Long loanId, LoanStatus newStatus);
}
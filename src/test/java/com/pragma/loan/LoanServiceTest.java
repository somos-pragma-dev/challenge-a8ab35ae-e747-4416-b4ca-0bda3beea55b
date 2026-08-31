package com.pragma.loan;

import com.pragma.loan.application.LoanService;
import com.pragma.loan.domain.LoanStatus;
import com.pragma.loan.infrastructure.LoanRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LoanServiceTest {
    @Mock
    private LoanRepository loanRepository;

    @InjectMocks
    private LoanService loanService;

    @Test
    public void testValidStatusTransition() {
        when(loanRepository.getCurrentStatus(1L)).thenReturn(LoanStatus.RECEIVED);
        loanService.updateStatus(1L, LoanStatus.UNDER_REVIEW);
        verify(loanRepository).updateStatus(1L, LoanStatus.UNDER_REVIEW);
    }

    @Test
    public void testInvalidStatusTransition() {
        when(loanRepository.getCurrentStatus(1L)).thenReturn(LoanStatus.RECEIVED);
        assertThrows(IllegalStateException.class, () -> loanService.updateStatus(1L, LoanStatus.APPROVED));
    }

    @Test
    public void testFinalStatusTransition() {
        when(loanRepository.getCurrentStatus(1L)).thenReturn(LoanStatus.APPROVED);
        assertThrows(IllegalStateException.class, () -> loanService.updateStatus(1L, LoanStatus.UNDER_REVIEW));
    }
}
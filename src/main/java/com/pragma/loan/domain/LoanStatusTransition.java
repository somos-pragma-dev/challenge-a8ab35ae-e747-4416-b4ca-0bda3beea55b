package com.pragma.loan.domain;

import java.util.HashMap;
import java.util.Map;

public class LoanStatusTransition {
    private static final Map<LoanStatus, LoanStatus[]> TRANSITIONS = new HashMap<>();

    static {
        TRANSITIONS.put(LoanStatus.RECEIVED, new LoanStatus[]{LoanStatus.UNDER_REVIEW});
        TRANSITIONS.put(LoanStatus.UNDER_REVIEW, new LoanStatus[]{LoanStatus.APPROVED, LoanStatus.REJECTED});
    }

    public static boolean isValidTransition(LoanStatus current, LoanStatus next) {
        return TRANSITIONS.getOrDefault(current, new LoanStatus[]{}).contains(next);
    }
}
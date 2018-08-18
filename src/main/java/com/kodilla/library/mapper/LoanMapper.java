package com.kodilla.library.mapper;

import com.kodilla.library.domain.Loan;
import com.kodilla.library.domain.LoanDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LoanMapper {
    public Loan mapToLoan(final LoanDto loanDto) {
        return new Loan(
                loanDto.getId_copy(),
                loanDto.getId_reader());
    }

    public LoanDto mapToLoanDto(final Loan loan) {
        return new LoanDto(
                loan.getId(),
                loan.getId_copy(),
                loan.getId_reader());
//                loan.getLoanOfDate(),
//                loan.getReturnOfDate());
    }

    public List<LoanDto> mapToLoanDtoList(final List<Loan> loanList) {
        return loanList.stream()
                .map(t -> new LoanDto(t.getId(), t.getId_copy(), t.getId_reader())) //, t.getLoanOfDate(), t.getReturnOfDate()))
                .collect(Collectors.toList());
    }

}

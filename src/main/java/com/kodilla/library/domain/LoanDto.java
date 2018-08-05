package com.kodilla.library.domain;

import java.time.LocalDate;

public class LoanDto {
    private Long id;
    private Copy copy;
    private Reader reader;
    private LocalDate loanOfDate = LocalDate.now();
    private LocalDate returnOfDate;

    public LoanDto(Long id, LocalDate loanOfDate, LocalDate returnOfDate) {
        this.id = id;
        this.loanOfDate = loanOfDate;
        this.returnOfDate = returnOfDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public LocalDate getLoanOfDate() {
        return loanOfDate;
    }

    public void setLoanOfDate(LocalDate loanOfDate) {
        this.loanOfDate = loanOfDate;
    }

    public LocalDate getReturnOfDate() {
        return returnOfDate;
    }

    public void setReturnOfDate(LocalDate returnOfDate) {
        this.returnOfDate = returnOfDate;
    }
}

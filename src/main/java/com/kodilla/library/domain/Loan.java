package com.kodilla.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "LOANS")
public class Loan {

    private Long id;
    private Copy copy;
    private Reader reader;
    private Date loanOfDate;
    private LocalDate returnOfDate;

    public Loan() {
        this.loanOfDate = new Date();
        this.returnOfDate = returnOfDate;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_COPY")
    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_READER")
    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    //@NotNull
    @Column(name = "LOAN_OF_DATE")
    public Date getLoanOfDate() {
        return loanOfDate;
    }

    public void setLoanOfDate(Date loanOfDate) {
        this.loanOfDate = loanOfDate;
    }

    @Column(name = "RETURN_OF_DATE")
    public LocalDate getReturnOfDate() {
        return returnOfDate;
    }

    public void setReturnOfDate(LocalDate returnOfDate) {
        this.returnOfDate = returnOfDate;
    }
}

//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity(name = "LOANS")
//public class Loan {
//    @Column(name = "ID_COPY")
//    private Long idCopy;
//
//    @Column(name = "ID_READER")
//    private Long idReader;
//
//    @NotNull
//    @Column(name = "LOAN_OF_DATE")
//    private LocalDate loanOfDate;
//
//    @Column(name = "RETURN_OF_DATE")
//    private LocalDate returnOfDate;
//}

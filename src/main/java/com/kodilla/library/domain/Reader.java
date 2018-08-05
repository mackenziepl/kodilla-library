package com.kodilla.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "READERS")
public class Reader {

    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfCardInsertion = LocalDate.now();
    private Loan loan;

    public Reader() {}

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @NotNull
    @Column(name = "DATE")
    public LocalDate getDateOfCardInsertion() {
        return dateOfCardInsertion;
    }

    public void setDateOfCardInsertion(LocalDate dateOfCardInsertion) {
        this.dateOfCardInsertion = dateOfCardInsertion;
    }
    @Transient
    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}

//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.time.LocalDate;
//
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity(name = "READERS")
//public class Reader {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
//    @Column(name = "ID", unique = true)
//    private Long id;
//
//    @Column(name = "NAME")
//    private String name;
//
//    @Column(name = "SURNAME")
//    private String surname;
//
//    @Column(name = "DATE")
//    private LocalDate dateOfCardInsertion;
//}

package com.kodilla.library.domain;

//@Entity
//@Table(name = "READERS")
//public class Reader {
//
//    private Long id;
//    private String name;
//    private String surname;
//    private Date dateOfCardInsertion;
//
//    public Reader() {}
//
//    public Reader(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//        //this.dateOfCardInsertion = new Date();
//    }
//
//    @Id
//    @GeneratedValue
//    @NotNull
//    @Column(name = "ID", unique = true)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column(name = "NAME")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Column(name = "SURNAME")
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    @NotNull
//    @Column(name = "DATE")
//    public Date getDateOfCardInsertion() {
//        return dateOfCardInsertion;
//    }
//
//    public void setDateOfCardInsertion(Date dateOfCardInsertion) {
//        this.dateOfCardInsertion = dateOfCardInsertion;
//    }
//}


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "READERS")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "DATE")
    private LocalDate dateOfCardInsertion;
}

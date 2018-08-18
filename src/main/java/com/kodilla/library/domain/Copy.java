package com.kodilla.library.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "COPIES")
public class Copy {

    private Long id;
    private String status;
    private Book book;
    private String title;

    public Copy() {}

    public Copy(Long id, String status, String title) {
        this.id = id;
        this.status = status;
        this.title = title;
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

    @ManyToOne
    @JoinColumn(name = "ID_TITLE")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Transient
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity(name = "COPIES")
//public class Copy {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
//    @Column(name = "ID", unique = true)
//    private Long id;
//
//    @Column(name = "ID_TITLE")
//    private Long idTitle;
//
//    @Column(name = "STATUS")
//    private String status;
//}

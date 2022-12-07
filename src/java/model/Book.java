/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author joyeuse
 */
@Entity
public class Book {
    @Id
      @GeneratedValue
    private int bookId;
    private String title;
  
    private Date publication_date;
    private String publisher;
    
    private Date created_at;
    
    private Date update_at;
   



    public Book() {
    }

    public Book(int bookId, String title, Date publication_date, String publisher, Date created_at, Date update_at) {
        this.bookId = bookId;
        this.title = title;
        this.publication_date = publication_date;
        this.publisher = publisher;
        this.created_at = created_at;
        this.update_at = update_at;
        
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

   
    
    
    
    
}

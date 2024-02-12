package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "famous_quotes")
public class quote{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;
    @Column(name = "quote")
    String quote;
    @Column(name = "author")
    String author;
    @Column(name = "genre")
    String genre;

    public quote() {

    }

    public quote(Long ID){
        this.ID = ID;
    }

    public void setID (Long ID){
        this.ID = ID;
    }

    public void setquote (String quote){
        this.quote = quote;
    }

    public void setauthor (String author){
        this.author = author;
    }

    public void setgenre (String genre){
        this.genre = genre;
    }

    public Long getID (){
        return this.ID;
    }

    public String getquote (){
        return this.quote;
    }

    public String getauthor (){
        return this.author;
    }

    public String getgenre (){
        return this.genre;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("ID:" + this.ID + " Quote:" + this.quote);
    }


 };

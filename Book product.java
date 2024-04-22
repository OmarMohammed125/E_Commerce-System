package com.mycompany.e_commerce;

public class BookProduct extends Product{
    
    private String author;
    private String publisher;
    //constructor
    BookProduct(int ID,String name,float price,String a , String pub){
        super(ID,name,price);
        this.author = a;
        this.publisher =pub;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}


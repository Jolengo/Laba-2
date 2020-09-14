package com.company;

public class Book {
    private String Author;
    private String Title;
    private int god;
    private int quantity;

    public Book(String Author, String Title, int god, int quantity){
        this.Author = Author;
        this.Title = Title;
        this.god = god;
        this.quantity = quantity;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getTitle(){
        return Title;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public int getGod (){
        return god;
    }

    public void setGod(int god){
        this.god = god;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        
    }



    public void IfoObook(){
        System.out.println(Title + "-------------" + quantity + "str");
    }

}
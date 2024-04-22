package com.mycompany.e_commerce;

public class Product {
    //Atributs:
    int productID;
    String proname;
    float price;
  
    Product(int proID , String pn , float p){
        if(check(proID)){
        this.productID=proID;
    }else{
            System.out.println("ID cannot be negative value");
        proID = -1;
        }
        
        this.proname= pn;
        this.price = p;
    }
//Setters and Getters:
    public void SetproID(int proID){
    productID = proID;
    }    
    int GetproID(){
        return productID;
    }
    public void SetproName(String n){
        proname = n;
    }
    String GetproName(){
        return proname;
    }
    public void SetproPrice(float p){
        price = p;
    }
    float Getprice(){
        return price;
    }   
    boolean check(int value){
        return value>0;
    }

    
}

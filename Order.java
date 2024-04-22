package com.mycompany.e_commerce;

public class Order {

     int customerId;
    int orderId;
    Product []products;
    float totalPrice;
    

    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    
    }
    public void Order_info(){
        System.out.println("order id : "+orderId);
        System.out.println("customer id : "+customerId);
        System.out.println("products : ");
        for(int i = 0; i<products.length ; i++){
            System.out.println(products[i].GetproName() + " : " + products[i].Getprice());
            
        }
        System.out.println("total price : "+totalPrice);
    }    
}

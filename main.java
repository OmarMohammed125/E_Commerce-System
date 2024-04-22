package com.mycompany.e_commerce;
import java.util.Scanner;
import java.lang.Math;


public class E_Commerce {

    public void main(String[] args) {
     Scanner input = new Scanner(System.in);

        ElectronicProduct elc = new ElectronicProduct(1,"smartphone",599.9f,"Samsung",1);
        ClothingProduct clo = new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");
        BookProduct book = new BookProduct(3,"OOP",39.99f,"O’Reilly","X Publications");

        System.out.println("Welcome to the E-commerce System!");
        System.out.println("Entre your ID");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Entre your name");
        String name = input.nextLine();
        System.out.println("Entre your address");
        String address = input.nextLine();
        Customer customer = new Customer(id,name,address);

        System.out.println("How many Products do you want to add to your cart");
        int size = input.nextInt();
        Cart cart = new Cart(customer.GetCustomerID(),size);
        for (int i = 0; i <size;i++) {
            System.out.println("Which product do you want to add? 1- Smartphone 2- T-shirt 3- OOP");
            int choice = input.nextInt();
            Product product;
            switch(choice){
                case 1:
                    product = new ElectronicProduct(1, "Smartphone", 599.9f, "Samsung", 1);
                    break;
                case 2:
                    product = new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");
                    break;
                case 3:
                    product = new BookProduct(3,"OOP",39.99f,"O’Reilly","X Publications");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    i--;
                    continue;
            }   cart.addProduct(product,i);
        }
        System.out.println("Your total is " + cart.calculate_price() + ". Would you like to order? 1- Yes 2- No");
        int choice = input.nextInt();
        if (choice ==1){
            System.out.println("Here is your order summary");
            Order order = new Order(id,1, cart.GetProducts(), (float)cart.calculate_price());
            order.Order_info();
        } else{
            System.out.println("Thank you for shopping!");
        }
        
    }
}

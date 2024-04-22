package com.mycompany.e_commerce;

class Cart {
    int customerId;
    int nproducts;
    Product []products;
    boolean []active_prod;
    int c = 0;
    //constructor:
    public Cart(int customerId, int nproducts) {
        this.customerId = customerId;
        this.nproducts = nproducts;
        products = new Product[nproducts];
        active_prod = new boolean[nproducts];
    }

    public void SetCustomerID(int customerId) {
        this.customerId = customerId;
    }

    public void SetNproducts(int nproducts) {
        this.nproducts = nproducts;
    }

    public int GetCustomerID() {
        return customerId;
    }

    public int GetNproducts() {
        return nproducts;
    }

    public Product[] GetProducts() {
        return products;
    }

    public void addProduct(Product prod , int val){
        if (val >= 0 && val < nproducts) {
            products[val] = prod;
        } else {
            System.out.println("this index does not exist");
        }
    }
    public void RemoveProduct(int a){
        active_prod[a] = false;
    }
    public float calculate_price(){
        float total=0;
        for (int i=0;i <nproducts;i++) {
            if (products[i] != null) {
                total += products[i].Getprice();
            }
        }

        return total;
    }
    public boolean check_max(){
        return c<nproducts;
    }

}

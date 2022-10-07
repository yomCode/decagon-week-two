package models;

import Interfaces.CustomerInterface;
import enums.Qualification;
import enums.Sex;


import java.util.List;

public class Customer extends Person implements CustomerInterface {

    //FIELDS------------------------------------------------------------------>
    private String productName;
    private Double cashPaid;
    private Integer qty;
    private List<Products> cartArray;




    //CONSTRUCTORS------------------------------------------------------------------>

    public Customer(){

    }

    public Customer(Double cashPaid, Integer qty) {
        this.cashPaid = cashPaid;

        this.qty = qty;

    }

    public Customer(Integer id, String name, Integer age, Sex sex, Qualification qualification, String email, Double cashPaid, Double balance, Integer qty) {
        super(id, name, age, sex, qualification, email);
        this.cashPaid = cashPaid;
        this.qty = qty;
    }

    public Customer(Integer id, Double cashPaid, Integer qty) {
        super(id);
        this.cashPaid = cashPaid;
        this.qty = qty;
    }

    public Customer(int id, double cashPaid, String productName, int qty) {
        super(id);
        this.cashPaid = cashPaid;
        this.productName = productName;
        this.qty = qty;
    }

    //GETTERS & SETTERS------------------------------------------------------------------>


    public Double getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(Double cashPaid) {
        this.cashPaid = cashPaid;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "productName='" + productName + '\'' +
                ", cashPaid=" + cashPaid +
                ", qty=" + qty +
                ", cartArray=" + cartArray +
                '}';
    }

    //buyProduct METHOD OF CASHIER------------------------------------------------------------------>
    @Override
    public String buyProduct(Store store){
        List<Products> availableProducts = store.getProductsList();

        for(int i = 0; i< availableProducts.size(); i++){
            //Check if product is available on the available product list------------------------------
            if(availableProducts.get(i).getProductName().equalsIgnoreCase(this.getProductName())){
                //Check if selected product is in stock------------------------------------------------------------------
                if(availableProducts.get(i).getQuantity() <= 0) return "OUT OF STOCK!";
                //Check if there is enough quantity to serve the customer's need-----------------------------------------
                if(availableProducts.get(i).getQuantity() > 0 && availableProducts.get(i).getQuantity() >= this.getQty()){
                    //Check if customer have enough cash to pay for the product-------------------------------------------
                        if((availableProducts.get(i).getRatePerUnit()* this.getQty()) <= getCashPaid()){

                            return "Product purchased successfully";

                        }else{
                            return "Insufficient balance to complete purchase";
                        }


                    }else{
                        return "Enter a lower quantity";
                    }
            }

        }
        return "Product is not available";
    }


}

package models;

import java.util.List;

public class Store {
    //FIELDS------------------------------------------------------------------>
    private Integer id;
    private String storeName;
    private List<Staff> staffList;
    private List<Products> productsList;


    //CONSTRUCTORS------------------------------------------------------------------>
    public Store(){

    }

    public Store(Integer id, String name){
        this.id = id;
        this.storeName = name;
    }

    public Store(Integer id, String name, List<Staff> staffList, List<Products> productsList) {
        this.id = id;
        this.storeName = name;
        this.staffList = staffList;
        this.productsList = productsList;
    }


    //SETTERS & GETTERS------------------------------------------------------------------>
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + storeName + '\'' +
                ", staffList=" + staffList +
                ", productsList=" + productsList +
                '}';
    }
}

package com.company;

public class Tovar {
    private String name;
    private String email;
    private String itemname;
    private double price;
    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemname() {
        return itemname;
    }

    @Override
    public String toString() {
        return name+" "+email+" "+itemname+" "+price+" "+ comments;
    }
}

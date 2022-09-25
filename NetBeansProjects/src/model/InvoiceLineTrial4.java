/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class InvoiceLineTrial4 {
   private String itemName;
    private int count;
    private double price;
    private InvoiceHeaderTrial5 inv;

    public InvoiceLineTrial4(String itemName, int count, double price, InvoiceHeaderTrial5 inv) {
        this.itemName = itemName;
        this.count = count;
        this.price = price;
        this.inv = inv;
    }
    public double totalPrice(){
        return count *price ;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeaderTrial5 getInv() {
        return inv;
    }

    public void setInv(InvoiceHeaderTrial5 inv) {
        this.inv = inv;
    }

    @Override
    public String toString() {
        return "InvoiceLineTrial4{" +
                "itemName='" + itemName + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

}


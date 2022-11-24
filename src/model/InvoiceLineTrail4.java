/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class InvoiceLineTrail4 {
    private String itemName;
    private double  itemPrice;
    private int count;
    private InvoiceHeaderTrial5 header;

    public InvoiceLineTrail4(String name,double price,int count,InvoiceHeaderTrial5 header){
        this.itemName = name;
        this.itemPrice = price;
        this.count = count;
        this.header = header;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public int getCount() {
        return this.count;
    }

    public void updateItem(String name,double price, int count) {
        this.count = count;
        this.itemPrice = price;
        this.itemName = name;
    }
}
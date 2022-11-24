/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class InvoiceHeaderTrial5 {
    private final int InvoiceNum;
    private String InvoiceDate;
    private String customerName;
    private final ArrayList<InvoiceLineTrail4> invoiceLines;

    public InvoiceHeaderTrial5(int num,String date,String name) {
        this.InvoiceNum = num;
        this.InvoiceDate = date;
        this.customerName = name;
        this.invoiceLines = new ArrayList<>();
    }

    public int getInvoiceNum() {
        return this.InvoiceNum;
    }

    public String getInvoiceDate() {
        return this.InvoiceDate;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setInvoiceDate(String date) {
        this.InvoiceDate = date;
    }

    public ArrayList<InvoiceLineTrail4> getInvoiceLines() {
        return this.invoiceLines;
    }

    public void addInvoiceLine(InvoiceLineTrail4 invoiceLine)
    {
        this.invoiceLines.add(invoiceLine);
    }

    public void deleteItem(int index) {
        this.invoiceLines.remove(index);
    }

    public void updateItem(int itemIndex,String name,double price, int count) {
        this.invoiceLines.get(itemIndex).updateItem(name,price,count);
    }
}
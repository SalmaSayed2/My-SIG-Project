/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeaderTrial5 {
    //first step is decleration of variables
  private   int number;
   private Date date ;
   private String name ;
   private ArrayList<InvoiceLineTrial4> Lines;
//2nd step is to create constractor to for initiation
    public InvoiceHeaderTrial5(int number, Date date, String name) {
        this.number = number;
        this.date = date;
        this.name = name;
    }
    public double totalPrice(){
        double total = 0.0;
        for(InvoiceLineTrial4 line :Lines) {
            total += line.totalPrice();
        }
        return total ;
        }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<InvoiceLineTrial4> getLines() {
        return Lines;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InvoiceHeaderTrial5{" +
                "number=" + number +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

}

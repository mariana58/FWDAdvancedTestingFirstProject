/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

public class Invoice {
   private int number;
   private String date;
   private String customer;
   private ArrayList<Item> items;
  
    public Invoice() {
    }
    public double getTotalOfInvoice(){
        double tots=0.0;
        for(Item item:getItems()){
            tots+=item.getTotalOfItem();
        }
        return tots;
    }
    public Invoice(int number, String date, String customer) {
        this.number = number;
        this.date = date;
        this.customer = customer;
    }

    public ArrayList<Item> getItems() {
        if(items==null)
            items=new ArrayList<>();
        return items;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
 public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + number + ", date=" + date + ", customer=" + customer + '}';
    }
    
    
    public String getAsCSVFile(){
        return number+","+date+","+customer;
    }

    
   
}


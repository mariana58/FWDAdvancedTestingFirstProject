package model;

public class Item {
    private static int itemnum=0;
    private String item;
    private double price;
    private int count;
    private Invoice invoice;

    public Item(String item, double price, int count, Invoice invoice) {
        this.itemnum++;
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }
    public double getTotalOfItem(){
        return count*price;
    }
    public Item() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }
    

    @Override
    public String toString() {
        return "Item{" + "number=" + invoice.getNumber() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }
    public String getAsCSVFile(){
        return invoice.getNumber()+","+item+","+price+","+count;
    }
   
    
}


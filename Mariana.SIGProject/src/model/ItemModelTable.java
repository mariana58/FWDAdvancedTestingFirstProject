/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ItemModelTable extends AbstractTableModel {
    private ArrayList<Item>items;
    private String[]columns={"No.","Item Name","Item Price","Count","Item Total"};

    public ItemModelTable(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public int getRowCount() {
        return items.size();
     }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    public String getColumnName(int col){
        return columns[col];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item item=items.get(rowIndex);
        
        switch (columnIndex){
            case 0:return item.getInvoice().getNumber();
            case 1:return item.getItem();
            case 2:return item.getPrice();
            case 3:return item.getCount();
            case 4:return item.getTotalOfItem();
            default: return "";
        }      
    }
    
}

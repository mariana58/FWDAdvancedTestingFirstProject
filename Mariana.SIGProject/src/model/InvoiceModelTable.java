/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoiceModelTable extends AbstractTableModel {
    private ArrayList<Invoice> invoices;
    private String[] columns={"No.","Date","Customer","Total"};

    @Override
    public int getRowCount() {
        return invoices.size();
    }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    public String getColumnName(int column){
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice in=invoices.get(rowIndex);
        switch (columnIndex){
            case 0:return in.getNumber();
            case 1:return in.getDate();
            case 2:return in.getCustomer();
            case 3:return in.getTotalOfInvoice();
            default :return "";
    }
    }
   
    
    
      public InvoiceModelTable(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

}

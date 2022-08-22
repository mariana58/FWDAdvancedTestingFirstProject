/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ItemViewDialog extends JDialog{
    private JTextField itNameField;
    private JTextField itCountField;
    private JTextField itPriceField;
    private JLabel itNamedLbl;
    private JLabel itCountLbl;
    private JLabel itPriceLbl;
    private JButton okBtn;
    private JButton canclBtn;
    
    public ItemViewDialog(ViewInvoiceFrame frame){
        itNameField=new JTextField(20);
        itNamedLbl=new JLabel("Item Name ");
        itCountField=new JTextField(20);
        itCountLbl=new JLabel("Item Count");
        itPriceField=new JTextField(20);
        itPriceLbl=new JLabel("Item Price");
        okBtn=new JButton("OK");
        canclBtn=new JButton("Cancel");
        
        okBtn.setActionCommand("CreateNewItemOK");
        canclBtn.setActionCommand("CancelCreateNewItem");
        
        okBtn.addActionListener(frame.getController());
        canclBtn.addActionListener(frame.getController());
        setLayout(new GridLayout(4,2));
        add(itNamedLbl);
        add(itNameField);
        add(itCountLbl);
        add(itCountField);
        add(itPriceLbl);
        add(itPriceField);
        add(okBtn);
        add(canclBtn);
        pack();
    }

    public JTextField getItNameField() {
        return itNameField;
    }

    public JTextField getItCountField() {
        return itCountField;
    }

    public JTextField getItPriceField() {
        return itPriceField;
    }
    
    
}


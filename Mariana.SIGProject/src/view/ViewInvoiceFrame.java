
package view;
import controller.Controller;
import model.Invoice;
import model.InvoiceModelTable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ViewInvoiceFrame extends javax.swing.JFrame {

   
    public ViewInvoiceFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInvoiceTable = new javax.swing.JTable();
        jTableInvoiceTable.getSelectionModel().addListSelectionListener(controller);
        jButtonCreateInvoice = new javax.swing.JButton();
        jButtonCreateInvoice.addActionListener(controller);
        jButtonDeleteInvoice = new javax.swing.JButton();
        jButtonDeleteInvoice.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelCustomerName = new javax.swing.JLabel();
        jLabelInvoiceDate = new javax.swing.JLabel();
        jLabelInvoiceTotal = new javax.swing.JLabel();
        jLabelInvoiceNumber = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItemTable = new javax.swing.JTable();
        jButtonCreateItem = new javax.swing.JButton();
        jButtonCreateItem.addActionListener(controller);
        jButtonDeleteItem = new javax.swing.JButton();
        jButtonDeleteItem.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLoadFile = new javax.swing.JMenuItem();
        jMenuItemLoadFile.addActionListener(controller);
        jMenuItemSaveFile = new javax.swing.JMenuItem();
        jMenuItemSaveFile.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableInvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableInvoiceTable);

        jButtonCreateInvoice.setText("Create New Invoice");

        jButtonDeleteInvoice.setText("Delete Invoice");
        jButtonDeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteInvoiceActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        jTableItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableItemTable);

        jButtonCreateItem.setText("Create New Item");

        jButtonDeleteItem.setText("Delete Item");

        jMenu1.setText("File");

        jMenuItemLoadFile.setText("Load File");
        jMenuItemLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoadFileActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLoadFile);

        jMenuItemSaveFile.setText("Save File");
        jMenu1.add(jMenuItemSaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCustomerName)
                            .addComponent(jLabelInvoiceTotal)
                            .addComponent(jLabelInvoiceNumber)
                            .addComponent(jLabelInvoiceDate)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCreateInvoice)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteInvoice)
                .addGap(87, 87, 87)
                .addComponent(jButtonCreateItem)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteItem)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelInvoiceNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelInvoiceDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelCustomerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelInvoiceTotal))
                        .addGap(186, 186, 186))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCreateItem)
                        .addComponent(jButtonDeleteItem))
                    .addComponent(jButtonCreateInvoice)
                    .addComponent(jButtonDeleteInvoice))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLoadFileActionPerformed

    private void jButtonDeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteInvoiceActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateInvoice;
    private javax.swing.JButton jButtonCreateItem;
    private javax.swing.JButton jButtonDeleteInvoice;
    private javax.swing.JButton jButtonDeleteItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelInvoiceDate;
    private javax.swing.JLabel jLabelInvoiceNumber;
    private javax.swing.JLabel jLabelInvoiceTotal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemLoadFile;
    private javax.swing.JMenuItem jMenuItemSaveFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInvoiceTable;
    private javax.swing.JTable jTableItemTable;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Invoice> invoices;
    private Controller controller=new Controller(this);
    private InvoiceModelTable invoicemodel;
    
    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }
    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    public InvoiceModelTable getInvoicemodel() {
        return invoicemodel;
    }

    public void setInvoicemodel(InvoiceModelTable invoicemodel) {
        this.invoicemodel = invoicemodel;
    }

    public JLabel getjLabelCustomerName() {
        return jLabelCustomerName;
    } 

    public JLabel getjLabelInvoiceDate() {
        return jLabelInvoiceDate;
    }

    public JLabel getjLabelInvoiceNumber() {
        return jLabelInvoiceNumber;
    }

    public JLabel getjLabelInvoiceTotal() {
        return jLabelInvoiceTotal;
    }

    public JTable getjTableInvoiceTable() {
        return jTableInvoiceTable;
    }

    public JTable getjTableItemTable() {
        return jTableItemTable;
    }

    public Controller getController() {
        return controller;
    }
     
    public int getNextInvoiceNumber(){
        int num=0;
        for(Invoice invoice:invoices){
            if(invoice.getNumber()>num)
                num=invoice.getNumber();
        }
        return ++num;
    }    
    
}

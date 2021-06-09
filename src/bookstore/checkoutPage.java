/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author detun
 */
public class checkoutPage extends javax.swing.JPanel {
    int price,totalCost,quantity;
    /**
     * Creates new form checkoutPage
     */
    public checkoutPage(String name,int price,int quantity) {
        initComponents();
        setBookName(name);
        setBookPrice(price);
        setqOrders(quantity);
        setCost();
    }
    

    public String getBookName() {
        return bookName.getText();
    }
    
    public JPanel getPanel(){
        return checkoutItem;
    }

    public void setBookName(String bookName) {
        this.bookName.setText(bookName);
    }

    public int getBookPrice() {
        return price;
    }

    public void setBookPrice(int bookPrice) {
        price = bookPrice;
        this.bookPrice.setText(bookPrice+"$");
    }

    public int getCost() {
        return totalCost;
    }

    public void setCost() {
        totalCost = price*quantity;
        this.cost.setText(totalCost+"$");
        
    }

    public int getqOrders() {
        return quantity;
    }

    public void setqOrders(int qOrders) {
        this.quantity = qOrders;
        this.qOrders.setText("x "+quantity);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkoutItem = new javax.swing.JPanel();
        bookName = new javax.swing.JLabel();
        bookPrice = new javax.swing.JLabel();
        qOrders = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();

        checkoutItem.setBackground(new java.awt.Color(255, 255, 255));
        checkoutItem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));
        checkoutItem.setMaximumSize(new java.awt.Dimension(32767, 39));
        checkoutItem.setMinimumSize(new java.awt.Dimension(100, 5));

        bookName.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        bookName.setText("The name of the book");

        bookPrice.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bookPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookPrice.setText("20000$");
        bookPrice.setAlignmentX(2.0F);

        qOrders.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        qOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qOrders.setText("x 55");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("Total Cost");

        cost.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cost.setText("100000$");

        jLabel1.setBackground(new java.awt.Color(253, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/books-stack.png"))); // NOI18N
        jLabel1.setOpaque(true);

        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/clear.jpg"))); // NOI18N
        remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout checkoutItemLayout = new javax.swing.GroupLayout(checkoutItem);
        checkoutItem.setLayout(checkoutItemLayout);
        checkoutItemLayout.setHorizontalGroup(
            checkoutItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutItemLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(checkoutItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(checkoutItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(remove)
                .addGap(0, 0, 0))
        );
        checkoutItemLayout.setVerticalGroup(
            checkoutItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutItemLayout.createSequentialGroup()
                .addGroup(checkoutItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(checkoutItemLayout.createSequentialGroup()
                        .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(checkoutItemLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkoutItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(checkoutItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 350, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to remove?", getBookName(), 0)==JOptionPane.YES_OPTION){
            
            inventoryPage.removeCheckPanel(checkoutItem);
            
        }
      
    }//GEN-LAST:event_removeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel bookPrice;
    private javax.swing.JPanel checkoutItem;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel qOrders;
    private javax.swing.JLabel remove;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author detun
 */
public class addCheckout extends javax.swing.JPanel {
    int amount = 1;
    private int quantityAvail=1;
    bookPanel book;
    JDialog dialog;
    
    /**
     * Creates new form addCheckout
     */
    public addCheckout(bookPanel book,JDialog dialog) {
        initComponents();
        bookName.setText(book.getBookName());
        available.setText("Available: "+book.getQuantity());
        quantityAvail=book.getQuantity();
        this.book=book;
        this.dialog=dialog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bookName = new javax.swing.JLabel();
        increase = new javax.swing.JButton();
        reduce = new javax.swing.JButton();
        available = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        contentPanel.setBackground(new java.awt.Color(226, 221, 221));
        contentPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Quantity");

        amountLabel.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("1");

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setText("Add to Cart");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bookName.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        bookName.setText("Name of the book");

        increase.setBackground(new java.awt.Color(245, 244, 244));
        increase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/plus_24px.png"))); // NOI18N
        increase.setOpaque(false);
        increase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseActionPerformed(evt);
            }
        });

        reduce.setBackground(new java.awt.Color(245, 244, 244));
        reduce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/minus_24px.png"))); // NOI18N
        reduce.setOpaque(false);
        reduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceActionPerformed(evt);
            }
        });

        available.setText("Available: 24");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 10)); // NOI18N
        jLabel2.setText("Book Name:");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(reduce, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(increase, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(available, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookName)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reduce))
                    .addComponent(increase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(available)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inventoryPage.addCheckPanel(new checkoutPage(book.getBookName(), Integer.parseInt(book.getPrice()), amount).getPanel());
        dialog.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void increaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseActionPerformed
            if (amount<quantityAvail)
                amountLabel.setText(++amount+"");
    }//GEN-LAST:event_increaseActionPerformed
    
    public JPanel getPanel(){
        return contentPanel;
    }
    
    private void reduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceActionPerformed
        if(amount>1)
            amountLabel.setText(--amount+"");
    }//GEN-LAST:event_reduceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel available;
    private javax.swing.JLabel bookName;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton increase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reduce;
    // End of variables declaration//GEN-END:variables
}

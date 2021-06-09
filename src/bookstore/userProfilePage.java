/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import static bookstore.accountsPage.contentPanel;
import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author detun
 */
public class userProfilePage extends javax.swing.JPanel {

    private Dialog userDialog;
    private int compId;

    public void setAccountCombo(String item) {
        this.accountCombo.setSelectedItem(item);
    }

    public void setAnswerField(String answer) {
        this.answerField.setText(answer);
    }

    public void setFullField(String fullName) {
        this.fullField.setText(fullName);
    }

    public void setMailField(String mail) {
        this.mailField.setText(mail);
    }

    public void setOperation(String operation) {
        this.operation.setText(operation);
    }

    public void setPassField(String pass) {
        this.passField.setText(pass);
    }

    public void setSecretCombo(int index) {
        this.secretCombo.setSelectedIndex(index);
    }

    public void setUserField(String username) {
        this.userField.setText(username);
    }

    /**
     * Creates new form userProfilePage
     */
    public userProfilePage(Dialog dialog) {
        initComponents();
        userDialog=dialog;
        dataFieldFilled();
    }
    
    public userProfilePage(int xId,String full,String user,String pass,String mail,String secretNo,String answer,String acct,Dialog dialog) {
        initComponents();
        this.compId=xId;
        setFullField(full);
        setAccountCombo(acct);
        setMailField(mail);
        setPassField(pass);
        setAnswerField(answer);
        setUserField(user);
        setSecretCombo(Integer.parseInt(secretNo));
        this.userDialog = dialog;
        dataFieldFilled();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        secretCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accountCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fullField = new javax.swing.JTextField();
        operation = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(400, 510));
        setMinimumSize(new java.awt.Dimension(400, 510));

        contentPanel.setBackground(new java.awt.Color(254, 254, 246));
        contentPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        contentPanel.setForeground(new java.awt.Color(51, 51, 51));
        contentPanel.setMaximumSize(new java.awt.Dimension(400, 510));
        contentPanel.setMinimumSize(new java.awt.Dimension(400, 510));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/profile-user.png"))); // NOI18N
        jLabel2.setText("USER DATA");
        jLabel2.setIconTextGap(10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Secret Question");

        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });
        answerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                answerFieldKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Secret Question Answer");

        secretCombo.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        secretCombo.setMaximumRowCount(10);
        secretCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your childhood bestfriend?", "What is the name of your pet?", "What is your best nickname?", "What is your favourite movie or tv series?", "What is your best food?", "What is your favourite color?", "What is your mother's maiden name?", "When is your anniversary?", "Which is your favourite web browser?", "What is the name of your first school?" }));
        secretCombo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        secretCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secretCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Username");

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        userField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userFieldKeyReleased(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 10)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 10)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.setEnabled(false);
        SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("E-mail");

        mailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFieldActionPerformed(evt);
            }
        });
        mailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailFieldKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Account Type");

        accountCombo.setFont(new java.awt.Font("Dubai", 0, 10)); // NOI18N
        accountCombo.setMaximumRowCount(10);
        accountCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Moderator" }));
        accountCombo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        accountCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Password");

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFieldKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Full Name");

        fullField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullFieldActionPerformed(evt);
            }
        });
        fullField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullFieldKeyReleased(evt);
            }
        });

        operation.setBackground(new java.awt.Color(93, 76, 76));
        operation.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        operation.setForeground(new java.awt.Color(93, 76, 76));
        operation.setText("edit user");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userField)
                    .addComponent(mailField)
                    .addComponent(passField)
                    .addComponent(fullField)
                    .addComponent(secretCombo, 0, 376, Short.MAX_VALUE)
                    .addComponent(answerField)
                    .addComponent(accountCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addGap(30, 30, 30)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(operation)))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operation))
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secretCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
        userDialog.dispose();
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        //        jPanel1.remove(secretField);
        //        JPanel x = jPanel1;
        //        x.remove(secretCombo);
        //        x.remove(secretField);
        //        jPanel1=x;
        //        jPanel1.updateUI();
        if(Book_Store.getUser().toLowerCase().equals("moderator")&&accountCombo.getSelectedIndex()==1){
            JOptionPane.showMessageDialog(this, "Moderator cannot add new moderator user", "Error", 0);
        }
        else{
            if (operation.getText().equals("new user")) {
                System.err.println("save button");
                int x = accountsPage.contentCompCount();
                accountPanel test = new accountPanel(
                    x+1,
                    fullField.getText(),
                    userField.getText(),
                    passField.getText(),
                    mailField.getText(),
                    secretCombo.getSelectedIndex(),
                    answerField.getText(),
                    accountCombo.getSelectedItem().toString());
                
                dbConnect.insert("User",
                    fullField.getText(),
                    userField.getText(),
                    passField.getText(),
                    mailField.getText(),
                    secretCombo.getSelectedIndex(),
                    answerField.getText(),
                    accountCombo.getSelectedItem().toString());
                
                accountsPage.addContentPanel(test.getUserPanel());
                accountsPage.updateUserId();
                contentPanel.updateUI();
                userDialog.dispose();
        }else{
//            JPanel user = (JPanel)contentPanel.getComponent(compId);
                
                dbConnect.update("User",
                    compId+1,
                    fullField.getText(),
                    userField.getText(),
                    passField.getText(),
                    mailField.getText(),
                    secretCombo.getSelectedIndex(),
                    answerField.getText(),
                    accountCombo.getSelectedItem().toString());

                accountPanel user = new accountPanel(
                    compId+1,
                    fullField.getText(),
                    userField.getText(),
                    passField.getText(),
                    mailField.getText(),
                    secretCombo.getSelectedIndex(),
                    answerField.getText(),
                    accountCombo.getSelectedItem().toString());
                accountsPage.editContentPanel(compId,user);
    //            ((JLabel)user.getComponent(0)).setText(""+(i+1));
                }userDialog.dispose();
//      
        }
          
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void mailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void fullFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullFieldActionPerformed

    private void secretComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secretComboActionPerformed

    private void fullFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullFieldKeyReleased
        fieldSetBorder(fullField, "fullname",5);
    }//GEN-LAST:event_fullFieldKeyReleased

    private void userFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyReleased
        fieldSetBorder(userField, "username",5);
    }//GEN-LAST:event_userFieldKeyReleased

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
        fieldSetBorder(passField, "password",5);
    }//GEN-LAST:event_passFieldKeyReleased

    private void answerFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerFieldKeyReleased
        fieldSetBorder(answerField, "secret answer",1);
    }//GEN-LAST:event_answerFieldKeyReleased

    private void mailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailFieldKeyReleased
        if (mailField.getText().contains("@")&&mailField.getText().toLowerCase().contains(".com")) {
            mailField.setBorder(new LineBorder(Color.LIGHT_GRAY));
            mailField.setToolTipText("email");
        }else{
            mailField.setBorder(new LineBorder(Color.red));
            mailField.setToolTipText("invalid email");
        }
        dataFieldFilled();
    }//GEN-LAST:event_mailFieldKeyReleased

    public void fieldSetBorder(JTextField field,String name,int size){
        if (field.getText().length()<size) {
            field.setBorder(new LineBorder(Color.RED));
            field.setToolTipText("'"+name+"' must be atleast "+size);
            
        }else{
            field.setBorder(new LineBorder(Color.LIGHT_GRAY));
            field.setToolTipText(name);
        }
        dataFieldFilled();
    }
    
    public boolean dataFieldFilled(){
        if (userField.getText().length()>=5&&
            passField.getText().length()>=5&&
            fullField.getText().length()>=5&&
            answerField.getText().length()>=1&&
            mailField.getText().contains("@")&&
            mailField.getText().toLowerCase().contains(".com")
            ){
               SaveButton.setEnabled(true);
               return true;
            
        }else{
            SaveButton.setEnabled(false);
            return false;
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> accountCombo;
    private javax.swing.JTextField answerField;
    private javax.swing.JButton cancelButton;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JTextField fullField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel operation;
    private javax.swing.JTextField passField;
    private javax.swing.JComboBox<String> secretCombo;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}

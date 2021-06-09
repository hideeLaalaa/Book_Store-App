/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.awt.Dialog;
import java.awt.Window;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author detun
 */
public class accountPanel extends javax.swing.JPanel {
    userProfilePage uPage;
    private String fullName;
    private  String eMail;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
    
    /**
     * Creates new form accountPanel
     */
    public accountPanel() {
        initComponents();
    }

    public accountPanel(int xId,String username,String password,int quest,String answer,String type){
       initComponents();
        setxId(xId);
        setUsername(username);
        setPassword(password);
        setSecurityQuestion(quest);
        setSecurityAnswer(answer);
        setAcctType(type);
   }
    
    public accountPanel(int xId,String full,String username,String password,String email,int quest,String answer,String type){
       initComponents();
        setxId(xId);
        setUsername(username);
        setPassword(password);
        setSecurityQuestion(quest);
        setSecurityAnswer(answer);
        setAcctType(type);
        setFullName(full);
        setEmail(email);
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        xId = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        acctType = new javax.swing.JLabel();
        deleteUser = new javax.swing.JLabel();
        editUser = new javax.swing.JLabel();
        securityQuestion = new javax.swing.JLabel();
        securityAnswer = new javax.swing.JLabel();

        userPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userPanel.setMaximumSize(new java.awt.Dimension(32767, 36));
        userPanel.setOpaque(false);
        userPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userPanelMouseExited(evt);
            }
        });
        userPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                userPanelComponentMoved(evt);
            }
        });

        xId.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        xId.setText("1");
        xId.setMaximumSize(new java.awt.Dimension(355, 355));

        username.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        username.setText("loginUser1");
        username.setMaximumSize(new java.awt.Dimension(355, 355));

        password.setFont(new java.awt.Font("Lucida Console", 2, 12)); // NOI18N
        password.setText("passUser1");
        password.setMaximumSize(new java.awt.Dimension(355, 355));

        acctType.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        acctType.setText("Moderator");
        acctType.setMaximumSize(new java.awt.Dimension(355, 355));

        deleteUser.setBackground(new java.awt.Color(208, 204, 204));
        deleteUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/delete-user (2).png"))); // NOI18N
        deleteUser.setToolTipText("delete user");
        deleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteUserMouseExited(evt);
            }
        });

        editUser.setBackground(new java.awt.Color(208, 204, 204));
        editUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookstore/editUser.png"))); // NOI18N
        editUser.setToolTipText("edit");
        editUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editUserMouseExited(evt);
            }
        });

        securityQuestion.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        securityQuestion.setText("1");
        securityQuestion.setMaximumSize(new java.awt.Dimension(355, 355));

        securityAnswer.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        securityAnswer.setText("securityAnswer1");
        securityAnswer.setMaximumSize(new java.awt.Dimension(355, 355));

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(securityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(securityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(acctType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acctType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(securityQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(securityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(editUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserMouseExited
        userPanelMouseExited(evt);
        editUser.setOpaque(false);
        userPanel.updateUI();
    }//GEN-LAST:event_editUserMouseExited

    private void editUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserMouseEntered
        userPanelMouseEntered(evt);
        editUser.setOpaque(true);
        userPanel.updateUI();
    }//GEN-LAST:event_editUserMouseEntered

    private void editUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserMouseClicked
        JDialog userDialog = new JDialog();
        uPage = new userProfilePage(
                accountsPage.contentPanel.getComponentZOrder(this.userPanel),
                getFullName(),
                getUsername(),
                getPassword(),
                getEmail(),
                getSecurityQuestion(),
                getSecurityAnswer(),
                getAcctType(),
                userDialog   );
        uPage.setOperation("edit user");
        userDialog.add(uPage.contentPanel);
        userDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        userDialog.setSize(400,550);
        userDialog.setResizable(false);
        userDialog.setLocationRelativeTo(null);
//        userDialog.setType(Window.Type.POPUP);
        userDialog.setVisible(true);
        userPanel.updateUI();
    }//GEN-LAST:event_editUserMouseClicked

    private void deleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMouseExited
        userPanelMouseExited(evt);
        deleteUser.setOpaque(false);
        userPanel.updateUI();
    }//GEN-LAST:event_deleteUserMouseExited

    private void deleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMouseEntered
        userPanelMouseEntered(evt);
        deleteUser.setOpaque(true);
        userPanel.updateUI();
    }//GEN-LAST:event_deleteUserMouseEntered

    private void userPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPanelMouseEntered
        //        userPanel.setBorder(new EtchedBorder(0));
        userPanel.setBorder(new BevelBorder(0));
    }//GEN-LAST:event_userPanelMouseEntered

    private void userPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPanelMouseExited
        userPanel.setBorder(new SoftBevelBorder(0));
    }//GEN-LAST:event_userPanelMouseExited

    private void deleteUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserMouseClicked

        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", fullName, 0)==JOptionPane.YES_OPTION){
            dbConnect.deleteTable("User", getxId());
            accountsPage.contentPanel.remove(this.userPanel);
            accountsPage.contentPanel.updateUI();
            accountsPage.updateUserId();
        }
    }//GEN-LAST:event_deleteUserMouseClicked

    private void userPanelComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userPanelComponentMoved
        System.err.println("component moved "+accountsPage.contentPanel.getComponentZOrder(this.userPanel));
    }//GEN-LAST:event_userPanelComponentMoved

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acctType;
    private javax.swing.JLabel deleteUser;
    private javax.swing.JLabel editUser;
    private javax.swing.JLabel password;
    private javax.swing.JLabel securityAnswer;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel username;
    private javax.swing.JLabel xId;
    // End of variables declaration//GEN-END:variables

    public String getAcctType() {
        return acctType.getText();
    }

    public void setAcctType(String acctType) {
        this.acctType.setText(acctType); 
    }

    public JLabel getDeleteUser() {
        return deleteUser;
    }

    public JLabel getEditUser() {
        return editUser;
    }

    public String getPassword() {
        return password.getText();
    }

    public void setPassword(String password) {
        this.password.setText(password);
    }

    public JPanel getUserPanel() {
        return userPanel;
    }

    public String getUsername() {
        return username.getText();
    }

    public String getSecurityAnswer() {
        return securityAnswer.getText();
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer.setText(securityAnswer);
    }

    public String getSecurityQuestion() {
        return securityQuestion.getText();
    }

    public void setSecurityQuestion(int securityQuestion) {
        this.securityQuestion.setText(""+securityQuestion);
    }

    public void setUsername(String username) {
        this.username.setText(username);
    }

    public void setxId(int xId) {
        this.xId.setText(""+xId);
    }
    public int getxId() {
        return accountsPage.contentPanel.getComponentZOrder(this.userPanel)+1;
    }
}

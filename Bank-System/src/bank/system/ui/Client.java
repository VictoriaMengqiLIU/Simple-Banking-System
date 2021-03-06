/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.system.ui;

import bank.system.Account;
import bank.system.Control;
import bank.system.Current;
import bank.system.Junior;
import bank.system.Saver;
import bank.system.Util;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        doInBackground();
        updateInfo();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        baLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limitLabel = new javax.swing.JLabel();
        depoText = new javax.swing.JTextField();
        depoBtn = new javax.swing.JButton();
        wdText = new javax.swing.JTextField();
        wdBtn = new javax.swing.JButton();
        deLabel = new javax.swing.JLabel();
        wdLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JToggleButton();
        sBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Balance");

        baLabel.setText(balance+"");

        jLabel2.setText("Limit");

        limitLabel.setText(limit+"");

        depoBtn.setText("DEPOSIT");
        depoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depoBtnActionPerformed(evt);
            }
        });

        wdBtn.setText("WITHDRAW");
        wdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdBtnActionPerformed(evt);
            }
        });

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        sBtn.setText("SUSPEND");
        sBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBtnActionPerformed(evt);
            }
        });

        cBtn.setText("CLOSE");
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(deLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(wdText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(wdBtn))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(depoText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(depoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(baLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(limitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sBtn)
                                .addGap(45, 45, 45)
                                .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(wdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(limitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depoText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depoBtn))
                .addGap(10, 10, 10)
                .addComponent(deLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wdText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sBtn)
                        .addComponent(cBtn)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        menu.setText("Client");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        menu.add(aboutMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.setToolTipText("Quit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menu.add(exitMenuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new About(this).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void depoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depoBtnActionPerformed
        String depo = depoText.getText();
        if (new Control().depositFunds(account, id, depo)) {
            deLabel.setText("CLEARED!");
            depoText.setText("");
        } else {
            deLabel.setText("ERROR! TRY AGAIN!");
            depoText.setText("");
        }
    }//GEN-LAST:event_depoBtnActionPerformed

    private void wdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdBtnActionPerformed
        String wd = wdText.getText();
        if (account == "saver") { wdLabel.setText("THERE IS AT LEAST 3 DAYS TO GET YOUR MOUNEY!"); }
        if (new Control().withdrawFunds(account, id, pin, wd)) {
            wdLabel.setText("SUCCESS!");
            wdText.setText("");
        } else {
            wdLabel.setText("THE AMOUNT IS OUT OF YOUR LIMITATION! TRY AGAIN!");
            wdText.setText("");
        }
    }//GEN-LAST:event_wdBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBtnActionPerformed
        if (new Control().suspendAcc(account, id)) {
            wdLabel.setText("SUCCESS!");
        } else {
            wdLabel.setText("ERROR! TRY AGAIN!");
        }
    }//GEN-LAST:event_sBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        if (new Control().closeAcc(account, id)) {
            wdLabel.setText("SUCCESS!");
        } else {
            wdLabel.setText("SORRY! YOUR BALANCE IS NOT CLEARED!");
        }
    }//GEN-LAST:event_cBtnActionPerformed

    public void doInBackground()
    {
        Object obj = new Util().readObject("/account/tmp");
        Account info = (Account) obj;
        id = info.getAccNo();
        pin = info.getIdNo();
        new File("./data/account/" + id).delete();
    }
    
    public void updateInfo()
    {
        if(id.charAt(0) == "j".charAt(0)) {
            account = "junior";
            Junior j;
            Object obj = new Util().readObject("/junior/"+id);
            j = (Junior) obj;
            name = j.getName();
            addr = j.getAddr();
            birth = j.getBirth();
            balance = j.getBalance();
            limit = j.getLimit();
        } else if(id.charAt(0) == "s".charAt(0)) {
            account = "saver";
            Saver s;
            Object obj = new Util().readObject("/saver/"+id);
            s = (Saver) obj;
            name = s.getName();
            addr = s.getAddr();
            birth = s.getBirth();
            balance = s.getBalance();
            limit = s.getLimit();
        } else if(id.charAt(0) == "c".charAt(0)) {
            account = "current";
            Current c;
            Object obj = new Util().readObject("/current/"+id);
            c = (Current) obj;
            name = c.getName();
            addr = c.getAddr();
            birth = c.getBirth();
            balance = c.getBalance();
            limit = c.getLimit();
        }
    }
    
    public String getAcc() { return account; }
    public String getID() { return id; }
    public String getPIN() { return pin; }
    public String getName() { return name; }
    public String getAddr() { return addr; }
    public String getBirth() { return birth; }
    public int getBalance() { return balance; }
    public int getLimit() { return limit; }
    
    public void setAcc(String value) { account = value; }
    public void setID(String value) { id = value; }
    public void setPIN(String value) { pin = value; }
    public void setName(String value) { name = value; }
    public void setAddr(String value) { addr = value; }
    public void setBirth(String value) { birth = value; }
    public void setLimit(int value) { limit = value; }
    
    private String account = null;
    private String id = null;
    private String pin = null;
    private int balance = 0;
    private int limit = 0;
    private String name = null;
    private String addr = null;
    private String birth = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel baLabel;
    private javax.swing.JToggleButton backBtn;
    private javax.swing.JButton cBtn;
    private javax.swing.JLabel deLabel;
    private javax.swing.JButton depoBtn;
    private javax.swing.JTextField depoText;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel limitLabel;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton sBtn;
    private javax.swing.JButton wdBtn;
    private javax.swing.JLabel wdLabel;
    private javax.swing.JTextField wdText;
    // End of variables declaration//GEN-END:variables
}

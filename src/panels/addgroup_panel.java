/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.Color;

/**
 *
 * @author abdelwahed
 */
public class addgroup_panel extends javax.swing.JPanel {

    /**
     * Creates new form addgroup_panel
     */
    public addgroup_panel() {
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

        ceate_jButton = new javax.swing.JButton();
        del_jButton = new javax.swing.JButton();
        group_jTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        msggroup_jLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(311, 249));

        ceate_jButton.setBackground(java.awt.Color.green);
        ceate_jButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ceate_jButton.setForeground(java.awt.Color.black);
        ceate_jButton.setText("Create");
        ceate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceate_jButtonActionPerformed(evt);
            }
        });

        del_jButton.setBackground(java.awt.Color.green);
        del_jButton.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        del_jButton.setForeground(java.awt.Color.black);
        del_jButton.setText("Delete");
        del_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_jButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel1.setText("Enter Group Name ..!");

        msggroup_jLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(group_jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(ceate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(del_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(msggroup_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(group_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ceate_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(del_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msggroup_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ceate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceate_jButtonActionPerformed
        // TODO add your handling code here:
        project1.docommand p = new project1.docommand();
        
        if(group_jTextField.getText().isEmpty())
        {
            msggroup_jLabel.setForeground(Color.red);
            msggroup_jLabel.setText("Apove white box is empty ..!");
        }
        else
        {
            String command1 = "groupadd ";
            String command2  = group_jTextField.getText();
            String total_command3  = command1 + command2 ;
           if(p.command(total_command3))
           {
               msggroup_jLabel.setForeground(Color.black);
               msggroup_jLabel.setText(command2 + " was created");
           }
           
        }
    }//GEN-LAST:event_ceate_jButtonActionPerformed

    private void del_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_jButtonActionPerformed
        // TODO add your handling code here:
        project1.docommand p = new project1.docommand();
        
        if(group_jTextField.getText().isEmpty())
        {
            msggroup_jLabel.setForeground(Color.red);
            msggroup_jLabel.setText("Apove white box is empty ..!");
        }
        else
        {
            String command11 = "groupdel ";
            String command22  = group_jTextField.getText();
            String total_command33  = command11 + command22 ;   
           if(p.command(total_command33))
           {
               msggroup_jLabel.setForeground(Color.black);
               msggroup_jLabel.setText(command22 +" was deleted");
           }
           
        }
    }//GEN-LAST:event_del_jButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ceate_jButton;
    private javax.swing.JButton del_jButton;
    private javax.swing.JTextField group_jTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msggroup_jLabel;
    // End of variables declaration//GEN-END:variables
}

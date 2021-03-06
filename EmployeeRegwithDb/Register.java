/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EmployeeRegwithDB;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    DataBaseConnection db=new DataBaseConnection();
    /**
     * Creates new form Register
     */
    public Register() {        
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

        rbtngroup = new javax.swing.ButtonGroup();
        stulbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        nrcnolbl = new javax.swing.JLabel();
        addresslbl = new javax.swing.JLabel();
        ranklbl = new javax.swing.JLabel();
        genderlbl = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        nrcnofield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        rankcbo = new javax.swing.JComboBox();
        malerbtn = new javax.swing.JRadioButton();
        femalerbtn = new javax.swing.JRadioButton();
        btnregister = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        deptlbl = new javax.swing.JLabel();
        deptcbo = new javax.swing.JComboBox();
        salarylbl = new javax.swing.JLabel();
        salaryfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Form");

        stulbl.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        stulbl.setForeground(java.awt.Color.blue);
        stulbl.setText("Employee Registration Form");

        namelbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        namelbl.setForeground(java.awt.Color.blue);
        namelbl.setText("Name");

        nrcnolbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        nrcnolbl.setForeground(java.awt.Color.blue);
        nrcnolbl.setText("NRC No");

        addresslbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        addresslbl.setForeground(java.awt.Color.blue);
        addresslbl.setText("Address");

        ranklbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ranklbl.setForeground(java.awt.Color.blue);
        ranklbl.setText("Rank");

        genderlbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        genderlbl.setForeground(java.awt.Color.blue);
        genderlbl.setText("Gender");

        rankcbo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rankcbo.setForeground(new java.awt.Color(0, 0, 255));
        rankcbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Assistant Manager", "Managing Director" }));

        rbtngroup.add(malerbtn);
        malerbtn.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        malerbtn.setForeground(java.awt.Color.blue);
        malerbtn.setText("Male");

        rbtngroup.add(femalerbtn);
        femalerbtn.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        femalerbtn.setForeground(java.awt.Color.blue);
        femalerbtn.setText("Female");

        btnregister.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnregister.setForeground(java.awt.Color.blue);
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btncancel.setForeground(java.awt.Color.blue);
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnclose.setForeground(java.awt.Color.blue);
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        deptlbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        deptlbl.setForeground(new java.awt.Color(0, 0, 255));
        deptlbl.setText("Department");

        deptcbo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        deptcbo.setForeground(new java.awt.Color(0, 0, 255));
        deptcbo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "Sale", "Marketing", "Office" }));

        salarylbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        salarylbl.setForeground(new java.awt.Color(0, 0, 255));
        salarylbl.setText("Salary");

        salaryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(stulbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelbl)
                            .addComponent(addresslbl)
                            .addComponent(genderlbl)
                            .addComponent(btnregister)
                            .addComponent(nrcnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ranklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deptlbl)
                            .addComponent(salarylbl))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(rankcbo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressfield)
                                    .addComponent(namefield)
                                    .addComponent(nrcnofield)
                                    .addComponent(malerbtn)
                                    .addComponent(femalerbtn)
                                    .addComponent(deptcbo, 0, 150, Short.MAX_VALUE)
                                    .addComponent(salaryfield))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stulbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nrcnofield, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(nrcnolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addresslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(addressfield))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarylbl)
                    .addComponent(salaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ranklbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankcbo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deptcbo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deptlbl))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(malerbtn)
                    .addComponent(genderlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(femalerbtn)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregister)
                    .addComponent(btncancel)
                    .addComponent(btnclose))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
	String name=namefield.getText();
	String nrcno=nrcnofield.getText();
	String address=addressfield.getText();
	String rank=String.valueOf(rankcbo.getSelectedItem());
	String dept=String.valueOf(deptcbo.getSelectedItem());
	String gender="";
	if(malerbtn.isSelected())
            gender="Male";
	if(femalerbtn.isSelected())
            gender="Female";
        if(namefield.getText().equals("")|| nrcnofield.getText().equals("")|| addressfield.getText().equals("") || salaryfield.getText().equals(""))
	{
	  JOptionPane.showMessageDialog(this,"Enter All Data!");						
	}
	else  
	{
                            int salary=Integer.parseInt(salaryfield.getText());                    
    		Employee emp=new Employee();
    		emp.setEmpname(name);
    		emp.setNrcno(nrcno);
    		emp.setAddress(address);
    		emp.setSalary(salary);
    		emp.setRank(rank);
    		emp.setDepartment(dept);
    		emp.setGender(gender);
                        try {
		db.AddEmployee(emp);
		JOptionPane.showMessageDialog(this, "Insert successful");
                        } catch (ClassNotFoundException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        } catch (SQLException ex) {
                            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                        }
	} 
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
	namefield.setText("");
	nrcnofield.setText("");
	salaryfield.setText("");
	addressfield.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void salaryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel addresslbl;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox deptcbo;
    private javax.swing.JLabel deptlbl;
    private javax.swing.JRadioButton femalerbtn;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JRadioButton malerbtn;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nrcnofield;
    private javax.swing.JLabel nrcnolbl;
    private javax.swing.JComboBox rankcbo;
    private javax.swing.JLabel ranklbl;
    private javax.swing.ButtonGroup rbtngroup;
    private javax.swing.JTextField salaryfield;
    private javax.swing.JLabel salarylbl;
    private javax.swing.JLabel stulbl;
    // End of variables declaration//GEN-END:variables
}

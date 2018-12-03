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
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update() throws ClassNotFoundException, SQLException {
        initComponents();
        empidArr=db.getAllEmpid();
        cboempid.setModel(new javax.swing.DefaultComboBoxModel(empidArr));
        rankArr=db.getAllRank();
        cborank.setModel(new javax.swing.DefaultComboBoxModel(rankArr));
        deptArr=db.getAllDept();
        cbodept.setModel(new javax.swing.DefaultComboBoxModel(deptArr));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatelbl = new javax.swing.JLabel();
        yearlbl = new javax.swing.JLabel();
        rollnolbl = new javax.swing.JLabel();
        addresslbl = new javax.swing.JLabel();
        cboempid = new javax.swing.JComboBox();
        cborank = new javax.swing.JComboBox();
        salaryfield = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbodept = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updatelbl.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        updatelbl.setForeground(java.awt.Color.blue);
        updatelbl.setText("Update Form");
        updatelbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updatelbl.setOpaque(true);

        yearlbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        yearlbl.setForeground(java.awt.Color.blue);
        yearlbl.setText("Choose Emp ID");

        rollnolbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rollnolbl.setForeground(java.awt.Color.blue);
        rollnolbl.setText("Choose Rank");

        addresslbl.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        addresslbl.setForeground(java.awt.Color.blue);
        addresslbl.setText("Salary");

        cboempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboempidActionPerformed(evt);
            }
        });

        cborank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cborankActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnupdate.setForeground(java.awt.Color.blue);
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Department");

        cbodept.setName(""); // NOI18N
        cbodept.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearlbl)
                            .addComponent(btnupdate)
                            .addComponent(rollnolbl)
                            .addComponent(addresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btncancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnclose))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 91, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbodept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboempid, 0, 136, Short.MAX_VALUE)
                                    .addComponent(cborank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salaryfield))))
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(updatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatelbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboempid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(rollnolbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cborank, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslbl)
                    .addComponent(salaryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cbodept, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btncancel)
                    .addComponent(btnclose))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboempidActionPerformed
        // TODO add your handling code here:
        Employee emp=new Employee();
        String selectrank="";
        String selectdept="";
			String empid=String.valueOf(cboempid.getSelectedItem());
			try {
				int eid=Integer.parseInt(empid);
				emp=db.getDatabyID(eid);
				
				selectrank=emp.getRank();
				  for(int r=0;r<rankArr.length;r++)
					  if(rankArr[r].equals(selectrank))
						  cborank.setSelectedItem(rankArr[r]);
				  
				  selectdept=emp.getDepartment();
					  for(int r=0;r<deptArr.length;r++)
						  if(deptArr[r].equals(selectdept))
							  cbodept.setSelectedItem(deptArr[r]);
					  
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			salaryfield.setText(String.valueOf(emp.getSalary()));
    }//GEN-LAST:event_cboempidActionPerformed

    private void cborankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cborankActionPerformed
       
    }//GEN-LAST:event_cborankActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String rank=String.valueOf(cborank.getSelectedItem());
        String dept=String.valueOf(cbodept.getSelectedItem());
        if(salaryfield.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter All Data");
        }
        else
        {
            try {
                int salary=Integer.parseInt(salaryfield.getText());
                String empid=String.valueOf(cboempid.getSelectedItem());
                int eid=Integer.parseInt(empid);
                emp.setEmpid(eid);
                emp.setRank(rank);
                emp.setSalary(salary);
                emp.setDepartment(dept);
                db.Update(emp);
                JOptionPane.showMessageDialog(this,"Update OK!");
            } catch (ClassNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        salaryfield.setText("");
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Update().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    DataBaseConnection db=new DataBaseConnection();
    String[] empidArr,rankArr,deptArr;
    String year;
    Employee emp=new Employee();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslbl;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cbodept;
    private javax.swing.JComboBox cboempid;
    private javax.swing.JComboBox cborank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel rollnolbl;
    private javax.swing.JTextField salaryfield;
    private javax.swing.JLabel updatelbl;
    private javax.swing.JLabel yearlbl;
    // End of variables declaration//GEN-END:variables
}
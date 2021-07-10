import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.connect;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author syil
 */
public class form_konsumen extends javax.swing.JFrame {

    /**
     * Creates new form form_konsumen
     */
    public form_konsumen() {
        initComponents();
        datatable(); 
        setTitle("CAHAYA PERMATA OPTICAL");
    }
    
    public void datatable(){    
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("ID Konsumen");
        tbl.addColumn("Nama Konsumen");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Umur");
        tbl.addColumn("No.HP");        
        tabelkonsumen.setModel(tbl);
        
        try{
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from konsumen");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString("ID_Konsumen"),
                    res.getString("Nama_konsumen"),
                    res.getString("Alamat"),
                    res.getString("Jenis_kelamin"),
                    res.getInt("Umur"),
                    res.getString("No_hp")   
                });
                tabelkonsumen.setModel(tbl);
            }} 
        catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "salah");
    }
}

    public void kosong(){
        txtidkonsumen.setText("");
        txtnamakonsumen.setText("");
        txtalamat.setText("");        
        txtumur.setText("");
        txtnohp.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtidkonsumen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnamakonsumen = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelkonsumen = new javax.swing.JTable();
        cmbjeniskelamin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ID Konsumen");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nama Konsumen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 60, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("DATA KONSUMEN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 322, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100x86.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 0, 100, 86);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(356, 2, 74, 0);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(356, 8, 0, 0);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3);
        jPanel3.setBounds(12, 2, 0, 0);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 100));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Umur");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, 30));

        txtidkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtidkonsumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("No. HP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 60, 30));

        txtnamakonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtnamakonsumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 340, -1));

        txtalamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 340, -1));

        txtumur.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtumur, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, -1));

        txtnohp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 130, -1));

        btnnew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 30));

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, 30));

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 30));

        btndelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 30));

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, 30));

        btncari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btncari.setText("Cari");
        btncari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncariMouseClicked(evt);
            }
        });
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, 30));

        btnnext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, 30));

        tabelkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabelkonsumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelkonsumen.setRowHeight(18);
        tabelkonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkonsumenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelkonsumen);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 560, 100));

        cmbjeniskelamin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbjeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        getContentPane().add(cmbjeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background(800).jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 510));

        setSize(new java.awt.Dimension(692, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String ID_Konsumen = txtidkonsumen.getText();
        String Nama_konsumen = txtnamakonsumen.getText();
        String Alamat = txtalamat.getText();
        Object Jenis_kelamin = cmbjeniskelamin.getSelectedItem();           
        String Umur = txtumur.getText();        
        String No_hp = txtnohp.getText();

        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            statement.executeUpdate("insert into konsumen VALUES ('" +ID_Konsumen+ "', "
                    + "'" +Nama_konsumen+ "', '" +Alamat+ "',  "
                    + "'" +Jenis_kelamin+"','" +Umur+ "', '" +No_hp+ "');");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        datatable();
        kosong();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from konsumen where + "
                    + "ID_Konsumen='" + txtidkonsumen.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID Konsumen");
            tbl.addColumn("Nama Konsumen");
            tbl.addColumn("Alamat");
            tbl.addColumn("Jenis Kelamin");
            tbl.addColumn("Umur");
            tbl.addColumn("NO.HP");
            
            tabelkonsumen.setModel(tbl);
            while (res.next()){
                tbl.addRow(new Object[] {
                        res.getString("ID_Konsumen"),
                        res.getString("Nama_konsumen"),
                        res.getString("Alamat"),
                        res.getString("Jenis_kelamin"),
                        res.getString("Umur"),                       
                        res.getString("No_hp")
                });
                tabelkonsumen.setModel(tbl); 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btncariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncariMouseClicked
     
    }//GEN-LAST:event_btncariMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String ID_Konsumen = txtidkonsumen.getText();

        try {
            Statement statement = (Statement)connect.GetConnection() .createStatement();
            statement.executeUpdate("DELETE from konsumen where ID_Konsumen=('" +ID_Konsumen+ "');");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            txtidkonsumen.setText("");
            txtnamakonsumen.setText("");
            txtalamat.setText("");
            txtumur.setText("");
            String Jenis_kelamin = null;
            txtnohp.setText("");
            txtidkonsumen.requestFocus();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        datatable();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new form_dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtidkonsumen.setText("");
        txtnamakonsumen.setText("");
        txtalamat.setText("");       
        txtumur.setText("");
        txtnohp.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String sql ="UPDATE Konsumen SET ID_Konsumen = '"+txtidkonsumen.getText()+"', "
                    + "Nama_konsumen = '"+txtnamakonsumen.getText()+"', Alamat = '"+txtalamat.getText()+"', "
                    + "Jenis_kelamin = '"+cmbjeniskelamin.getSelectedItem()+"', Umur = '"+txtumur.getText()+"', "
                    + "No_hp = '"+txtnohp.getText()+"' WHERE ID_Konsumen = '"+txtidkonsumen.getText()+"'";
            java.sql.Connection conn=(Connection)connect.GetConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }datatable();
       
    }//GEN-LAST:event_btneditActionPerformed

    private void tabelkonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkonsumenMouseClicked
        int baris = tabelkonsumen.rowAtPoint(evt.getPoint());
        
        String ID_Konsumen =tabelkonsumen.getValueAt(baris, 0).toString();
        txtidkonsumen.setText(ID_Konsumen);
        
        String Nama_konsumen =tabelkonsumen.getValueAt(baris, 1).toString();
        txtnamakonsumen.setText(Nama_konsumen);
        
        String Alamat =tabelkonsumen.getValueAt(baris, 2).toString();
        txtalamat.setText(Alamat);
        
        String Jenis_kelamin = tabelkonsumen.getValueAt(baris, 3).toString();
        cmbjeniskelamin.setSelectedItem(Jenis_kelamin);
        
        String Umur =tabelkonsumen.getValueAt(baris, 4).toString();
        txtumur.setText(Umur);
              
        String No_hp =tabelkonsumen.getValueAt(baris, 5).toString();
        txtnohp.setText(No_hp);

    }//GEN-LAST:event_tabelkonsumenMouseClicked

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        new form_resep().setVisible(true);
        dispose();
        //this.setVisible(false);
    }//GEN-LAST:event_btnnextActionPerformed

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
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_konsumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbjeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabelkonsumen;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtidkonsumen;
    private javax.swing.JTextField txtnamakonsumen;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables
}

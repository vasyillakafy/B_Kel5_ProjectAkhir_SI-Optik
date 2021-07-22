import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.connect;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syil
 */
public class form_transaksi extends javax.swing.JFrame {

    /**
     * Creates new form form_pembayaran
     */
    
    Color panedefault;
    Color paneClick;
       
    public form_transaksi() {
        initComponents();
        datatable();
        tampil_idpetugas();
        tampil_idkonsumen();
        tampil_idresep();
        tampil_idkacamata();
        setTitle("CAHAYA PERMATA OPTICAL");
        
        panedefault = new Color(255,255,255);
        paneClick = new Color(0,0,51);
        pane4.setBackground(paneClick);
        pane2.setBackground(panedefault);
        pane3.setBackground(panedefault);
        pane1.setBackground(panedefault);
        pane5.setBackground(panedefault);
        pane6.setBackground(panedefault);
        
    }

    public void tampil_idpetugas() {   
        try {
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from petugas");
            jcombo_idpetugas.addItem("");
            while (res.next()) 
            {
                String id=res.getString("ID_Petugas");         
                jcombo_idpetugas.addItem(id);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }
    
    public void tampil_idkonsumen() {   
        try {
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet reslt=statement.executeQuery("select * from konsumen");
            jcombo_idkonsumen.addItem("");
            while (reslt.next()) 
            {
                String id=reslt.getString("ID_Konsumen");         
                jcombo_idkonsumen.addItem(id);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }

    public void tampil_idresep() {   
        try {
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from resep");
            jcombo_idresep.addItem("");
            while (res.next()) 
            {
                String id=res.getString("ID_Resep");         
                jcombo_idresep.addItem(id);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }      
        
    public void tampil_idkacamata() {   
        try {
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet result=statement.executeQuery("select * from kacamata");
            jcombo_idkacamata.addItem("");
            while (result.next()) 
            {
                String id=result.getString("ID_Kacamata");         
                jcombo_idkacamata.addItem(id);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }  
    
    public void datatable(){    
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("ID Transaksi");
        tbl.addColumn("ID Petugas");
        tbl.addColumn("ID Konsumen");
        tbl.addColumn("ID Resep");
        tbl.addColumn("ID Kacamata");
        tbl.addColumn("Cara Pembelian");  
        tbl.addColumn("Tanggal Kirim");
        tbl.addColumn("Harga");
        tbl.addColumn("DP");
        tbl.addColumn("Angsuran 1");
        tbl.addColumn("Angsuran 2");
        tbl.addColumn("Angsuran 3");
        tabeltransaksi.setModel(tbl);
        
        try{
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from transaksi");
            while(res.next())
            {
                    tbl.addRow(new Object[]{
                    res.getString("ID_Transaksi"),
                    res.getString("ID_Petugas"),
                    res.getString("ID_Konsumen"),
                    res.getString("ID_Resep"),
                    res.getString("ID_kacamata"),
                    res.getString("Cara_pembelian"),
                    res.getString("Tgl_kirim"),
                    res.getString("Harga"),
                    res.getString("DP"),
                    res.getString("Angs1"),  
                    res.getString("Angs2"),
                    res.getString("Angs3")
                });
                tabeltransaksi.setModel(tbl);
            }} 
        catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "salah");
    }
}
    
    public void kosong(){
        txtidtransaksi.setText("");       
        jdate.setDate(null);
        txtharga.setText("");
        txtdp.setText("");
        txtangs1.setText("");
        txtangs2.setText("");
        txtangs3.setText("");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        paneldashboard = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        paneltransaksi = new javax.swing.JPanel();
        pane4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        panelkacamata = new javax.swing.JPanel();
        pane3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelresep = new javax.swing.JPanel();
        pane2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        panelkonsumen = new javax.swing.JPanel();
        pane1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        panelreport = new javax.swing.JPanel();
        pane5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelpetugas = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pane6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidtransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcombo_carapembelian = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        btncari = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtangs1 = new javax.swing.JTextField();
        txtangs2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtangs3 = new javax.swing.JTextField();
        jcombo_idkonsumen = new javax.swing.JComboBox<>();
        jcombo_idpetugas = new javax.swing.JComboBox<>();
        jcombo_idresep = new javax.swing.JComboBox<>();
        jcombo_idkacamata = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 570));
        getContentPane().setLayout(null);

        btnnew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew);
        btnnew.setBounds(210, 350, 67, 31);

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(290, 350, 67, 31);

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(770, 350, 70, 30);

        btnnext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnext.setText("Finish");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        getContentPane().add(btnnext);
        btnnext.setBounds(850, 350, 80, 31);

        btndelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(370, 350, 79, 31);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(717, 127, 0, 0);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(755, 161, 0, 0);

        btnprint.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint);
        btnprint.setBounds(690, 350, 67, 31);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        paneldashboard.setBackground(new java.awt.Color(255, 255, 255));
        paneldashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneldashboardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneldashboardMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("DASHBOARD");

        javax.swing.GroupLayout paneldashboardLayout = new javax.swing.GroupLayout(paneldashboard);
        paneldashboard.setLayout(paneldashboardLayout);
        paneldashboardLayout.setHorizontalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneldashboardLayout.setVerticalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneltransaksi.setBackground(new java.awt.Color(255, 255, 255));
        paneltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneltransaksiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneltransaksiMousePressed(evt);
            }
        });

        pane4.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane4Layout = new javax.swing.GroupLayout(pane4);
        pane4.setLayout(pane4Layout);
        pane4Layout.setHorizontalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane4Layout.setVerticalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Transaksi");

        javax.swing.GroupLayout paneltransaksiLayout = new javax.swing.GroupLayout(paneltransaksi);
        paneltransaksi.setLayout(paneltransaksiLayout);
        paneltransaksiLayout.setHorizontalGroup(
            paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltransaksiLayout.createSequentialGroup()
                .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneltransaksiLayout.setVerticalGroup(
            paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltransaksiLayout.createSequentialGroup()
                .addGroup(paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelkacamata.setBackground(new java.awt.Color(255, 255, 255));
        panelkacamata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelkacamataMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelkacamataMousePressed(evt);
            }
        });

        pane3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Data Kacamata");

        javax.swing.GroupLayout panelkacamataLayout = new javax.swing.GroupLayout(panelkacamata);
        panelkacamata.setLayout(panelkacamataLayout);
        panelkacamataLayout.setHorizontalGroup(
            panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkacamataLayout.createSequentialGroup()
                .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelkacamataLayout.setVerticalGroup(
            panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkacamataLayout.createSequentialGroup()
                .addGroup(panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelresep.setBackground(new java.awt.Color(255, 255, 255));
        panelresep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelresepMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelresepMousePressed(evt);
            }
        });

        pane2.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Data Resep");

        javax.swing.GroupLayout panelresepLayout = new javax.swing.GroupLayout(panelresep);
        panelresep.setLayout(panelresepLayout);
        panelresepLayout.setHorizontalGroup(
            panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelresepLayout.createSequentialGroup()
                .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelresepLayout.setVerticalGroup(
            panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelresepLayout.createSequentialGroup()
                .addGroup(panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelkonsumen.setBackground(new java.awt.Color(255, 255, 255));
        panelkonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelkonsumenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelkonsumenMousePressed(evt);
            }
        });

        pane1.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Data Konsumen");

        javax.swing.GroupLayout panelkonsumenLayout = new javax.swing.GroupLayout(panelkonsumen);
        panelkonsumen.setLayout(panelkonsumenLayout);
        panelkonsumenLayout.setHorizontalGroup(
            panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkonsumenLayout.createSequentialGroup()
                .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        panelkonsumenLayout.setVerticalGroup(
            panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkonsumenLayout.createSequentialGroup()
                .addGroup(panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelreport.setBackground(new java.awt.Color(255, 255, 255));
        panelreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelreportMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelreportMousePressed(evt);
            }
        });

        pane5.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane5Layout = new javax.swing.GroupLayout(pane5);
        pane5.setLayout(pane5Layout);
        pane5Layout.setHorizontalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane5Layout.setVerticalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Report");

        javax.swing.GroupLayout panelreportLayout = new javax.swing.GroupLayout(panelreport);
        panelreport.setLayout(panelreportLayout);
        panelreportLayout.setHorizontalGroup(
            panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelreportLayout.createSequentialGroup()
                .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelreportLayout.setVerticalGroup(
            panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelreportLayout.createSequentialGroup()
                .addGroup(panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        panelpetugas.setBackground(new java.awt.Color(255, 255, 255));
        panelpetugas.setPreferredSize(new java.awt.Dimension(101, 34));
        panelpetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelpetugasMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Data Petugas");

        pane6.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane6Layout = new javax.swing.GroupLayout(pane6);
        pane6.setLayout(pane6Layout);
        pane6Layout.setHorizontalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane6Layout.setVerticalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelpetugasLayout = new javax.swing.GroupLayout(panelpetugas);
        panelpetugas.setLayout(panelpetugasLayout);
        panelpetugasLayout.setHorizontalGroup(
            panelpetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpetugasLayout.createSequentialGroup()
                .addComponent(pane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelpetugasLayout.setVerticalGroup(
            panelpetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelresep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelkonsumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneldashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelkacamata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneltransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelpetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(paneldashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelresep, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelkacamata, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneltransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelreport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 100, 180, 430);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(615, 325));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ID Transaksi");

        txtidtransaksi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID Konsumen");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("ID Petugas");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("ID Resep");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("ID Kacamata");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Cara Pembelian");

        jcombo_carapembelian.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcombo_carapembelian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Kredit" }));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Tanggal Kirim");

        jdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdatePropertyChange(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Harga");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("DP");

        txtdp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Angsuran 1");

        txtangs1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtangs2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Angsuran 2");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Angsuran 3");

        txtangs3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtangs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtangs3ActionPerformed(evt);
            }
        });

        jcombo_idkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jcombo_idpetugas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcombo_idpetugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcombo_idpetugas.setSelectedIndex(-1);

        jcombo_idresep.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcombo_idresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo_idresepActionPerformed(evt);
            }
        });

        jcombo_idkacamata.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtharga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcombo_carapembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcombo_idkacamata, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcombo_idkonsumen, javax.swing.GroupLayout.Alignment.LEADING, 0, 190, Short.MAX_VALUE)
                        .addComponent(jcombo_idpetugas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcombo_idresep, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncari)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdp)
                    .addComponent(txtangs2)
                    .addComponent(txtangs3)
                    .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtangs1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtharga))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncari)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcombo_idpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcombo_idkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombo_idresep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombo_idkacamata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcombo_carapembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtharga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdp)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtangs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtangs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtangs3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 60, 770, 280);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addContainerGap(640, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(190, 10, 770, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabeltransaksi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeltransaksi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 390, 774, 126);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/100x86.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 180, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabeltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransaksiMouseClicked
        int baris = tabeltransaksi.rowAtPoint(evt.getPoint());

        String ID_Transaksi =tabeltransaksi.getValueAt(baris, 0).toString();
        txtidtransaksi.setText(ID_Transaksi);

        String ID_Petugas =tabeltransaksi.getValueAt(baris, 1).toString();
        jcombo_idpetugas.setSelectedItem(ID_Petugas);        
        
        String ID_Konsumen =tabeltransaksi.getValueAt(baris, 2).toString();
        jcombo_idkonsumen.setSelectedItem(ID_Konsumen);

        String ID_Resep = tabeltransaksi.getValueAt(baris, 3).toString();
        jcombo_idresep.setSelectedItem(ID_Resep);

        String ID_Kacamata =tabeltransaksi.getValueAt(baris, 4).toString();
        jcombo_idkacamata.setSelectedItem(ID_Kacamata);

        String Cara_pembelian =tabeltransaksi.getValueAt(baris, 5).toString();
        jcombo_carapembelian.setSelectedItem(Cara_pembelian);
     
        String Tgl_kirim = tabeltransaksi.getValueAt(baris, 6).toString();
        try {
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date=pattern.parse(Tgl_kirim);
            jdate.setDate(date);     
        } catch (Exception e){
            e.printStackTrace();
        }
        
        String Harga =tabeltransaksi.getValueAt(baris, 7).toString();
        txtharga.setText(Harga);
        
        String DP =tabeltransaksi.getValueAt(baris, 8).toString();
        txtdp.setText(DP);
        
        String Angs1 =tabeltransaksi.getValueAt(baris, 9).toString();
        txtangs1.setText(Angs1);
        
        String Angs2 =tabeltransaksi.getValueAt(baris, 10).toString();
        txtangs2.setText(Angs2);
        
        String Angs3 =tabeltransaksi.getValueAt(baris, 11).toString();
        txtangs3.setText(Angs3);
    }//GEN-LAST:event_tabeltransaksiMouseClicked

    private void btncariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncariMouseClicked

    }//GEN-LAST:event_btncariMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from transaksi where + "
                + "ID_Transaksi='" + txtidtransaksi.getText() + "'");
            DefaultTableModel tbl=new DefaultTableModel();
            tbl.addColumn("ID Transaksi");
            tbl.addColumn("ID Konsumen");
            tbl.addColumn("ID Petugas");
            tbl.addColumn("ID Resep");
            tbl.addColumn("ID Kacamata");
            tbl.addColumn("Cara Pembelian");  
            tbl.addColumn("Tanggal Kirim");
            tbl.addColumn("Harga");
            tbl.addColumn("DP");
            tbl.addColumn("Angsuran 1");
            tbl.addColumn("Angsuran 2");
            tbl.addColumn("Angsuran 3");
            tabeltransaksi.setModel(tbl);
            while (res.next()){
                tbl.addRow(new Object[] {
                    res.getString("ID_Transaksi"),
                    res.getString("ID_Konsumen"),
                    res.getString("ID_Petugas"),
                    res.getString("ID_Resep"),
                    res.getString("ID_kacamata"),
                    res.getString("Cara_pembelian"),
                    res.getString("Tgl_kirim"),
                    res.getString("Harga"),
                    res.getString("DP"),
                    res.getString("Angs1"),  
                    res.getString("Angs2"),
                    res.getString("Angs3")
                });
                tabeltransaksi.setModel(tbl);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String id_transaksi = txtidtransaksi.getText();
        Object id_petugas = jcombo_idpetugas.getSelectedItem();
        Object id_konsumen = jcombo_idkonsumen.getSelectedItem();
        Object id_resep = jcombo_idresep.getSelectedItem();
        Object id_kacamata = jcombo_idkacamata.getSelectedItem();
        Object cara_pembelian = jcombo_carapembelian.getSelectedItem();
        Object tanggal_kirim = date;
        String harga = txtharga.getText();
        String dp = txtdp.getText();
        String angs1 = txtangs1.getText();
        String angs2 = txtangs2.getText();
        String angs3 = txtangs3.getText();
        
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            statement.executeUpdate("insert into transaksi VALUES ('" +id_transaksi+ "', '"
                +id_petugas+ "', '" +id_konsumen+ "', '" +id_resep+"','" +id_kacamata+ "','" +cara_pembelian+                                
                    "','" +date+ "','" +harga+ "','" +dp+ "','" +angs1+ "','" +angs2+ "','" +angs3+"');");
                statement.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
            System.out.println(e.getMessage());
        }
        datatable();        
        kosong();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new form_kacamata().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String id_transaksi = txtidtransaksi.getText();
        
        try {
            Statement statement = (Statement)connect.GetConnection() .createStatement();
            statement.executeUpdate("DELETE from transaksi where ID_Transaksi=('" +id_transaksi+ "');");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            txtidtransaksi.setText("");
            String ID_Petugas = null;
            String ID_Konsumen = null;
            String ID_Resep = null;
            String ID_Kacamata = null;
            String Cara_pembelian = null;
            String Tgl_kirim = null;
            txtharga.setText("");
            txtdp.setText("");
            txtangs1.setText("");
            txtangs2.setText("");
            txtangs3.setText("");
            txtidtransaksi.requestFocus();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        datatable();

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        Connection conn = null;
        try {    
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cahaya_permata_optical", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }    
         
        String file = "F:\\NetBeansProjects\\Kelompok5\\src\\report\\struk.jrxml";
        JasperReport jr;
        HashMap parameter = new HashMap();
        try {
            parameter.put("kode", txtidtransaksi.getText());
            jr = JasperCompileManager.compileReport(file);           
            JasperPrint jp = JasperFillManager.fillReport(jr,parameter, conn);
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnprintActionPerformed

    private void txtangs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtangs3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtangs3ActionPerformed
   
      String date;
    private void jdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdatePropertyChange
        try{
            if(jdate.getDate() !=null){
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            date = String.valueOf(pattern.format(jdate.getDate()));
            }
        }
        catch (Exception e){
        }
    }//GEN-LAST:event_jdatePropertyChange

    private void paneldashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMouseClicked
        new dashboard().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_paneldashboardMouseClicked

    private void paneldashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paneldashboardMousePressed

    private void paneltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltransaksiMouseClicked
        new form_transaksi().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_paneltransaksiMouseClicked

    private void paneltransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltransaksiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paneltransaksiMousePressed

    private void panelkacamataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkacamataMouseClicked
        new form_kacamata().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_panelkacamataMouseClicked

    private void panelkacamataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkacamataMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelkacamataMousePressed

    private void panelresepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelresepMouseClicked
        new form_resep().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_panelresepMouseClicked

    private void panelresepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelresepMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelresepMousePressed

    private void panelkonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkonsumenMouseClicked
        new form_konsumen().setVisible(true);
        dispose();//
    }//GEN-LAST:event_panelkonsumenMouseClicked

    private void panelkonsumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkonsumenMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelkonsumenMousePressed

    private void panelreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelreportMouseClicked
        Connection conn = null;
        try {    
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cahaya_permata_optical", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        String file = "F:\\NetBeansProjects\\Kelompok5\\src\\report\\report1.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport(file);           
            JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_panelreportMouseClicked

    private void panelreportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelreportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelreportMousePressed

    private void jcombo_idresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_idresepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombo_idresepActionPerformed

    private void panelpetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpetugasMouseClicked
        new form_petugas().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelpetugasMouseClicked
 
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
            java.util.logging.Logger.getLogger(form_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new form_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcombo_carapembelian;
    private javax.swing.JComboBox<String> jcombo_idkacamata;
    private javax.swing.JComboBox<String> jcombo_idkonsumen;
    private javax.swing.JComboBox<String> jcombo_idpetugas;
    private javax.swing.JComboBox<String> jcombo_idresep;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pane3;
    private javax.swing.JPanel pane4;
    private javax.swing.JPanel pane5;
    private javax.swing.JPanel pane6;
    private javax.swing.JPanel paneldashboard;
    private javax.swing.JPanel panelkacamata;
    private javax.swing.JPanel panelkonsumen;
    private javax.swing.JPanel panelpetugas;
    private javax.swing.JPanel panelreport;
    private javax.swing.JPanel panelresep;
    private javax.swing.JPanel paneltransaksi;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JTextField txtangs1;
    private javax.swing.JTextField txtangs2;
    private javax.swing.JTextField txtangs3;
    private javax.swing.JTextField txtdp;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidtransaksi;
    // End of variables declaration//GEN-END:variables
}

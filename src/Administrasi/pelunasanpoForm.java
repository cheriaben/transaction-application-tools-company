/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrasi;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cheria
 */
public class pelunasanpoForm extends javax.swing.JFrame {
String invoice, idjual, idpo, carabayar="Cash", notrans="-";
int gtotal, sisa;
ResultSet rs;
        Statement st;
        Connection con;
    /**
     * Creates new form adminForm
     */
    public pelunasanpoForm() {
        initComponents();
         setLocationRelativeTo(null);
         jDialog1.setLocationRelativeTo(null);
         jDialog1.setTitle("Pilih Metode Pembayaran");
         setVisible(true);
         setTitle("Pelunasan Pre Order");
         txttrans.setEditable(false);
         lblcara.setText(carabayar+"/"+notrans);
         connect();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/radhasankara/icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbPembayaran = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttrans = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtinvoice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbltotalbeli = new javax.swing.JLabel();
        lblsisa = new javax.swing.JLabel();
        lblrp2 = new javax.swing.JLabel();
        lblhasilsisa = new javax.swing.JLabel();
        btnlunas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpesanan = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblcust = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblmetode = new javax.swing.JLabel();
        lblcara = new javax.swing.JLabel();

        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(400, 225));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 225));

        jButton3.setBackground(new java.awt.Color(0, 150, 0));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(198, 0, 0));
        jButton4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbPembayaran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPembayaran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Cek", "Transfer" }));
        cbPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPembayaranActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Cara Pembayaran:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("No. Transaksi     :");

        txttrans.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttrans.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(txttrans, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttrans, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Radha Sankara");
        jLabel3.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Masukkan Nomor Invoice");

        txtinvoice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total Pembelian:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Rp.");

        lbltotalbeli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltotalbeli.setText("0");

        lblsisa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsisa.setText("Sisa                     :");

        lblrp2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblrp2.setText("Rp.");

        lblhasilsisa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblhasilsisa.setText("0");

        btnlunas.setBackground(new java.awt.Color(0, 0, 82));
        btnlunas.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        btnlunas.setForeground(new java.awt.Color(255, 255, 255));
        btnlunas.setText("Lunas");
        btnlunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlunasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Pesanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblpesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Jumlah", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblpesanan);
        if (tblpesanan.getColumnModel().getColumnCount() > 0) {
            tblpesanan.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblpesanan.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblpesanan.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblpesanan.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        btnsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radhasankara/search_30x30.jpg"))); // NOI18N
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Nama Customer:");

        lblcust.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Metode Pembayaran");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblmetode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblmetode.setText("Metode Pembayaran:");

        lblcara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblmetode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblcara, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcust, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lbltotalbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblsisa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblrp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblhasilsisa, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(btnlunas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmetode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotalbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhasilsisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnlunas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void connect() {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/radhasankara", "root", "");
                st = con.createStatement();
                System.out.println("Database connected");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    private void btnlunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlunasActionPerformed
        // TODO add your handling code here:
        try{
            int stocknew = 0;
            String carabayar = cbPembayaran.getSelectedItem().toString();
            String notrans = txttrans.getText();
            
            for(int k = 0; k<tblpesanan.getRowCount();k++){
            idjual = tblpesanan.getValueAt(k, 1).toString();
            idpo = tblpesanan.getValueAt(k, 0).toString();
            String idbarang = tblpesanan.getValueAt(k, 2).toString();
            int jumlah = Integer.parseInt(tblpesanan.getValueAt(k, 4).toString());
            System.out.println(idpo);
            System.out.println(idbarang);
            st.executeUpdate("update tblpenjualan set cara_pembayaran ='"+carabayar+"', no_transaksi ='"+notrans+"', tanggal_jual = sysdate(), status_penjualan = 'Lunas' where ID_penjualan ='"+idjual+"'");
            st.executeUpdate("update tblpreorder set sisa_pembayaran = 0 where ID_PO = '"+idpo+"'");
            connect();
            rs = st.executeQuery("select ID_barang, stock from tblinventory where ID_barang = '"+idbarang+"'");
            while(rs.next()){
            stocknew = Integer.parseInt(rs.getString(2)) - jumlah;
            }
            connect();
            st.executeUpdate("update tblinventory set stock = "+stocknew+" where ID_barang = '"+idbarang+"'");
            
            }
            
            JOptionPane.showMessageDialog(this,"Pelunasan berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Pelunasan gagal, silahkan coba lagi!", "Gagal", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_btnlunasActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        gtotal = 0;
        idpo = null;
        invoice ="";
        idjual ="";
        lblcust.setText("");
        lblhasilsisa.setText("0");
        lbltotalbeli.setText("0");
        
        DefaultTableModel tbl1 = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column){
        return false;
        }
        };
        tbl1.addColumn("ID PO");
        tbl1.addColumn("ID Jual");
        tbl1.addColumn("ID Barang");
        tbl1.addColumn("Nama Barang");
        tbl1.addColumn("Jumlah");
        tbl1.addColumn("Total Harga");
        
        try{
        connect();
        invoice = txtinvoice.getText();
        rs = st.executeQuery("select j.ID_penjualan, invoice, j.ID_customer, nama_customer, j.ID_barang, nama_barang, jumlah_jual, harga_jual, status_penjualan, sisa_pembayaran, ID_PO from tblpenjualan j, tblpreorder p, tblinventory i, tblcustomers c where  status_penjualan = 'Belum Lunas' AND j.ID_barang = i.ID_barang AND j.ID_customer = c.ID_customer AND j.ID_penjualan = p.ID_penjualan AND invoice ='"+invoice+"'");
        while(rs.next()){
            tbl1.addRow(new Object[]{
                rs.getString(11),
                rs.getString(1),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                Integer.parseInt(rs.getString(8))*Integer.parseInt(rs.getString(7))
        });
        sisa = Integer.parseInt(rs.getString(10));
        lblhasilsisa.setText(rs.getString(10));
        lblcust.setText(rs.getString(4));
        idpo = rs.getString(11);
        System.out.println(idpo);
        }
        tblpesanan.setModel(tbl1);

        tblpesanan.getColumnModel().getColumn(0).setMinWidth(0);
        tblpesanan.getColumnModel().getColumn(0).setMaxWidth(0);
        tblpesanan.getColumnModel().getColumn(1).setMinWidth(0);
        tblpesanan.getColumnModel().getColumn(1).setMaxWidth(0);
        tblpesanan.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblpesanan.getColumnModel().getColumn(3).setPreferredWidth(350);
        tblpesanan.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblpesanan.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        tblpesanan.getColumnModel().getColumn(0).setResizable(false);
        tblpesanan.getColumnModel().getColumn(1).setResizable(false);
        tblpesanan.getColumnModel().getColumn(2).setResizable(false);
        tblpesanan.getColumnModel().getColumn(3).setResizable(false);
        tblpesanan.getColumnModel().getColumn(4).setResizable(false);
        tblpesanan.getColumnModel().getColumn(5).setResizable(false);
        
        tblpesanan.getTableHeader().setReorderingAllowed(false);
        

        
        System.out.println(idpo);
        if(idpo==null){
            
           JOptionPane.showMessageDialog(this,"Nomor invoice tidak dapat ditemukan!", "Tidak ditemukan", JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
        for(int i=0;i<tblpesanan.getRowCount();i++){
            int total = Integer.parseInt(tblpesanan.getValueAt(i, 5).toString());
            gtotal = gtotal+total;
            System.out.println(gtotal);
        }
        lbltotalbeli.setText(Integer.toString(gtotal));
        }
        }
        
        catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void cbPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPembayaranActionPerformed
        // TODO add your handling code here:
        int index = cbPembayaran.getSelectedIndex();
        if(index == 0){
            txttrans.setEditable(false);
        }
        else{
            txttrans.setEditable(true);
        }
    }//GEN-LAST:event_cbPembayaranActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        carabayar = cbPembayaran.getSelectedItem().toString();
        notrans = txttrans.getText();
        lblcara.setText(carabayar+"/"+notrans);
        jDialog1.hide();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jDialog1.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jDialog1.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlunas;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cbPembayaran;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcara;
    private javax.swing.JLabel lblcust;
    private javax.swing.JLabel lblhasilsisa;
    private javax.swing.JLabel lblmetode;
    private javax.swing.JLabel lblrp2;
    private javax.swing.JLabel lblsisa;
    private javax.swing.JLabel lbltotalbeli;
    private javax.swing.JTable tblpesanan;
    private javax.swing.JTextField txtinvoice;
    private javax.swing.JTextField txttrans;
    // End of variables declaration//GEN-END:variables
}
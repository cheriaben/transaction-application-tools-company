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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cheria
 */
public class cashierForm extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    int gtotal = 0,jumlah,hargasatuan;
    String idbarang,idjual,idcust,invoice;
    
                        
    
    public cashierForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        connect();
        tampilmenu();
        tabelpesanan();
        tampildata();
        setTitle("Kasir User");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/radhasankara/icon.png")));
       
    }
        
        
        public void connect(){
            
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/radhasankara","root","");
            st = con.createStatement();
            
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed");
            System.out.println(e.getMessage());
        }
    }
        
        public void tampilmenu(){
        DefaultTableModel tbl1 = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
            return false;
        }
        };
        tbl1.addColumn("ID Barang");
        tbl1.addColumn("Nama Barang");
        tbl1.addColumn("Stock");
        tbl1.addColumn("Harga Satuan");
        
        
        try{
        connect();
        rs = st.executeQuery("SELECT i.ID_barang, nama_barang, stock, harga_beli * 1.5 FROM tblinventory i INNER JOIN (select ID_barang, harga_beli, MAX(tanggal_beli) from tblpembelian GROUP BY ID_barang) b WHERE i.ID_barang = b.ID_barang AND status_barang = 'Available' AND stock > 0");
            while (rs.next())
            {
                tbl1.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)
         
            });
            }
            
        
        
        tblmenu.setModel(tbl1);
        tblmenu.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblmenu.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblmenu.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblmenu.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblmenu.getColumnModel().getColumn(0).setResizable(false);
        tblmenu.getColumnModel().getColumn(1).setResizable(false);
        tblmenu.getColumnModel().getColumn(2).setResizable(false);
        tblmenu.getColumnModel().getColumn(3).setResizable(false);

        
}
        catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error");  
        }
        }
        
        public void tabelpesanan(){
            DefaultTableModel tbl2 = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
            return false;
        }
            };
        tbl2.addColumn("ID Barang");
        tbl2.addColumn("Nama Barang");
        tbl2.addColumn("Jumlah");
        tbl2.addColumn("Total Harga");
        tblpesanan.setModel(tbl2);
        }
        
        public void tampildata(){
        String j = "";    
            
        
  
        try{
            connect();
            rs = st.executeQuery("select MAX(invoice) from tblpenjualan");
             while(rs.next()){
                    j = rs.getString(1); 
             }
             if(j==null){
                 j = "1";
                 invoice = String.format("%05d", Integer.parseInt(j));
             }
             else{
            int k = Integer.parseInt(j)+1;
            invoice = String.format("%05d", k);
             }
            lblNoInvoice.setText(invoice);
             
            
           rs = st.executeQuery("select ID_customer, nama_customer from tblcustomers where status_customer = 'User'");
           cbNama.removeAllItems();
            while(rs.next()){
            cbNama.addItem(rs.getString(2) + "/" +rs.getString(1));
            }
             
            
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error");  
        }
        

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpesanan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmenu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNoInvoice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnbayar = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        cbNama = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbltotalbeli = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblkembali = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1180, 760));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Radha Sankara");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 0, 560, 120);

        tblpesanan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
            tblpesanan.getColumnModel().getColumn(0).setResizable(false);
            tblpesanan.getColumnModel().getColumn(1).setResizable(false);
            tblpesanan.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblpesanan.getColumnModel().getColumn(2).setResizable(false);
            tblpesanan.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblpesanan.getColumnModel().getColumn(3).setResizable(false);
            tblpesanan.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(720, 220, 600, 190);

        tblmenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Stock", "Harga Satuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblmenu);
        if (tblmenu.getColumnModel().getColumnCount() > 0) {
            tblmenu.getColumnModel().getColumn(0).setResizable(false);
            tblmenu.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblmenu.getColumnModel().getColumn(1).setResizable(false);
            tblmenu.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblmenu.getColumnModel().getColumn(2).setResizable(false);
            tblmenu.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblmenu.getColumnModel().getColumn(3).setResizable(false);
            tblmenu.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 220, 640, 430);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Bayar                  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(730, 540, 210, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Invoice No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 130, 100, 30);

        lblNoInvoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(lblNoInvoice);
        lblNoInvoice.setBounds(180, 130, 100, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 200, 660, 460);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Pesanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.add(jPanel4);
        jPanel4.setBounds(710, 200, 620, 220);

        btnbayar.setBackground(new java.awt.Color(0, 0, 82));
        btnbayar.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        btnbayar.setForeground(new java.awt.Color(255, 255, 255));
        btnbayar.setText("Bayar");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbayar);
        btnbayar.setBounds(900, 660, 300, 50);

        btndel.setBackground(new java.awt.Color(198, 0, 0));
        btndel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel);
        btndel.setBounds(1130, 430, 200, 40);

        btnadd.setBackground(new java.awt.Color(0, 150, 0));
        btnadd.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd);
        btnadd.setBounds(490, 670, 200, 40);

        cbNama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbNama);
        cbNama.setBounds(180, 160, 350, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Clear All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 100, 90, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Jumlah:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 670, 70, 30);

        lbltotalbeli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(lbltotalbeli);
        lbltotalbeli.setBounds(990, 490, 330, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total Pembelian:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(730, 490, 210, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Rp.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(940, 540, 50, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Rp.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(940, 490, 50, 50);

        txtbayar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtbayar);
        txtbayar.setBounds(990, 540, 330, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Kembali              :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(730, 590, 210, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Rp.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(940, 590, 50, 50);

        lblkembali.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(lblkembali);
        lblkembali.setBounds(990, 590, 330, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nama Customer:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 160, 140, 30);

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(410, 670, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbl2 = (DefaultTableModel) tblpesanan.getModel();
        gtotal = 0;
            int i = tblmenu.getSelectedRow();
            int stock = Integer.parseInt(tblmenu.getValueAt(i, 2).toString());
            int jumlahbarang = Integer.parseInt(jSpinner1.getValue().toString());
            String id = tblmenu.getValueAt(i, 0).toString();
            String nama = tblmenu.getValueAt(i, 1).toString();
            int harga = Integer.parseInt(tblmenu.getValueAt(i, 3).toString());
            int totalharga = jumlahbarang*harga;
            boolean check = false;
            String idcocok="";
            int jmlcocok=0;
            int row=0;
            if(jumlahbarang!=0){
                
                for(int j=0;j<tblpesanan.getRowCount();j++){
                    if(id.equals(tblpesanan.getValueAt(j, 0).toString())){
                        check = true;
                        idcocok = tblpesanan.getValueAt(j, 0).toString();
                        jmlcocok = Integer.parseInt(tblpesanan.getValueAt(j, 2).toString());
                        row = j;
                        
                    }

                    
                }
                if(check==false){
                
        tbl2.addRow(new Object[]{
                id,
                nama,
                jumlahbarang,
                totalharga
         
            });

            }
                else{

                    if(stock<(jmlcocok+jumlahbarang)){
                        JOptionPane.showMessageDialog(this, "Pembelian anda melebihi stock yang ada", "Gagal", JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                        tblpesanan.setValueAt((jmlcocok+jumlahbarang), row, 2);
                        tblpesanan.setValueAt((jmlcocok+jumlahbarang)*harga, row, 3);

                }
            }
            }
            for(int j=0;j<tblpesanan.getRowCount();j++){
            int total = Integer.parseInt(tblpesanan.getValueAt(j, 3).toString());
            gtotal = gtotal+total;
            lbltotalbeli.setText(Integer.toString(gtotal));
        }
        
        
        
        tblpesanan.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblpesanan.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblpesanan.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblpesanan.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblpesanan.getColumnModel().getColumn(0).setResizable(false);
        tblpesanan.getColumnModel().getColumn(1).setResizable(false);
        tblpesanan.getColumnModel().getColumn(2).setResizable(false);
        tblpesanan.getColumnModel().getColumn(3).setResizable(false);
        tblpesanan.setModel(tbl2);
            
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        // TODO add your handling code here:
        int stocknew;
        String idbar;
        int uangbayar = Integer.parseInt(txtbayar.getText());
        int kembalian = uangbayar-gtotal;
        String cust = cbNama.getSelectedItem().toString();
        String[] parts = cust.split("/");
        idcust = parts[1];
        int max = 0;
        
        
        if(kembalian<0){
            JOptionPane.showMessageDialog(this, "Anda salah memasukkan jumlah uang!", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        else{
            lblkembali.setText(Integer.toString(kembalian));
            for(int i=0;i<tblpesanan.getRowCount();i++){
                idbarang = tblpesanan.getValueAt(i, 0).toString();
                jumlah = Integer.parseInt(tblpesanan.getValueAt(i, 2).toString());
                hargasatuan = Integer.parseInt(tblpesanan.getValueAt(i, 3).toString())/jumlah;
                try{
        rs = st.executeQuery("select MAX(ID_penjualan) from tblpenjualan");
        while(rs.next()){
        String idjuallengkap = rs.getString(1);
        
        if(idjuallengkap == null){
            idjual= String.format("%04d", 1);
        }
        else{
        String[] idjualinc = idjuallengkap.split("-");
        int idjual2 = Integer.parseInt(idjualinc[1]);
        idjual2 = idjual2+1;
        System.out.println(idjual2);
        idjual= String.format("%04d", idjual2);
        }
        }
        }
        catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error Inc");  
        }
            
            
            try{
            st.executeUpdate("insert into tblpenjualan values('JUA-"+idjual+"','"+invoice+"','"+idcust+"','"+idbarang+"',"+jumlah+","+hargasatuan+",'Cash','-',sysdate(),'Lunas')");
            connect();
            rs = st.executeQuery("select ID_barang, stock from tblinventory where ID_barang = '"+idbarang+"'");
            while(rs.next()){
            stocknew = Integer.parseInt(rs.getString(2)) - jumlah;
            idbar = rs.getString(1);
            connect();
            st.executeUpdate("update tblinventory set stock = "+stocknew+" where ID_barang = '"+idbar+"'");
            }
            }
            
            catch(Exception e){
                e.printStackTrace();
            }
            }
            try{
            
            connect();
        rs = st.executeQuery("SELECT invoice, nama_customer, nama_barang, jumlah_jual, harga_jual, jumlah_jual * harga_jual, alamat, kelurahan, kecamatan, kota,  kodepos, cara_pembayaran, no_transaksi from tblpenjualan j, tblcustomers c, tblinventory i WHERE j.ID_barang = i.ID_barang AND j.ID_customer = c.ID_customer AND status_penjualan = 'Lunas' AND invoice ='"+invoice+"'");
        JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(rs);
        System.out.println("Filling report...");
        JasperFillManager.fillReportToFile("C:\\Users\\Cheria\\Documents\\NetBeansProjects\\RadhaSanakaraApp\\src\\Administrasi\\BuktiPenjualanCust.jasper", new HashMap(), resultSetDataSource);
        JasperViewer jv = new JasperViewer("C:\\Users\\Cheria\\Documents\\NetBeansProjects\\RadhaSanakaraApp\\src\\Administrasi\\BuktiPenjualanCust.jrprint", false, false);
        jv.setVisible(true);
        JasperPrintManager.printReport("C:\\Users\\Cheria\\Documents\\NetBeansProjects\\RadhaSanakaraApp\\src\\Administrasi\\BuktiPenjualanCust.jrprint", false);
        System.out.println("Done!");
        rs.close();
        st.close();
        con.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        
        btnadd.setEnabled(false);
        btndel.setEnabled(false);
        btnbayar.setEnabled(false);
        tampilmenu();
        }
        
        
    }//GEN-LAST:event_btnbayarActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
            gtotal=0;
            int row = tblpesanan.getSelectedRow();
            DefaultTableModel tbl2 = (DefaultTableModel) tblpesanan.getModel();
            tbl2.removeRow(row);
            tblpesanan.setModel(tbl2);
            if(tblpesanan.getRowCount() != 0){
            for(int i=0;i<tblpesanan.getRowCount();i++){
            int total = Integer.parseInt(tblpesanan.getValueAt(i, 3).toString());
            gtotal = gtotal+total;
            
        }
            }
        lbltotalbeli.setText(Integer.toString(gtotal));
    }//GEN-LAST:event_btndelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        cashierForm cashierrespawn = new cashierForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btndel;
    private javax.swing.JComboBox cbNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblNoInvoice;
    private javax.swing.JLabel lblkembali;
    private javax.swing.JLabel lbltotalbeli;
    private javax.swing.JTable tblmenu;
    private javax.swing.JTable tblpesanan;
    private javax.swing.JTextField txtbayar;
    // End of variables declaration//GEN-END:variables
}

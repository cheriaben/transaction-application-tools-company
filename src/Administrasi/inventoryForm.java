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
/**
 *
 * @author Cheria
 */
public class inventoryForm extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form inventoryForm
     */
    public inventoryForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("Data Inventory");
        connect();
        tampildata();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/radhasankara/icon.png")));
    }

    public void connect() {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/radhasankara","root","");
        st = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Connection Failed");
        System.out.println(e.getMessage());
        }
    }
    
    public void tampildata() {
        DefaultTableModel tbl1 = new DefaultTableModel();
        tbl1.addColumn("ID_barang");
        tbl1.addColumn("Nama Barang");
        tbl1.addColumn("Jenis");
        tbl1.addColumn("Merek");
        tbl1.addColumn("Tipe");
        tbl1.addColumn("Satuan");
        tbl1.addColumn("Jumlah Stock");
        tbl1.addColumn("Status");
        try{
            connect();
            String sql= "select ID_barang, nama_barang, jenis, merek, tipe, satuan, stock, status_barang from tblinventory i, tbljenis j, tblmerek m, tbltipe t, tblsatuan s where i.ID_tipe = t.ID_tipe AND i.ID_satuan = s.ID_satuan AND j.ID_jenis = t.ID_jenis AND m.ID_merek = t.ID_merek";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl1.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
                });
            }
        tblInventory.setModel(tbl1);
        tblInventory.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblInventory.getColumnModel().getColumn(1).setPreferredWidth(350);
        tblInventory.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblInventory.getColumnModel().getColumn(7).setPreferredWidth(100);
        
        tblInventory.getColumnModel().getColumn(0).setResizable(false);
        tblInventory.getColumnModel().getColumn(1).setResizable(false);
        tblInventory.getColumnModel().getColumn(2).setResizable(false);
        tblInventory.getColumnModel().getColumn(3).setResizable(false);
        tblInventory.getColumnModel().getColumn(4).setResizable(false);
        tblInventory.getColumnModel().getColumn(5).setResizable(false);
        tblInventory.getColumnModel().getColumn(6).setResizable(false);
        tblInventory.getColumnModel().getColumn(7).setResizable(false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ada Kesalahan");
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
        tblInventory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRestock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Radha Sankara");

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Jenis", "Merek", "Tipe", "Satuan", "Jumlah Stock", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(0).setPreferredWidth(300);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblInventory.getColumnModel().getColumn(3).setResizable(false);
            tblInventory.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblInventory.getColumnModel().getColumn(4).setResizable(false);
            tblInventory.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblInventory.getColumnModel().getColumn(5).setResizable(false);
            tblInventory.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblInventory.getColumnModel().getColumn(6).setResizable(false);
            tblInventory.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        btnAdd.setBackground(new java.awt.Color(0, 150, 0));
        btnAdd.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setPreferredSize(new java.awt.Dimension(200, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(206, 113, 12));
        btnUpdate.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRestock.setBackground(new java.awt.Color(0, 0, 0));
        btnRestock.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnRestock.setForeground(new java.awt.Color(255, 255, 255));
        btnRestock.setText("Restock");
        btnRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addinventoryForm addinventoryform = new addinventoryForm();
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int sel = tblInventory.getSelectedRow();
        String IDbarang = tblInventory.getValueAt(sel, 0).toString();
        updateinventoryForm updateinventoryform = new updateinventoryForm();
        updateinventoryform.setID(IDbarang);
        dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestockActionPerformed
        // TODO add your handling code here:
        int sel = tblInventory.getSelectedRow();
        String IDbarang = tblInventory.getValueAt(sel, 0).toString();
        restockinventoryForm restockinventoryform = new restockinventoryForm();
        restockinventoryform.setID(IDbarang);
        dispose();
    }//GEN-LAST:event_btnRestockActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRestock;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables
}

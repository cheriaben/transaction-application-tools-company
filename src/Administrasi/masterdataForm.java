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
public class masterdataForm extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
        String jeniss;
    /**
     * Creates new form masterdataForm
     */
    public masterdataForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("Data Master");
        connect();
        tampildataJenis();
        tampildataMerek();
        tampildataTipe();
        tampildataSatuan();
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
    
    public void tampildataJenis() {
        DefaultTableModel tbl1 = new DefaultTableModel();
        tbl1.addColumn("ID Jenis");
        tbl1.addColumn("Jenis Barang");
        
        try{
            connect();
            String sql= "select jenis, ID_jenis from tbljenis";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl1.addRow(new Object[] {
                    rs.getString(2),
                    rs.getString(1)
                    
                });
            }
            tblJenis.setModel(tbl1);
            
            tblJenis.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblJenis.getColumnModel().getColumn(1).setPreferredWidth(100);
            
            tblJenis.getColumnModel().getColumn(0).setResizable(false);
            tblJenis.getColumnModel().getColumn(1).setResizable(false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ada Kesalahan");
        }
    }
    
    public void tampildataMerek() {
        DefaultTableModel tbl1 = new DefaultTableModel();
        tbl1.addColumn("ID Merek");
        tbl1.addColumn("Merek Barang");
        try{
            connect();
            String sql= "select merek, ID_merek from tblmerek";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl1.addRow(new Object[] {
                    rs.getString(2),
                    rs.getString(1)
                });
            }
            tblMerek.setModel(tbl1);
            tblMerek.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblMerek.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblMerek.getColumnModel().getColumn(0).setResizable(false);
            tblMerek.getColumnModel().getColumn(1).setResizable(false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ada Kesalahan");
        }
    }
    
    public void tampildataTipe() {
        DefaultTableModel tbl1 = new DefaultTableModel();
        tbl1.addColumn("ID Tipe");
        tbl1.addColumn("Jenis Barang");
        tbl1.addColumn("Merek Barang");
        tbl1.addColumn("Tipe Barang");
        try{
            connect();
            String sql= "select ID_tipe, tipe, jenis, merek from tbltipe t, tbljenis j, tblmerek m where j.ID_jenis = t.ID_jenis AND m.ID_merek = t.ID_merek";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl1.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(2)
                });
            }
            tblTipe.setModel(tbl1);
            tblTipe.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblTipe.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblTipe.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblTipe.getColumnModel().getColumn(3).setPreferredWidth(150);
            
            tblTipe.getColumnModel().getColumn(0).setResizable(false);
            tblTipe.getColumnModel().getColumn(1).setResizable(false);
            tblTipe.getColumnModel().getColumn(2).setResizable(false);
            tblTipe.getColumnModel().getColumn(3).setResizable(false);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ada Kesalahan");
        }
    }
    
    public void tampildataSatuan() {
        DefaultTableModel tbl1 = new DefaultTableModel();
        tbl1.addColumn("ID Satuan");
        tbl1.addColumn("Satuan");
        try{
            connect();
            String sql= "select satuan, ID_satuan from tblsatuan";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl1.addRow(new Object[] {
                    rs.getString(2),
                    rs.getString(1)
                });
            }
            tblSatuan.setModel(tbl1);
            tblSatuan.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblSatuan.getColumnModel().getColumn(1).setPreferredWidth(100);
            
            tblSatuan.getColumnModel().getColumn(0).setResizable(false);
            tblSatuan.getColumnModel().getColumn(1).setResizable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJenis = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSatuan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMerek = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTipe = new javax.swing.JTable();
        btnAddSatuan = new javax.swing.JButton();
        btnUpdateMerek = new javax.swing.JButton();
        btnAddJenis = new javax.swing.JButton();
        btnAddMerek = new javax.swing.JButton();
        btnAddTipe = new javax.swing.JButton();
        btnUpdateTipe = new javax.swing.JButton();
        btnUpdateJenis = new javax.swing.JButton();
        btnUpdateSatuan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Radha Sankara");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Jenis Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblJenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Jenis", "Jenis Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJenis);
        if (tblJenis.getColumnModel().getColumnCount() > 0) {
            tblJenis.getColumnModel().getColumn(0).setResizable(false);
            tblJenis.getColumnModel().getColumn(1).setResizable(false);
            tblJenis.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Satuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblSatuan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Satuan", "Satuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSatuan);
        if (tblSatuan.getColumnModel().getColumnCount() > 0) {
            tblSatuan.getColumnModel().getColumn(0).setResizable(false);
            tblSatuan.getColumnModel().getColumn(1).setResizable(false);
            tblSatuan.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Merek Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblMerek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Merek", "Merek Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMerek);
        if (tblMerek.getColumnModel().getColumnCount() > 0) {
            tblMerek.getColumnModel().getColumn(0).setResizable(false);
            tblMerek.getColumnModel().getColumn(1).setResizable(false);
            tblMerek.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Tipe Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblTipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Tipe", "Jenis Barang", "Merek Barang", "Tipe Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblTipe);
        if (tblTipe.getColumnModel().getColumnCount() > 0) {
            tblTipe.getColumnModel().getColumn(0).setResizable(false);
            tblTipe.getColumnModel().getColumn(1).setResizable(false);
            tblTipe.getColumnModel().getColumn(3).setResizable(false);
            tblTipe.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddSatuan.setBackground(new java.awt.Color(0, 150, 0));
        btnAddSatuan.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnAddSatuan.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSatuan.setText("Add Satuan");
        btnAddSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSatuanActionPerformed(evt);
            }
        });

        btnUpdateMerek.setBackground(new java.awt.Color(206, 113, 12));
        btnUpdateMerek.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnUpdateMerek.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMerek.setText("Update Merek");
        btnUpdateMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMerekActionPerformed(evt);
            }
        });

        btnAddJenis.setBackground(new java.awt.Color(0, 150, 0));
        btnAddJenis.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnAddJenis.setForeground(new java.awt.Color(255, 255, 255));
        btnAddJenis.setText("Add Jenis");
        btnAddJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJenisActionPerformed(evt);
            }
        });

        btnAddMerek.setBackground(new java.awt.Color(0, 150, 0));
        btnAddMerek.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnAddMerek.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMerek.setText("Add Merek");
        btnAddMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMerekActionPerformed(evt);
            }
        });

        btnAddTipe.setBackground(new java.awt.Color(0, 150, 0));
        btnAddTipe.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnAddTipe.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTipe.setText("Add Tipe");
        btnAddTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTipeActionPerformed(evt);
            }
        });

        btnUpdateTipe.setBackground(new java.awt.Color(206, 113, 12));
        btnUpdateTipe.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnUpdateTipe.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateTipe.setText("Update Tipe");
        btnUpdateTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTipeActionPerformed(evt);
            }
        });

        btnUpdateJenis.setBackground(new java.awt.Color(206, 113, 12));
        btnUpdateJenis.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnUpdateJenis.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateJenis.setText("Update Jenis");
        btnUpdateJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateJenisActionPerformed(evt);
            }
        });

        btnUpdateSatuan.setBackground(new java.awt.Color(206, 113, 12));
        btnUpdateSatuan.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        btnUpdateSatuan.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSatuan.setText("Update Satuan");
        btnUpdateSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSatuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddJenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAddMerek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddTipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddSatuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateSatuan))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

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

    private void btnAddJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJenisActionPerformed
        // TODO add your handling code here:
        addjenisForm add = new addjenisForm();
        dispose();
    }//GEN-LAST:event_btnAddJenisActionPerformed

    private void btnUpdateJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateJenisActionPerformed
        // TODO add your handling code here:
        int sel = tblJenis.getSelectedRow();
        String IDjenis = tblJenis.getValueAt(sel, 0).toString();
        updatejenisForm updatejenisform = new updatejenisForm();
        updatejenisform.setID(IDjenis);
        dispose();
    }//GEN-LAST:event_btnUpdateJenisActionPerformed

    private void btnAddMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMerekActionPerformed
        // TODO add your handling code here:
        addmerekForm add = new addmerekForm();
        dispose();
    }//GEN-LAST:event_btnAddMerekActionPerformed

    private void btnUpdateMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMerekActionPerformed
        // TODO add your handling code here:
        int sel = tblMerek.getSelectedRow();
        String IDmerek = tblMerek.getValueAt(sel, 0).toString();
        updatemerekForm updatemerekform = new updatemerekForm();
        updatemerekform.setID(IDmerek);
        dispose();

    }//GEN-LAST:event_btnUpdateMerekActionPerformed

    private void btnAddTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTipeActionPerformed
        // TODO add your handling code here:
        addtipeForm add = new addtipeForm();
        dispose();
    }//GEN-LAST:event_btnAddTipeActionPerformed

    private void btnUpdateTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTipeActionPerformed
        // TODO add your handling code here:
        int sel = tblTipe.getSelectedRow();
        String IDtipe = tblTipe.getValueAt(sel, 0).toString();
        updatetipeForm updatetipeform = new updatetipeForm();
        updatetipeform.setID(IDtipe);
        dispose();
    }//GEN-LAST:event_btnUpdateTipeActionPerformed

    private void btnAddSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSatuanActionPerformed
        // TODO add your handling code here:
        addsatuanForm add = new addsatuanForm();
        dispose();
    }//GEN-LAST:event_btnAddSatuanActionPerformed

    private void btnUpdateSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSatuanActionPerformed
        // TODO add your handling code here:
        int sel = tblSatuan.getSelectedRow();
        String IDsatuan = tblSatuan.getValueAt(sel, 0).toString();
        updatesatuanForm updatesatuanform = new updatesatuanForm();
        updatesatuanform.setID(IDsatuan);
        dispose();
    }//GEN-LAST:event_btnUpdateSatuanActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJenis;
    private javax.swing.JButton btnAddMerek;
    private javax.swing.JButton btnAddSatuan;
    private javax.swing.JButton btnAddTipe;
    private javax.swing.JButton btnUpdateJenis;
    private javax.swing.JButton btnUpdateMerek;
    private javax.swing.JButton btnUpdateSatuan;
    private javax.swing.JButton btnUpdateTipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblJenis;
    private javax.swing.JTable tblMerek;
    private javax.swing.JTable tblSatuan;
    private javax.swing.JTable tblTipe;
    // End of variables declaration//GEN-END:variables
}

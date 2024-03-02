
import com.sun.java.accessibility.util.EventID;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.Query;
import javax.management.modelmbean.ModelMBean;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ventanaAdmin extends javax.swing.JFrame {

    DefaultTableModel modeloTable;

    public ventanaAdmin() {
        initComponents();

        this.setLocationRelativeTo(null);
        modeloTable = (DefaultTableModel) this.jTable1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PM_opcTree = new javax.swing.JPopupMenu();
        MI_refresh = new javax.swing.JMenuItem();
        MI_load = new javax.swing.JMenuItem();
        PM_opcTable = new javax.swing.JPopupMenu();
        MI_clear = new javax.swing.JMenuItem();
        PN_principal = new javax.swing.JPanel();
        LB_enterbutton1 = new javax.swing.JLabel();
        LB_enterbutton = new javax.swing.JLabel();
        TF_comandText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_arhcivos = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MB_File = new javax.swing.JMenu();
        MI_newFile = new javax.swing.JMenuItem();
        MI_ImportFile = new javax.swing.JMenuItem();
        MB_window = new javax.swing.JMenu();
        MB_clear = new javax.swing.JMenu();
        MI_clearLine = new javax.swing.JMenuItem();
        MI_clearTable = new javax.swing.JMenuItem();
        MI_RefreshTree = new javax.swing.JMenuItem();
        MB_help = new javax.swing.JMenu();
        MI_prodInfo = new javax.swing.JMenuItem();
        MI_commandInfo = new javax.swing.JMenuItem();

        MI_refresh.setText("Refresh");
        MI_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_refreshActionPerformed(evt);
            }
        });
        PM_opcTree.add(MI_refresh);

        MI_load.setText("Load");
        MI_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_loadActionPerformed(evt);
            }
        });
        PM_opcTree.add(MI_load);

        MI_clear.setText("Clear Table");
        MI_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_clearActionPerformed(evt);
            }
        });
        PM_opcTable.add(MI_clear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PN_principal.setBackground(new java.awt.Color(204, 204, 204));
        PN_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_enterbutton1.setBackground(new java.awt.Color(102, 102, 102));
        LB_enterbutton1.setForeground(new java.awt.Color(102, 102, 102));
        LB_enterbutton1.setText("           Agregar");
        LB_enterbutton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LB_enterbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LB_enterbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_enterbutton1MouseClicked(evt);
            }
        });
        PN_principal.add(LB_enterbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 120, 50));

        LB_enterbutton.setBackground(new java.awt.Color(102, 102, 102));
        LB_enterbutton.setForeground(new java.awt.Color(102, 102, 102));
        LB_enterbutton.setText("              Enter");
        LB_enterbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LB_enterbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LB_enterbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_enterbuttonMouseClicked(evt);
            }
        });
        PN_principal.add(LB_enterbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 120, 50));
        PN_principal.add(TF_comandText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CSV.Se");
        JT_arhcivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JT_arhcivos.setToolTipText("");
        JT_arhcivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_arhcivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_arhcivos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 66, 180, 480));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "category", "price", "aisle", "bin"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 66, 652, -1));

        PN_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        MB_File.setText("File");
        MB_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB_FileActionPerformed(evt);
            }
        });

        MI_newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_newFile.setText("New File");
        MI_newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_newFileActionPerformed(evt);
            }
        });
        MB_File.add(MI_newFile);

        MI_ImportFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_ImportFile.setText("Import File");
        MI_ImportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ImportFileActionPerformed(evt);
            }
        });
        MB_File.add(MI_ImportFile);

        jMenuBar1.add(MB_File);

        MB_window.setText("Window");

        MB_clear.setText("Clear");

        MI_clearLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_clearLine.setText("Clear Command Line");
        MI_clearLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_clearLineActionPerformed(evt);
            }
        });
        MB_clear.add(MI_clearLine);

        MI_clearTable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_clearTable.setText("Clear Table");
        MB_clear.add(MI_clearTable);

        MB_window.add(MB_clear);

        MI_RefreshTree.setText("Refresh Tree");
        MI_RefreshTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_RefreshTreeActionPerformed(evt);
            }
        });
        MB_window.add(MI_RefreshTree);

        jMenuBar1.add(MB_window);

        MB_help.setText("Help");

        MI_prodInfo.setText("Product Structure");
        MI_prodInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_prodInfoActionPerformed(evt);
            }
        });
        MB_help.add(MI_prodInfo);

        MI_commandInfo.setText("Command Info");
        MI_commandInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_commandInfoActionPerformed(evt);
            }
        });
        MB_help.add(MI_commandInfo);

        jMenuBar1.add(MB_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_clearLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_clearLineActionPerformed
        TF_comandText.setText("");
    }//GEN-LAST:event_MI_clearLineActionPerformed

    private void LB_enterbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_enterbuttonMouseClicked
        try {
            leerCommand();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_LB_enterbuttonMouseClicked

    private void LB_enterbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_enterbutton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_enterbutton1MouseClicked

    private void MI_prodInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_prodInfoActionPerformed
        JOptionPane.showMessageDialog(this,
                "los productos deben ser ingresado por el siguiente orden:\n"
                + "[id, name, category, price, aisle, bin]");
    }//GEN-LAST:event_MI_prodInfoActionPerformed

    private void MI_commandInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_commandInfoActionPerformed
        JOptionPane.showMessageDialog(this,
                "");
    }//GEN-LAST:event_MI_commandInfoActionPerformed

    private void MB_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB_FileActionPerformed
        try {
            crearArchivo();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MB_FileActionPerformed

    private void MI_newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_newFileActionPerformed
        try {
            crearArchivo();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MI_newFileActionPerformed

    private void MI_ImportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ImportFileActionPerformed
        cargarArhcivo();
    }//GEN-LAST:event_MI_ImportFileActionPerformed

    private void MI_RefreshTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_RefreshTreeActionPerformed
        refreshTree();
    }//GEN-LAST:event_MI_RefreshTreeActionPerformed

    private void MI_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_clearActionPerformed
        clearTable();
    }//GEN-LAST:event_MI_clearActionPerformed

    private void MI_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_refreshActionPerformed
        refreshTree();
    }//GEN-LAST:event_MI_refreshActionPerformed

    private void MI_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_loadActionPerformed
        cargarArhcivo();
    }//GEN-LAST:event_MI_loadActionPerformed

    private void JT_arhcivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_arhcivosMouseClicked
        if (evt.isMetaDown()) {
            PM_opcTree.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_JT_arhcivosMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.isMetaDown()) {
            PM_opcTable.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdmin().setVisible(true);
            }
        });
    }

    public void leerCommand() throws IOException {

        boolean command = false;
        String regex = TF_comandText.getText();
        Pattern patron = Pattern.compile(regex);
        Matcher m;

        String[] nomArchivo = TF_comandText.getText().split(" ");

        if (nomArchivo[0].equals("./create")) {
            if (nomArchivo[2].equals("-single")) {
                command = true;
            }
        }
        if (command) {
            crearArchivo();
            TF_comandText.setText("");
        }

        if (nomArchivo[0].equals("./load")) {
            command = true;
        }
        if (command) {
            cargarArhcivo();
        }

        if (nomArchivo[0].equals("./clear")) {
            command = true;
        }
        if (command) {
            clearTable();
        }

        if (nomArchivo[0].equals("./clear")) {
            command = true;
        }
        if (command) {
            refreshTree();
        }
        if (command == false) {
            JOptionPane.showMessageDialog(this, "Commando invalido");
        }
    }

    public void cargarArhcivo() {
        String[] nomArchivo = TF_comandText.getText().split(" ");

        try {

            File ldArchivo = new File("./Directory/" + nomArchivo[1]);
            FileReader fr = new FileReader(ldArchivo);
            BufferedReader br = new BufferedReader(fr);
            Object[] ln = br.lines().toArray();

            modeloTable.setRowCount(0);
            for (int i = 0; i < ln.length; i++) {
                String[] hilera = ln[i].toString().split(",");
                modeloTable.addRow(hilera);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo() throws IOException {
        String[] nomArchivo = TF_comandText.getText().split(" ");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File nvArchivo = new File("./Directory/" + nomArchivo[1]);
            if (nvArchivo.createNewFile()) {

                fw = new FileWriter(nvArchivo);
                bw = new BufferedWriter(fw);

                for (int i = 0; this.jTable1.getRowCount() < 10; i++) {
                    for (int j = 0; j < jTable1.getColumnCount(); j++) {
                        if (jTable1.getValueAt(i, j) != null) {
                            bw.write(jTable1.getValueAt(i, j).toString() + ",");
                        }
                    }
                    bw.newLine();
                }
                bw.flush();
                bw.close();
                fw.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clearTable() {
        jTable1.setModel(new DefaultTableModel(new String[]{"id", "nombre", "category", "price", "aisle", "bin",}, 100));
    }

    public void refreshTree() {

        DefaultTreeModel modelo = (DefaultTreeModel) JT_arhcivos.getModel();
        DefaultMutableTreeNode directory = (DefaultMutableTreeNode) modelo.getRoot();

        File directorio = new File("./Directory");
        File[] arhcivos = directorio.listFiles();

        for (int i = 0; i < arhcivos.length; i++) {
            if (arhcivos[i].getName().endsWith(".txt")) {
                DefaultMutableTreeNode nvArchivo = new DefaultMutableTreeNode((File) arhcivos[i]);
                directory.add(nvArchivo);
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JT_arhcivos;
    private javax.swing.JLabel LB_enterbutton;
    private javax.swing.JLabel LB_enterbutton1;
    private javax.swing.JMenu MB_File;
    private javax.swing.JMenu MB_clear;
    private javax.swing.JMenu MB_help;
    private javax.swing.JMenu MB_window;
    private javax.swing.JMenuItem MI_ImportFile;
    private javax.swing.JMenuItem MI_RefreshTree;
    private javax.swing.JMenuItem MI_clear;
    private javax.swing.JMenuItem MI_clearLine;
    private javax.swing.JMenuItem MI_clearTable;
    private javax.swing.JMenuItem MI_commandInfo;
    private javax.swing.JMenuItem MI_load;
    private javax.swing.JMenuItem MI_newFile;
    private javax.swing.JMenuItem MI_prodInfo;
    private javax.swing.JMenuItem MI_refresh;
    private javax.swing.JPopupMenu PM_opcTable;
    private javax.swing.JPopupMenu PM_opcTree;
    private javax.swing.JPanel PN_principal;
    private javax.swing.JTextField TF_comandText;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

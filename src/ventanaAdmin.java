
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.Query;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ventanaAdmin extends javax.swing.JFrame {

    public ventanaAdmin() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        MI_clearLine = new javax.swing.JMenuItem();
        MI_clearTable = new javax.swing.JMenuItem();
        MB_help = new javax.swing.JMenu();
        MI_prodInfo = new javax.swing.JMenuItem();
        MI_commandInfo = new javax.swing.JMenuItem();

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

        TF_comandText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_comandTextKeyPressed(evt);
            }
        });
        PN_principal.add(TF_comandText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        JT_arhcivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
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
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 66, 652, -1));

        PN_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        MB_File.setText("File");

        MI_newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_newFile.setText("New File");
        MB_File.add(MI_newFile);

        MI_ImportFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_ImportFile.setText("Import File");
        MB_File.add(MI_ImportFile);

        jMenuBar1.add(MB_File);

        MB_window.setText("Window");

        MI_clearLine.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_clearLine.setText("Clear Command Line");
        MI_clearLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_clearLineActionPerformed(evt);
            }
        });
        MB_window.add(MI_clearLine);

        MI_clearTable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MI_clearTable.setText("Clear Table");
        MB_window.add(MI_clearTable);

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

    private void TF_comandTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_comandTextKeyPressed

    }//GEN-LAST:event_TF_comandTextKeyPressed

    private void LB_enterbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_enterbuttonMouseClicked
        try {
            System.out.println("click");
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
                System.out.println("encontro single");
            }
        }
        if (command) {
            craerArchivo();
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

    }

    public void craerArchivo() throws IOException {
        String[] nomArchivo = TF_comandText.getText().split(" ");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File nvArchivo = new File("./Directory/" + nomArchivo[1]);
            fw = new FileWriter(nvArchivo);
            bw = new BufferedWriter(fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void clearTable() {

    }

    public void refreshTree() {

        DefaultTreeModel model = (DefaultTreeModel) JT_arhcivos.getModel();
        DefaultMutableTreeNode directory = (DefaultMutableTreeNode) model.getRoot();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JT_arhcivos;
    private javax.swing.JLabel LB_enterbutton;
    private javax.swing.JLabel LB_enterbutton1;
    private javax.swing.JMenu MB_File;
    private javax.swing.JMenu MB_help;
    private javax.swing.JMenu MB_window;
    private javax.swing.JMenuItem MI_ImportFile;
    private javax.swing.JMenuItem MI_clearLine;
    private javax.swing.JMenuItem MI_clearTable;
    private javax.swing.JMenuItem MI_commandInfo;
    private javax.swing.JMenuItem MI_newFile;
    private javax.swing.JMenuItem MI_prodInfo;
    private javax.swing.JPanel PN_principal;
    private javax.swing.JTextField TF_comandText;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

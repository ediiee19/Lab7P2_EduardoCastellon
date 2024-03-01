
public class ventanaAdmin extends javax.swing.JFrame {


    public ventanaAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PN_principal = new javax.swing.JPanel();
        LB_enterbutton = new javax.swing.JLabel();
        TF_comandText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MB_File = new javax.swing.JMenu();
        MB_window = new javax.swing.JMenu();
        MB_clearLine = new javax.swing.JMenu();
        MB_clearTable = new javax.swing.JMenu();
        MB_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PN_principal.setBackground(new java.awt.Color(204, 204, 204));
        PN_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_enterbutton.setBackground(new java.awt.Color(102, 102, 102));
        LB_enterbutton.setForeground(new java.awt.Color(102, 102, 102));
        LB_enterbutton.setText("              Enter");
        LB_enterbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LB_enterbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_principal.add(LB_enterbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 120, 50));
        PN_principal.add(TF_comandText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(37, 37, 37))
        );

        PN_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        MB_File.setText("File");
        jMenuBar1.add(MB_File);

        MB_window.setText("Window");

        MB_clearLine.setText("Clear Command Line");
        MB_clearLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB_clearLineActionPerformed(evt);
            }
        });
        MB_window.add(MB_clearLine);

        MB_clearTable.setText("Clear Table");
        MB_window.add(MB_clearTable);

        jMenuBar1.add(MB_window);

        MB_help.setText("Help");
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
            .addComponent(PN_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MB_clearLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB_clearLineActionPerformed
        TF_comandText.setText("");
    }//GEN-LAST:event_MB_clearLineActionPerformed

    

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
    
    public void agregarArhcivo(){
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_enterbutton;
    private javax.swing.JMenu MB_File;
    private javax.swing.JMenu MB_clearLine;
    private javax.swing.JMenu MB_clearTable;
    private javax.swing.JMenu MB_help;
    private javax.swing.JMenu MB_window;
    private javax.swing.JPanel PN_principal;
    private javax.swing.JTextField TF_comandText;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}

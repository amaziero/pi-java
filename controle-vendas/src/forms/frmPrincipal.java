/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.frmAdicionarMaterial;
import forms.frmCadastroItem;

/**
 *
 * @author aliso
 */
public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRegisters = new javax.swing.JMenu();
        menuAddStock = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuAddNewItem = new javax.swing.JMenuItem();
        menuSells = new javax.swing.JMenu();
        menuNewSell = new javax.swing.JMenu();
        menuConsultations = new javax.swing.JMenu();
        menuConsultationsSells = new javax.swing.JMenu();
        menuConsultationsStock = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu16 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de vendas Bacanudo");

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        MenuRegisters.setText("Cadastro");
        MenuRegisters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuRegistersMouseClicked(evt);
            }
        });

        menuAddStock.setText("Entrada de Material");
        menuAddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAddStockMouseClicked(evt);
            }
        });
        MenuRegisters.add(menuAddStock);
        MenuRegisters.add(jSeparator1);

        menuAddNewItem.setText("Cadastro Novo Item");
        menuAddNewItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAddNewItemMouseClicked(evt);
            }
        });
        menuAddNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewItemActionPerformed(evt);
            }
        });
        MenuRegisters.add(menuAddNewItem);

        jMenuBar1.add(MenuRegisters);

        menuSells.setText("Vendas");
        menuSells.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSellsMouseClicked(evt);
            }
        });

        menuNewSell.setText("Nova Venda");
        menuSells.add(menuNewSell);

        jMenuBar1.add(menuSells);

        menuConsultations.setText("Consultas");
        menuConsultations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConsultationsMouseClicked(evt);
            }
        });

        menuConsultationsSells.setText("Vendas");
        menuConsultations.add(menuConsultationsSells);

        menuConsultationsStock.setText("Entradas no estoque");
        menuConsultationsStock.setToolTipText("");
        menuConsultationsStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConsultationsStockMouseClicked(evt);
            }
        });
        menuConsultations.add(menuConsultationsStock);
        menuConsultations.add(jSeparator2);

        jMenuBar1.add(menuConsultations);

        jMenu16.setText("Sair");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu16);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuRegistersMouseClicked
        
    }//GEN-LAST:event_MenuRegistersMouseClicked

    private void menuAddStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAddStockMouseClicked
        frmAdicionarMaterial adicionarMaterial = new frmAdicionarMaterial();
        desktopPane.add(adicionarMaterial);
        adicionarMaterial.show();
    }//GEN-LAST:event_menuAddStockMouseClicked

    private void menuSellsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSellsMouseClicked
       
        frmNovaVenda novaVenda = new frmNovaVenda();
        desktopPane.add(novaVenda);
        novaVenda.show();

    }//GEN-LAST:event_menuSellsMouseClicked

    private void menuConsultationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultationsMouseClicked
        frmConsultaVenda consultaVenda = new frmConsultaVenda();
        desktopPane.add(consultaVenda);
        consultaVenda.show();
    }//GEN-LAST:event_menuConsultationsMouseClicked

    private void menuConsultationsStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultationsStockMouseClicked
       
        frmConsultaEntradaMaterial consultaEntradaMaterial = new frmConsultaEntradaMaterial();
        desktopPane.add(consultaEntradaMaterial);
        consultaEntradaMaterial.show(); // TODO add your handling code here:
    }//GEN-LAST:event_menuConsultationsStockMouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu16MouseClicked

    private void menuAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewItemActionPerformed
        frmCadastroItem cadastroItem = new frmCadastroItem();
        desktopPane.add(cadastroItem);
        cadastroItem.show();
    }//GEN-LAST:event_menuAddNewItemActionPerformed

    private void menuAddNewItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAddNewItemMouseClicked
        
    }//GEN-LAST:event_menuAddNewItemMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRegisters;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuAddNewItem;
    private javax.swing.JMenu menuAddStock;
    private javax.swing.JMenu menuConsultations;
    private javax.swing.JMenu menuConsultationsSells;
    private javax.swing.JMenu menuConsultationsStock;
    private javax.swing.JMenu menuNewSell;
    private javax.swing.JMenu menuSells;
    // End of variables declaration//GEN-END:variables
}

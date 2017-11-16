
package maquinas_de_estados.main;

import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author JMGama
 */
public class JFrameHome extends javax.swing.JFrame {

    
    public String tituloMaquina = "Turing";
    public File fileMaquina;
    public File fileCinta;
    public List<String> cinta;
    public List<String> estados;
    public List<String> quintuplas;
    public DefaultListModel modelo = new DefaultListModel();
    
    public JFrameHome() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPaneQuintupla = new javax.swing.JPanel();
        JPaneEstados = new javax.swing.JPanel();
        JLabelMachine = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListEstados = new javax.swing.JList<>();
        JScrollPaneCinta = new javax.swing.JScrollPane();
        JTextAreaCinta = new javax.swing.JTextArea();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuLoad = new javax.swing.JMenu();
        JMenuItemMachine = new javax.swing.JMenuItem();
        JMenuItemTape = new javax.swing.JMenuItem();
        JMenuMachines = new javax.swing.JMenu();
        JMenuItemTuring = new javax.swing.JMenuItem();
        JMenuItemMealy = new javax.swing.JMenuItem();
        JMenuItemMoore = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JPaneQuintupla.setBackground(new java.awt.Color(255, 255, 255));
        JPaneQuintupla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout JPaneQuintuplaLayout = new javax.swing.GroupLayout(JPaneQuintupla);
        JPaneQuintupla.setLayout(JPaneQuintuplaLayout);
        JPaneQuintuplaLayout.setHorizontalGroup(
            JPaneQuintuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
        JPaneQuintuplaLayout.setVerticalGroup(
            JPaneQuintuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JPaneEstados.setBackground(new java.awt.Color(255, 255, 255));
        JPaneEstados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JLabelMachine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelMachine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelMachine.setText("Maquina de Turing");

        JListEstados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Estados de la maquina" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JListEstados);

        javax.swing.GroupLayout JPaneEstadosLayout = new javax.swing.GroupLayout(JPaneEstados);
        JPaneEstados.setLayout(JPaneEstadosLayout);
        JPaneEstadosLayout.setHorizontalGroup(
            JPaneEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMachine, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        JPaneEstadosLayout.setVerticalGroup(
            JPaneEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneEstadosLayout.createSequentialGroup()
                .addComponent(JLabelMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        JTextAreaCinta.setEditable(false);
        JTextAreaCinta.setColumns(20);
        JTextAreaCinta.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        JTextAreaCinta.setRows(1);
        JTextAreaCinta.setMargin(new java.awt.Insets(1, 5, 1, 5));
        JTextAreaCinta.setVerifyInputWhenFocusTarget(false);
        JScrollPaneCinta.setViewportView(JTextAreaCinta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPaneQuintupla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPaneEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JScrollPaneCinta)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPaneQuintupla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPaneEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPaneCinta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        JMenuLoad.setText("Load");

        JMenuItemMachine.setText("Machine");
        JMenuItemMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemMachineActionPerformed(evt);
            }
        });
        JMenuLoad.add(JMenuItemMachine);

        JMenuItemTape.setText("Tape");
        JMenuItemTape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemTapeActionPerformed(evt);
            }
        });
        JMenuLoad.add(JMenuItemTape);

        JMenuBar.add(JMenuLoad);

        JMenuMachines.setText("Machines");

        JMenuItemTuring.setText("Turing");
        JMenuItemTuring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemTuringActionPerformed(evt);
            }
        });
        JMenuMachines.add(JMenuItemTuring);

        JMenuItemMealy.setText("Mealy");
        JMenuItemMealy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemMealyActionPerformed(evt);
            }
        });
        JMenuMachines.add(JMenuItemMealy);

        JMenuItemMoore.setText("Moore");
        JMenuItemMoore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemMooreActionPerformed(evt);
            }
        });
        JMenuMachines.add(JMenuItemMoore);

        JMenuBar.add(JMenuMachines);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemTuringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTuringActionPerformed
        JLabelMachine.setText("Turing Machine");
        tituloMaquina = "Turing";
    }//GEN-LAST:event_JMenuItemTuringActionPerformed

    private void JMenuItemMealyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMealyActionPerformed
        JLabelMachine.setText("Mealy Machine");
        tituloMaquina = "Mealy";
    }//GEN-LAST:event_JMenuItemMealyActionPerformed

    private void JMenuItemMooreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMooreActionPerformed
        JLabelMachine.setText("Moore Machine");
        tituloMaquina = "Moore";
    }//GEN-LAST:event_JMenuItemMooreActionPerformed

    private void JMenuItemMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMachineActionPerformed
        ManejoDeArchivos seleccionDeArchivos = new ManejoDeArchivos();
        fileMaquina = seleccionDeArchivos.seleccionArchivo();
        quintuplas = seleccionDeArchivos.obtenerMaquina(fileMaquina);
        for(int i=0; i<quintuplas.size(); i++) {
            System.out.println(quintuplas.get(i).charAt(0));
            modelo.addElement(Character.toString(quintuplas.get(i).charAt(0)));
        }
        JListEstados.setModel(modelo);
        
        repaint();
        
        
    }//GEN-LAST:event_JMenuItemMachineActionPerformed

    private void JMenuItemTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTapeActionPerformed
        ManejoDeArchivos seleccionDeArchivos = new ManejoDeArchivos();
        fileCinta = seleccionDeArchivos.seleccionArchivo();
        cinta = seleccionDeArchivos.obtenerCinta(fileCinta);
        String labelCinta = "";
        for(int i=0; i<cinta.size(); i++) {
            if(i == cinta.size()-1){
                labelCinta = labelCinta + cinta.get(i);
            }else{
                labelCinta = labelCinta + cinta.get(i) + " ";
            }
        }
        JTextAreaCinta.setText(labelCinta);
        
    }//GEN-LAST:event_JMenuItemTapeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelMachine;
    private javax.swing.JList<String> JListEstados;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem JMenuItemMachine;
    private javax.swing.JMenuItem JMenuItemMealy;
    private javax.swing.JMenuItem JMenuItemMoore;
    private javax.swing.JMenuItem JMenuItemTape;
    private javax.swing.JMenuItem JMenuItemTuring;
    private javax.swing.JMenu JMenuLoad;
    private javax.swing.JMenu JMenuMachines;
    private javax.swing.JPanel JPaneEstados;
    private javax.swing.JPanel JPaneQuintupla;
    private javax.swing.JScrollPane JScrollPaneCinta;
    private javax.swing.JTextArea JTextAreaCinta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

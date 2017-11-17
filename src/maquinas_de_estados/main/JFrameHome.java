
package maquinas_de_estados.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author JMGama
 */
public class JFrameHome extends javax.swing.JFrame {

    
    public String maquina = "Turing";
    public File fileMaquina;
    public File fileCinta;
    public List<String> cinta = new ArrayList<String>();
    public List<String> estados = new ArrayList<String>();
    public List<String> quintuplas = new ArrayList<String>();
    public DefaultListModel modeloEstados = new DefaultListModel();
    public DefaultListModel modeloQuintuplas = new DefaultListModel();;
    
    public JFrameHome() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPaneQuintupla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListQuintuplas = new javax.swing.JList<>();
        JPaneEstados = new javax.swing.JPanel();
        JLabelMachine = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListEstados = new javax.swing.JList<>();
        JScrollPaneCinta = new javax.swing.JScrollPane();
        JTextAreaCinta = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        jScrollPane2.setViewportView(JListQuintuplas);

        javax.swing.GroupLayout JPaneQuintuplaLayout = new javax.swing.GroupLayout(JPaneQuintupla);
        JPaneQuintupla.setLayout(JPaneQuintuplaLayout);
        JPaneQuintuplaLayout.setHorizontalGroup(
            JPaneQuintuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneQuintuplaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPaneQuintuplaLayout.setVerticalGroup(
            JPaneQuintuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneQuintuplaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        JPaneEstados.setBackground(new java.awt.Color(255, 255, 255));
        JPaneEstados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JLabelMachine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelMachine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelMachine.setText("Maquina de Turing");

        JListEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(JListEstados);
        JListEstados.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent arg0){
                if (!arg0.getValueIsAdjusting()){
                    seleccionEstado(JListEstados.getSelectedValue().toString());
                }
            }
        });

        javax.swing.GroupLayout JPaneEstadosLayout = new javax.swing.GroupLayout(JPaneEstados);
        JPaneEstados.setLayout(JPaneEstadosLayout);
        JPaneEstadosLayout.setHorizontalGroup(
            JPaneEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMachine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPaneEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
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

        jButton3.setText("Reiniciar");

        jButton1.setText("Realizar");

        jButton2.setText("Siguiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPaneQuintupla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPaneEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JScrollPaneCinta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPaneQuintupla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPaneEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPaneCinta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemTuringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTuringActionPerformed
        JLabelMachine.setText("Turing Machine");
        maquina = "Turing";
    }//GEN-LAST:event_JMenuItemTuringActionPerformed

    private void JMenuItemMealyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMealyActionPerformed
        JLabelMachine.setText("Mealy Machine");
        maquina = "Mealy";
    }//GEN-LAST:event_JMenuItemMealyActionPerformed

    private void JMenuItemMooreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMooreActionPerformed
        JLabelMachine.setText("Moore Machine");
        maquina = "Moore";
    }//GEN-LAST:event_JMenuItemMooreActionPerformed

    private void JMenuItemMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemMachineActionPerformed
        ManejoDeArchivos seleccionDeArchivos = new ManejoDeArchivos();
        fileMaquina = seleccionDeArchivos.seleccionArchivo();
        quintuplas = seleccionDeArchivos.obtenerMaquina(fileMaquina);
        for(int i=0; i<quintuplas.size(); i++) {
            if(!modeloEstados.contains(Character.toString(quintuplas.get(i).charAt(0)))){
                estados.add(Character.toString(quintuplas.get(i).charAt(0)));
                modeloEstados.addElement(Character.toString(quintuplas.get(i).charAt(0)));
            }   
        }
        JListEstados.setModel(modeloEstados);
        repaint();
    }//GEN-LAST:event_JMenuItemMachineActionPerformed
    
    public void seleccionEstado(String estadoSeleccionado){
        modeloQuintuplas.clear();
        for (int i=0; i<quintuplas.size(); i++) {
            if (Character.toString(quintuplas.get(i).charAt(0)).equals(estadoSeleccionado)) {
                modeloQuintuplas.addElement(quintuplas.get(i));
            }
        }
        JListQuintuplas.setModel(modeloQuintuplas);
    }
    
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
    private javax.swing.JList<String> JListQuintuplas;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

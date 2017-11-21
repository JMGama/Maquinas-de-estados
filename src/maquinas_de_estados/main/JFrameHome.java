package maquinas_de_estados.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import maquinas_de_estados.mealy.Maquina_Mealy;
import maquinas_de_estados.moore.Maquina_Moore;
import maquinas_de_estados.turing.Maquina_Turing;

/**
 *
 * @author JMGama
 */
public class JFrameHome extends javax.swing.JFrame {

    private Maquina_Turing maquinaTuring;
    private Maquina_Mealy maquinaMealy;
    private Maquina_Moore maquinaMoore;
    private String maquina = "Turing";
    private File fileMaquina;
    private File fileCinta;
    private List<String> cinta;
    private List<String> tuplas;
    private DefaultListModel modeloEstados = new DefaultListModel();
    private DefaultListModel modeloTuplas = new DefaultListModel();

    public JFrameHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPaneTupla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListTuplas = new javax.swing.JList<>();
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

        JPaneTupla.setBackground(new java.awt.Color(255, 255, 255));
        JPaneTupla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setViewportView(JListTuplas);

        javax.swing.GroupLayout JPaneTuplaLayout = new javax.swing.GroupLayout(JPaneTupla);
        JPaneTupla.setLayout(JPaneTuplaLayout);
        JPaneTuplaLayout.setHorizontalGroup(
            JPaneTuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneTuplaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPaneTuplaLayout.setVerticalGroup(
            JPaneTuplaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPaneTuplaLayout.createSequentialGroup()
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
                    if (JListEstados.getSelectedValue() != null) {
                        seleccionEstado(JListEstados.getSelectedValue().toString());
                    }
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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPaneTupla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(JPaneTupla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        tuplas = new ArrayList(seleccionDeArchivos.obtenerMaquina(fileMaquina));

        modeloTuplas.clear();
        modeloEstados.clear();

        for (int i = 0; i < tuplas.size(); i++) {
            if (!modeloEstados.contains(Character.toString(tuplas.get(i).charAt(0)))) {
                modeloEstados.addElement(Character.toString(tuplas.get(i).charAt(0)));
            }
        }
        JListEstados.setModel(modeloEstados);
        repaint();
    }//GEN-LAST:event_JMenuItemMachineActionPerformed

    private void JMenuItemTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTapeActionPerformed
        ManejoDeArchivos seleccionDeArchivos = new ManejoDeArchivos();
        fileCinta = seleccionDeArchivos.seleccionArchivo();
        cinta = new ArrayList(seleccionDeArchivos.obtenerCinta(fileCinta));
        String labelCinta = "";
        for (int i = 0; i < cinta.size(); i++) {
            if (i == cinta.size() - 1) {
                labelCinta = labelCinta + cinta.get(i);
            } else {
                labelCinta = labelCinta + cinta.get(i) + " ";
            }
        }
        JTextAreaCinta.setText(labelCinta);

    }//GEN-LAST:event_JMenuItemTapeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            switch (maquina) {
                case "Turing":
                    maquinaTuring = new Maquina_Turing(tuplas, cinta);
                    mostrarCinta(cinta);
                    break;
                case "Mealy":
                    maquinaMealy = new Maquina_Mealy(tuplas, cinta);
                    mostrarCinta(cinta);
                    break;
                case "Moore":
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:\nNo se encontro "
                    + "Cinta / Maquina\nO el formato de los archivos "
                    + "es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            switch (maquina) {
                case "Turing":
                    mostrarCinta(maquinaTuring.analizar());
                    break;
                case "Mealy":
                    mostrarCinta(maquinaMealy.analizar());
                    break;
                case "Moore":
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:\nNo se encontro "
                    + "Cinta / Maquina\nO el formato de los archivos "
                    + "es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            switch (maquina) {
                case "Turing":
                    maquinaTuring = new Maquina_Turing(tuplas, cinta);
                    break;
                case "Mealy":
                    maquinaMealy = new Maquina_Mealy(tuplas, cinta);
                    break;
                case "Moore":
                    break;
            }
            mostrarCinta(cinta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:\nNo se encontro "
                    + "Cinta / Maquina\nO el formato de los archivos "
                    + "es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void seleccionEstado(String estadoSeleccionado) {
        modeloTuplas.clear();
        for (int i = 0; i < tuplas.size(); i++) {
            if (Character.toString(tuplas.get(i).charAt(0)).equals(estadoSeleccionado)) {
                modeloTuplas.addElement(tuplas.get(i));
            }
        }
        JListTuplas.setModel(modeloTuplas);
    }

    public void mostrarCinta(List<String> tape) {
        String labelCinta = "";
        for (int i = 0; i < tape.size(); i++) {
            if (i == tape.size() - 1) {
                labelCinta = labelCinta + tape.get(i);
            } else {
                labelCinta = labelCinta + tape.get(i) + " ";
            }
        }
        JTextAreaCinta.setText(labelCinta);
    }

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
    private javax.swing.JList<String> JListTuplas;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem JMenuItemMachine;
    private javax.swing.JMenuItem JMenuItemMealy;
    private javax.swing.JMenuItem JMenuItemMoore;
    private javax.swing.JMenuItem JMenuItemTape;
    private javax.swing.JMenuItem JMenuItemTuring;
    private javax.swing.JMenu JMenuLoad;
    private javax.swing.JMenu JMenuMachines;
    private javax.swing.JPanel JPaneEstados;
    private javax.swing.JPanel JPaneTupla;
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

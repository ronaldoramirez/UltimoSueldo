package vista;

import clases.Calculos;
import java.text.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblBonificacion = new javax.swing.JLabel();
        txtBonificacion = new javax.swing.JTextField();
        lblRegimen = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        charRegimen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSalario.setText("Salario:");

        lblFecha.setText("Fecha ingreso:");

        lblBonificacion.setText("Bonificacion:");

        lblRegimen.setText("Regimen:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        charRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione", "F", "P" }));
        charRegimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charRegimenActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario)
                            .addComponent(lblFecha)
                            .addComponent(lblBonificacion)
                            .addComponent(lblRegimen))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBonificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .addComponent(txtSalario))
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(charRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBonificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegimen)
                    .addComponent(charRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        ejecutar();

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void charRegimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charRegimenActionPerformed
        // TODO add your handling code here:
        if(this.charRegimen.getSelectedItem().toString().equalsIgnoreCase("p")){
            ejecutar();
        } else if(this.charRegimen.getSelectedItem().toString().equalsIgnoreCase("f")){
            ejecutar();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un regimen");
        }
        
    }//GEN-LAST:event_charRegimenActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    public void ejecutar(){
        String campos_vacios = "";
        if (!(txtSalario.getText().equalsIgnoreCase("")) && (!txtFecha.getText().equalsIgnoreCase("")) && (!txtBonificacion.getText().equalsIgnoreCase(""))) {
            this.calcular();
        } else if ((txtSalario.getText().equalsIgnoreCase("")) && (!txtFecha.getText().equalsIgnoreCase("")) && (!txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Salario").toString();
        } else if (!(txtSalario.getText().equalsIgnoreCase("")) && (txtFecha.getText().equalsIgnoreCase("")) && (!txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Fecha").toString();
        } else if (!(txtSalario.getText().equalsIgnoreCase("")) && (!txtFecha.getText().equalsIgnoreCase("")) && (txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Bonificación").toString();
        } else if ((txtSalario.getText().equalsIgnoreCase("")) && (txtFecha.getText().equalsIgnoreCase("")) && (!txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Salario, Fecha de Ingreso ").toString();
        } else if (!(txtSalario.getText().equalsIgnoreCase("")) && (txtFecha.getText().equalsIgnoreCase("")) && (txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Fecha de Ingreso, Bonificación ").toString();
        }else if ((txtSalario.getText().equalsIgnoreCase("")) && (!txtFecha.getText().equalsIgnoreCase("")) && (txtBonificacion.getText().equalsIgnoreCase(""))) {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Salario, Bonificación ").toString();
        }else {
            campos_vacios = new StringBuilder().insert(campos_vacios.length(), "Todos los campos, ").toString();
        }

        if (!campos_vacios.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "El siguiente(s) campo(s) se encuentra vacío(s): " + campos_vacios +".", "Error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            //No ejecuta nada
        }
    
    }

    public void calcular() {
        // Obteniendo fecha de ingreso
        SimpleDateFormat miFormato = new SimpleDateFormat("dd/MM/yyyy");
        String fech = txtFecha.getText().substring(0, 10);
        String item = "", regimen, texto_resultante;
        char reg;
        float bono14, aguinaldo, indemenizacion, igss, iva, subTotal, salarioLiquido;
        DecimalFormat formato1 = new DecimalFormat("#,###,###.00");
        item = charRegimen.getSelectedItem().toString().substring(0, 1);
        try {

            if (item.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "Seleccione un regimen");
                //empleado.setRegimen('P');
                //charRegimen.setSelectedItem("P");
            } else {
                Date fechaInicial = miFormato.parse(fech);
                Calculos empleado = new Calculos();
                empleado.setRegimen(item.charAt(0));
                empleado.setSalario(Float.parseFloat(txtSalario.getText()));
                empleado.setBonificacion(Float.parseFloat(txtBonificacion.getText()));
                empleado.setFecha_ingreso(fechaInicial);
                bono14 = empleado.calculaBono14(Float.parseFloat(txtSalario.getText()), fechaInicial);
                aguinaldo = empleado.calculaAguinaldo(Float.parseFloat(txtSalario.getText()), fechaInicial);
                indemenizacion = empleado.calculaIndemnizacion(Float.parseFloat(txtSalario.getText()), fechaInicial);
                igss = empleado.calculaIGSS(Float.parseFloat(txtSalario.getText()));
                iva = empleado.getIVA();
                subTotal = empleado.calculaSubTotal();
                salarioLiquido = empleado.calculaSalario();

                reg = empleado.getRegimen();

                switch (reg) {
                    case 'P': {
                        regimen = "Con Prestaciones";
                        texto_resultante = "         ULTIMO \t SUELDO \n"
                                + "************************************\n"
                                + "\n"
                                + "  Regimen:       \t\t" + regimen + "\n"
                                + "   Sueldo:       \t\tQ." + formato1.format(empleado.getSalario()) + "\n"
                                + "   Bonificación: \t\tQ." + formato1.format(empleado.getBonificacion()) + "\n"
                                + "   Bono 14:      \t\tQ." + formato1.format(bono14) + "\n"
                                + "   Aguinaldo:    \t\tQ." + formato1.format(aguinaldo) + "\n"
                                + "(+)Indemnización:\tQ." + formato1.format(indemenizacion) + "\n"
                                + "--------------------------------------------------------\n"
                                + "   Sub Total:    \t\tQ." + formato1.format(subTotal) + "\n"
                                + "(-)IGSS:         \t\tQ." + formato1.format(igss) + "\n"
                                + "---------------------------------------------------------\n"
                                + "Sueldo Liquido:  \tQ." + formato1.format(salarioLiquido) + "\n";
                    }
                    break;
                    case 'F': {
                        regimen = "Facturando";
                        texto_resultante = "         ULTIMO \t SUELDO \n"
                                + "************************************\n"
                                + "\n"
                                + "\n"
                                + "Regimen:         \t" + regimen + "\n"
                                + "    Sueldo:      \tQ." + formato1.format(empleado.getSalario()) + "\n"
                                + "-------------------------------------------\n"
                                + "    Sub Total:   \tQ." + formato1.format(subTotal) + "\n"
                                + "(-) IVA:         \tQ." + formato1.format(iva) + "\n"
                                + "-------------------------------------------\n"
                                + "Sueldo Liquido:  Q." + formato1.format(salarioLiquido) + "\n";
                    }
                    break;
                    default: {
                        texto_resultante = " Seleccione un regimen\n";
                    }
                    break;
                }

                txtResultado.setText(texto_resultante);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> charRegimen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBonificacion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblRegimen;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtBonificacion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}

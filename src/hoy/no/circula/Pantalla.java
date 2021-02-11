package hoy.no.circula;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author JoseCarlos
 */
public class Pantalla extends javax.swing.JFrame {

    int dia = 0;
    int mes = 0;
    int anio = 0;
    int hora = 0;
    int minuto = 0;
    int flag = 0;

    public Pantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width / 2, height / 2);

        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        lblFechaEjemplo = new javax.swing.JLabel();
        ftfPlacaV = new javax.swing.JFormattedTextField();
        ftfFecha = new javax.swing.JFormattedTextField();
        lblFechaFormato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoVehiculo = new javax.swing.JComboBox<>();
        ftfPlacaM = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFondo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 330));

        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPlaca.setText("PLACA");
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 24));

        lblDate.setText("FECHA Y HORA");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 24));

        btnConsulta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gorila\\Downloads\\search.png")); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 250, -1, -1));

        lblFechaEjemplo.setText("10/02/2021 14:30");
        getContentPane().add(lblFechaEjemplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 155, -1));

        ftfPlacaV.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
            public javax.swing.JFormattedTextField.AbstractFormatter
            getFormatter(javax.swing.JFormattedTextField tf){
                try {
                    return new javax.swing.text.MaskFormatter("UUU-####");
                } catch (java.text.ParseException pe){
                    pe.printStackTrace();
                }
                return null; } }
    );
    getContentPane().add(ftfPlacaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 133, -1));

    ftfFecha.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
        public javax.swing.JFormattedTextField.AbstractFormatter
        getFormatter(javax.swing.JFormattedTextField tf){
            try {
                return new javax.swing.text.MaskFormatter("##/##/#### ##:##");
            } catch (java.text.ParseException pe){
                pe.printStackTrace();
            }
            return null; } });
getContentPane().add(ftfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 133, -1));

lblFechaFormato.setText("dd/MM/aaaa HH:mm");
getContentPane().add(lblFechaFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 155, -1));

jLabel1.setText("TIPO VEHÍCULO");
getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

cbxTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opcion", "Automovil", "Moto" }));
cbxTipoVehiculo.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cbxTipoVehiculoItemStateChanged(evt);
    }
    });
    getContentPane().add(cbxTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, -1));

    ftfPlacaM.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
        public javax.swing.JFormattedTextField.AbstractFormatter
        getFormatter(javax.swing.JFormattedTextField tf){
            try {
                return new javax.swing.text.MaskFormatter("UU-###U");
            } catch (java.text.ParseException pe){
                pe.printStackTrace();
            }
            return null; } });
getContentPane().add(ftfPlacaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));

jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
jLabel2.setText("Prueba Mardis");
getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

jPanel1.setBackground(new java.awt.Color(255, 255, 255));
getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 330));

pack();
}// </editor-fold>//GEN-END:initComponents

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
        String placa = "";
        asignarFechaHora();//asignamos la fecha

        if (validarFecha()) { //Validamos que la fecha sea correcta
            if (flag == 1) {
                placa = this.ftfPlacaV.getText();
            } else if (flag == 2) {
                placa = this.ftfPlacaM.getText();
            }
            puedeSalir(recuperarPlaca(placa));
        } else {
            JOptionPane.showMessageDialog(this,
                    "La fecha ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnConsultaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.ftfPlacaV.setVisible(false);
        this.ftfPlacaM.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void cbxTipoVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoVehiculoItemStateChanged
        // TODO add your handling code here:
        String vehiculo = (String) this.cbxTipoVehiculo.getSelectedItem();

        //Sacamos el último dígito
        if (vehiculo.equalsIgnoreCase("Automovil")) {
            this.ftfPlacaV.setVisible(true);
            this.ftfPlacaM.setVisible(false);
            flag = 1;
        } else if (vehiculo.equalsIgnoreCase("Moto")) {
            this.ftfPlacaV.setVisible(false);
            this.ftfPlacaM.setVisible(true);
            flag = 2;
        } else if (vehiculo.equalsIgnoreCase("Selecione una opcion")) {
            this.ftfPlacaV.setVisible(false);
            this.ftfPlacaM.setVisible(false);
        }
    }//GEN-LAST:event_cbxTipoVehiculoItemStateChanged

    public boolean validarFecha() {

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Para hora formato 24H
        if (this.hora < 0 || this.hora > 23) {
            return false;
        }
        // Para minutos de hora 0 a 59
        if (this.minuto < 0 || this.minuto > 59) {
            return false;
        }
        // Para mes de 1 a 12
        if (this.mes < 1 || this.mes > 12) {
            return false;
        }
        // Para febrero y bisiesto el limite es 29
        if (this.mes == 2 && dia == 29) {
            return this.anio % 400 == 0
                    || (this.anio % 4 == 0 && this.anio % 100 != 0);
        }
        // Para dia máximo en meses
        return this.dia >= 1 && this.dia <= diasMes[this.mes - 1];

    }

    public void asignarFechaHora() {
        String fecha = this.ftfFecha.getText();

        String[] datetime = fecha.split("\\ ");
        String[] date = datetime[0].split("\\/");
        String[] time = datetime[1].split("\\:");

        this.dia = Integer.parseInt(date[0]);
        this.mes = Integer.parseInt(date[1]);
        this.anio = Integer.parseInt(date[2]);

        this.hora = Integer.parseInt(time[0]);
        this.minuto = Integer.parseInt(time[1]);
        System.out.println(dia + "/" + mes + "/" + anio + " " + hora + ":" + minuto);
    }

    public void puedeSalir(int ultimoDigito) {

        /*
        Vehículos con placas terminadas en número impar (1, 3, 5, 7 y 9) pueden circular de 04:00 a 23:00 los lunes, miércoles, viernes y domingo
        Vehículos con placas terminadas en número par (2, 4, 6, 8 y 0) pueden circular de 04:00 a 23:00 los martes, jueves, sábado y domingo
         */
        // Después de validar la fecha se establece una fecha local 
        LocalDate localDate = LocalDate.of(this.anio, this.mes, this.dia);

        // Buscamos el día de la fecha local creada 
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);

        // Capturamos el valor del día
        //1-3-5 = Lunes-Miercoles-Viernes
        //2-4-6 = Martes-Jueves-Sábado
        //7 = Domingo
        int val = dayOfWeek.getValue();

        if (this.hora == 23 || (this.hora >= 0 && this.hora < 4)) {
            JOptionPane.showMessageDialog(this, "Ud No puede circular en la hora especificada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (val == 7) {
                JOptionPane.showMessageDialog(this, "Ud SI puede circular el día y hora especificado", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (ultimoDigito % 2 == 0 && val % 2 == 0) {
                JOptionPane.showMessageDialog(this, "Ud SI puede circular el día y hora especificado", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (ultimoDigito % 2 == 0 && val % 2 != 0) {
                JOptionPane.showMessageDialog(this, "Ud NO puede circular el día y hora especificado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ultimoDigito % 2 != 0 && val % 2 == 0) {
                JOptionPane.showMessageDialog(this, "Ud NO puede circular el día y hora especificado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else if (ultimoDigito % 2 != 0 && val % 2 != 0) {
                JOptionPane.showMessageDialog(this, "Ud SI puede circular el día y hora especificado", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public int recuperarPlaca(String placa) {
        //Se recupera la placa
        int ultimoDigito = 0;

        if (flag == 1) {
            ultimoDigito = Integer.parseInt(placa.substring(placa.length() - 1));
        } else if (flag == 2) {
            ultimoDigito = Integer.parseInt(placa.substring(placa.length() - 2, placa.length() - 1));
        }

        System.out.println("Ultimo digito de la placa = " + ultimoDigito);

        return ultimoDigito;
    }

    public String validarPlaca() {
        String vehiculo = (String) this.cbxTipoVehiculo.getSelectedItem();
        System.out.println("Index = " + vehiculo);

        //Sacamos el último dígito
        if (vehiculo.equalsIgnoreCase("Automovil")) {
            this.ftfPlacaV.setVisible(true);
            this.ftfPlacaM.setVisible(false);
        } else if (vehiculo.equalsIgnoreCase("Moto")) {
            this.ftfPlacaV.setVisible(false);
            this.ftfPlacaM.setVisible(true);
        }

        return vehiculo;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JComboBox<String> cbxTipoVehiculo;
    private javax.swing.JFormattedTextField ftfFecha;
    private javax.swing.JFormattedTextField ftfPlacaM;
    private javax.swing.JFormattedTextField ftfPlacaV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFechaEjemplo;
    private javax.swing.JLabel lblFechaFormato;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPlaca;
    // End of variables declaration//GEN-END:variables
}

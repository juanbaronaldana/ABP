package VISTA;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        base_login = new javax.swing.JPanel();
        labelusuario = new javax.swing.JLabel();
        entrada_usuario_login = new javax.swing.JTextField();
        label_contraseña = new javax.swing.JLabel();
        boton_ingresar = new javax.swing.JButton();
        entrada_contraseña_login = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        fondo_login = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        boton_singup = new javax.swing.JButton();
        registro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoR = new javax.swing.JLabel();
        nombreR = new javax.swing.JLabel();
        entraNR = new javax.swing.JTextField();
        entradaCR = new javax.swing.JTextField();
        correoR = new javax.swing.JLabel();
        rolR = new javax.swing.JLabel();
        entradaRR = new javax.swing.JTextField();
        contraseñaR = new javax.swing.JLabel();
        entraCR = new javax.swing.JPasswordField();
        botonR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setLayout(new java.awt.CardLayout());

        base_login.setBackground(new java.awt.Color(255, 255, 255));

        labelusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelusuario.setText("USUARIO");

        entrada_usuario_login.setBackground(new java.awt.Color(204, 180, 194));

        label_contraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_contraseña.setText("CONTRASEÑA");

        boton_ingresar.setBackground(new java.awt.Color(94, 17, 63));
        boton_ingresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boton_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        boton_ingresar.setText("INGRESAR");
        boton_ingresar.setBorder(null);
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });

        entrada_contraseña_login.setBackground(new java.awt.Color(204, 180, 194));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo main.png"))); // NOI18N

        javax.swing.GroupLayout base_loginLayout = new javax.swing.GroupLayout(base_login);
        base_login.setLayout(base_loginLayout);
        base_loginLayout.setHorizontalGroup(
            base_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_loginLayout.createSequentialGroup()
                .addGroup(base_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_loginLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(base_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelusuario)
                            .addComponent(label_contraseña)
                            .addComponent(entrada_contraseña_login, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(entrada_usuario_login)))
                    .addGroup(base_loginLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(base_loginLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        base_loginLayout.setVerticalGroup(
            base_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_loginLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entrada_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entrada_contraseña_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(boton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        fondo_login.setBackground(new java.awt.Color(0, 18, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SING IN");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        boton_singup.setBackground(new java.awt.Color(0, 18, 51));
        boton_singup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boton_singup.setForeground(new java.awt.Color(240, 240, 240));
        boton_singup.setText("SING UP");
        boton_singup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        boton_singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_singupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondo_loginLayout = new javax.swing.GroupLayout(fondo_login);
        fondo_login.setLayout(fondo_loginLayout);
        fondo_loginLayout.setHorizontalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_loginLayout.createSequentialGroup()
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_singup, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 233, Short.MAX_VALUE))
        );
        fondo_loginLayout.setVerticalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_loginLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_singup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(base_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fondo_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondo_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        base.add(login, "card2");

        registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 51));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 18, 51));
        jButton3.setText("Sing up");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 18, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sing in");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 542));

        logoR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo main.png"))); // NOI18N

        nombreR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreR.setForeground(new java.awt.Color(37, 70, 38));
        nombreR.setText("Nombre Completo");

        entraNR.setBackground(new java.awt.Color(204, 180, 194));
        entraNR.setBorder(null);

        entradaCR.setBackground(new java.awt.Color(204, 180, 194));

        correoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        correoR.setForeground(new java.awt.Color(37, 70, 38));
        correoR.setText("Correo");

        rolR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rolR.setForeground(new java.awt.Color(37, 70, 83));
        rolR.setText("Rol");

        entradaRR.setBackground(new java.awt.Color(204, 180, 194));

        contraseñaR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contraseñaR.setForeground(new java.awt.Color(37, 70, 83));
        contraseñaR.setText("Contraseña");

        entraCR.setEditable(false);
        entraCR.setBackground(new java.awt.Color(204, 180, 194));

        botonR.setBackground(new java.awt.Color(94, 17, 63));
        botonR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonR.setForeground(new java.awt.Color(255, 255, 255));
        botonR.setText("Registrar");
        botonR.setBorder(null);
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 185, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rolR, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoR)
                    .addComponent(entradaCR, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreR)
                        .addComponent(entraNR)
                        .addComponent(entradaRR)
                        .addComponent(entraCR)
                        .addComponent(contraseñaR, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
                .addGap(152, 152, 152))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(entraNR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoR)
                .addGap(12, 12, 12)
                .addComponent(entradaCR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rolR, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entradaRR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entraCR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        registro.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 0, 670, -1));

        base.add(registro, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        List<Usuario> uss = ReadUser();
        System.out.println(uss);

    }//GEN-LAST:event_boton_ingresarActionPerformed

    private void boton_singupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_singupActionPerformed
        this.login.setVisible(false);
        this.registro.setVisible(true);
    }//GEN-LAST:event_boton_singupActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login newframe = new Login();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRActionPerformed
        Login newframe = new Login();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRActionPerformed
    public List<Usuario> ReadUser() {
        JSONParser Parser = new JSONParser();
        List<Usuario> uss = new ArrayList<>();
        try {
            InputStream resourceStream = this.getClass().getResourceAsStream("../TxtJson/prueba.txt");
            BufferedReader archivo = new BufferedReader(new InputStreamReader(resourceStream, "UTF-8"));
            JSONObject pJsonObj = (JSONObject) Parser.parse(archivo);
            JSONArray array = (JSONArray) pJsonObj.get("Personas");
            for (Object object : array) {
                String dts = object.toString();
                Gson gson = new Gson();
                Usuario usu = gson.fromJson(dts, Usuario.class);
                uss.add(usu);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | org.json.simple.parser.ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uss;
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JPanel base_login;
    private javax.swing.JButton botonR;
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JButton boton_singup;
    private javax.swing.JLabel contraseñaR;
    private javax.swing.JLabel correoR;
    private javax.swing.JPasswordField entraCR;
    private javax.swing.JTextField entraNR;
    private javax.swing.JTextField entradaCR;
    private javax.swing.JTextField entradaRR;
    private javax.swing.JPasswordField entrada_contraseña_login;
    private javax.swing.JTextField entrada_usuario_login;
    private javax.swing.JPanel fondo_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_contraseña;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoR;
    private javax.swing.JLabel nombreR;
    private javax.swing.JPanel registro;
    private javax.swing.JLabel rolR;
    // End of variables declaration//GEN-END:variables
}

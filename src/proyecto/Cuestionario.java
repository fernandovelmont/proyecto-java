/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FernandoDaniel
 */
public class Cuestionario extends javax.swing.JFrame {

 public static int x=10;
  int numero=0;



    int posicion = 0;
    Respuestas r = new Respuestas();
    preguntas p = new preguntas();
    Object[] select = {"","","","","","","","","",""};   
    
    
    public Cuestionario() {
        initComponents();
        
        Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
                
                while(true){
                x--;
                if(x<=0){
                     numero++;
                     x=10;
                
        
                }
                
                
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, e);
                    }
               
                }
                
            }
        }); 
        
      t1.start();
      
      
       
        
    
        
        preguntas.setText(p.getPregunta(posicion));
        
        String[] a = r.setRespuestas(posicion);
        respuestas_cuestionario.clearSelection(); 
        
        op1.setText(a[0]);
        op2.setText(a[1]);
        op3.setText(a[2]);
        op4.setText(a[3]);
        
        op1.requestFocus();
        
   
        
        finalizar_cuestionario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuestas_cuestionario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        preguntas = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        finalizar_cuestionario = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        pregunta.setFont(new java.awt.Font("Imprint MT Shadow", 3, 24)); // NOI18N
        pregunta.setForeground(new java.awt.Color(51, 51, 51));
        pregunta.setText("CUESTIONARIO");

        preguntas.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        preguntas.setForeground(new java.awt.Color(51, 51, 51));
        preguntas.setText("¿Preguntas?");

        op1.setBackground(new java.awt.Color(51, 51, 51));
        respuestas_cuestionario.add(op1);
        op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op1.setForeground(new java.awt.Color(51, 255, 0));
        op1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setBackground(new java.awt.Color(0, 0, 0));
        respuestas_cuestionario.add(op2);
        op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op2.setForeground(new java.awt.Color(51, 255, 0));
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(0, 0, 0));
        respuestas_cuestionario.add(op3);
        op3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op3.setForeground(new java.awt.Color(51, 255, 0));
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(0, 0, 0));
        respuestas_cuestionario.add(op4);
        op4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op4.setForeground(new java.awt.Color(51, 255, 0));
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        finalizar_cuestionario.setText("Finalizar Cuestionario");
        finalizar_cuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar_cuestionarioActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op4)
                    .addComponent(op3)
                    .addComponent(op2)
                    .addComponent(op1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(finalizar_cuestionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(siguiente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op1)
                .addGap(26, 26, 26)
                .addComponent(op2)
                .addGap(18, 18, 18)
                .addComponent(op3)
                .addGap(18, 18, 18)
                .addComponent(op4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(18, 18, 18)
                .addComponent(finalizar_cuestionario)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        select[posicion] = op1.getLabel();
    }//GEN-LAST:event_op1ActionPerformed

    
    private void finalizar_cuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar_cuestionarioActionPerformed
       
         int calificacion = 0;
        
        for(int i = 0; i < 10; i++){
            if(select[i].equals(r.getRespuesta(i))){
                calificacion++;
            }
        }
       
        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
    }//GEN-LAST:event_finalizar_cuestionarioActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        
        x=11;

        if(posicion == 8){
            siguiente.setEnabled(false);
            finalizar_cuestionario.setEnabled(true);
        }
        
        if(posicion < 10){
            
            posicion++;
            preguntas.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            respuestas_cuestionario.clearSelection();
            op1.setText(a[0]);
            op2.setText(a[1]);
            op3.setText(a[2]);
            op4.setText(a[3]);
            op1.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        select[posicion] = op2.getLabel();
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        select[posicion] = op3.getLabel();
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        select[posicion] = op4.getLabel();
    }//GEN-LAST:event_op4ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finalizar_cuestionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel preguntas;
    private javax.swing.ButtonGroup respuestas_cuestionario;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

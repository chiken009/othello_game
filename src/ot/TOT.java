/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot;
import ot.game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author Admin
 */
public class TOT extends javax.swing.JFrame {
	imagen ima = new imagen();
	
	
	public int checkcolor = 3;
	public int picture1 = 0;
	public int picture2 = 1;
	/*
     * Creates new form TOT
     */
    public TOT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(695, 735));
        setSize(new java.awt.Dimension(880, 700));
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
      
        jPanel1 = new javax.swing.JPanel();
        P1 = new javax.swing.JPanel();
        Line1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        P1Word = new javax.swing.JLabel();
        P2Word = new javax.swing.JLabel();
        P2 = new javax.swing.JPanel();
        Line2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        ChoosePlate = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        Gray = new javax.swing.JButton();
        Red = new javax.swing.JButton();
        Green = new javax.swing.JButton();
        Blue = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Bg = new javax.swing.JLabel();
        pic1 =  new javax.swing.JLabel();
        pic2 =  new javax.swing.JLabel();
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        JButton dog1 = new JButton();
        JButton ghost1 = new JButton();
        JButton dog2 = new JButton();
        JButton ghost2 = new JButton();
        JButton rabbit1 = new JButton();
        JButton rabbit2 = new JButton();
        
       
        dog1.setBounds(5, 170, 60, 30);
        dog1.setText("Mon");
        dog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogActionPerformed(evt);
            }
        });
        Line1.add(dog1);
        
        dog2.setBounds(5, 225, 60, 30);
        dog2.setText("Mon");
        dog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dog1ActionPerformed(evt);
            }
        });
        P2.add(dog2);
        
        rabbit1.setBounds(135, 170, 60, 30);
        rabbit1.setText("Rab");
        rabbit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbit1ActionPerformed(evt);
            }
        });
        Line1.add(rabbit1);
        
        rabbit2.setBounds(135, 225, 60, 30);
        rabbit2.setText("Rab");
        rabbit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbit2ActionPerformed(evt);
            }
        });
        P2.add(rabbit2);
        
        
        
        ghost1.setBounds(70, 170, 60, 30);
        ghost1.setText("Duc");
        ghost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghostActionPerformed(evt);
            }
        });
        Line1.add(ghost1);
        
        ghost2.setBounds(70, 225, 60, 30);
        ghost2.setText("Duc");
        ghost2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghost1ActionPerformed(evt);
            }
        });
        P2.add(ghost2);
        
     
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        P1.setBackground(new java.awt.Color(255, 255, 255));

        Line1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Line1Layout = new javax.swing.GroupLayout(Line1);
        Line1.setLayout(Line1Layout);
        Line1Layout.setHorizontalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        Line1Layout.setVerticalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );
       
        pic1.setForeground(new java.awt.Color(255, 51, 0));
        pic1.setBounds(70, 0, 210, 170);
        pic1.setIcon(ima.icon);
        
        Line1.add(pic1);
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText(" Black");

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(P1);
        P1.setBounds(60, 100, 210, 260);

        P1Word.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        P1Word.setForeground(new java.awt.Color(255, 51, 0));
        P1Word.setText("P1");
        getContentPane().add(P1Word);
        P1Word.setBounds(130, 30, 70, 58);

        P2Word.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        P2Word.setForeground(new java.awt.Color(51, 0, 255));
        P2Word.setText("P2");
        getContentPane().add(P2Word);
        P2Word.setBounds(500, 30, 52, 58);

        P2.setBackground(new java.awt.Color(255, 255, 255));

        Line2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" White");

        javax.swing.GroupLayout Line2Layout = new javax.swing.GroupLayout(Line2);
        Line2.setLayout(Line2Layout);
        Line2Layout.setHorizontalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Line2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Line2Layout.setVerticalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

       
        pic2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pic2.setForeground(new java.awt.Color(255, 51, 0));
        
        pic2.setBounds(70, 55, 210, 170);
        pic2.setIcon(ima.icon1);
        P2.add(pic2);
        
        
        
        
        
        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Line2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );

        getContentPane().add(P2);
        P2.setBounds(420, 100, 210, 260);

        V.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        V.setForeground(new java.awt.Color(255, 0, 0));
        V.setText("V");
        getContentPane().add(V);
        V.setBounds(330, 140, 50, 87);

        ChoosePlate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ChoosePlate.setText("Choose Plate");
        getContentPane().add(ChoosePlate);
        ChoosePlate.setBounds(230, 390, 206, 40);

        S.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        S.setForeground(new java.awt.Color(0, 0, 204));
        S.setText("S");
        getContentPane().add(S);
        S.setBounds(330, 220, 40, 87);

        Gray.setBackground(new java.awt.Color(192,192,192));
        Gray.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Gray.setForeground(new java.awt.Color(255, 255, 255));
        Gray.setText("Gray");
        Gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayActionPerformed(evt);
            }
        });
        getContentPane().add(Gray);
        Gray.setBounds(540, 450, 120, 40);

        Red.setBackground(new java.awt.Color(255, 128, 128));
        Red.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Red.setForeground(new java.awt.Color(255, 255, 255));
        Red.setText("Red");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        getContentPane().add(Red);
        Red.setBounds(220, 450, 120, 40);

        Green.setBackground(new java.awt.Color(51,153,102));
        Green.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Green.setForeground(new java.awt.Color(255, 255, 255));
        Green.setText("GReen");
        Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenActionPerformed(evt);
            }
        });
        getContentPane().add(Green);
        Green.setBounds(60, 450, 120, 40);

        Blue.setBackground(new java.awt.Color(0,102,204));
        Blue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Blue.setForeground(new java.awt.Color(255, 255, 255));
        Blue.setText("Blue");
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });
        getContentPane().add(Blue);
        Blue.setBounds(380, 450, 120, 40);

        Start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start);
        Start.setBounds(380, 600, 280, 60);

        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(60, 600, 280, 60);

        Bg.setIcon(new javax.swing.ImageIcon(".\\src\\ot\\BG3.png")); // NOI18N
        Bg.setText("jLabel2");
        getContentPane().add(Bg);
        Bg.setBounds(0, 20, 680, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
          checkcolor = 0;
    }
    
    private void GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
    	checkcolor = 1;
    }

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
    	checkcolor = 2;
    }
    
    private void GrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
    	checkcolor = 3;
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Startmenu Start = new Startmenu();
        Start.clip.stop();
        Start.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
    	Startmenu.clip.stop();
    	game game = new game(checkcolor, picture1, picture2);
    	this.setVisible(false);
    }//GEN-LAST:event_StartActionPerformed
    
    private void dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
   	 
    	pic1.setIcon(ima.icon);
    	picture1 = 0;
    }
    
    private void ghostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
      	 
    	pic1.setIcon(ima.icon1);
    	picture1 = 1;
    }
    
    private void ghost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
     	 
    	pic2.setIcon(ima.icon1);
    	picture2 = 1;
    }
    
    private void dog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
     	 
    	pic2.setIcon(ima.icon);
    	picture2 = 0;
    }
    private void rabbit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
      	 
    	pic1.setIcon(ima.icon2);
    	picture1 = 2;
    }
    
    private void rabbit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
     	 
    	pic2.setIcon(ima.icon2);
    	picture2= 2;
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
            java.util.logging.Logger.getLogger(TOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TOT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Bg;
    private javax.swing.JButton Blue;
    private javax.swing.JLabel ChoosePlate;
    private javax.swing.JButton Gray;
    private javax.swing.JButton Green;
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
    private javax.swing.JPanel P1;
    private javax.swing.JLabel P1Word;
    private javax.swing.JPanel P2;
    private javax.swing.JLabel P2Word;
    private javax.swing.JButton Red;
    private javax.swing.JLabel S;
    private javax.swing.JButton Start;
    private javax.swing.JLabel V;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    // End of variables declaration//GEN-END:variables
}

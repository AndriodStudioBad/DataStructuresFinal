
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielian
 */
public class Graph extends javax.swing.JFrame {

    private Thread t;
    private int d;
    private ArrayList<Integer>[] array;
    
    public Graph() {
        initComponents();
        d = 15; 
        
        array = DataAnalysis.getGraph();
        
        t = new Thread(updater);
        t.start();
    }

    Runnable updater = new Runnable(){
            public void run(){
                update();                
            }
        };
    
    public void update()
    {
        int i = 0; 
        
        while(i != 1)
        {
            
            DataAnalysis.Update();
            ArrayList<Integer>[] graph = DataAnalysis.getGraph();
            
            System.out.println(graph);
            
            try
            {
                Thread.sleep(d);
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            double divide = 1; 
            
            for(int j = 0; j < 11; j++)
            {
                divide = divide + graph[j].size();
                System.out.println(divide);
            }
            if(divide != 0)
                divide = 279 / divide;
            
            
            
            bar1.setSize(bar1.getWidth(), (int)(graph[0].size() * divide));
            bar2.setSize(bar1.getWidth(), (int)(graph[1].size() * divide));
            bar3.setSize(bar1.getWidth(), (int)(graph[2].size() * divide));
            bar4.setSize(bar1.getWidth(), (int)(graph[3].size() * divide));
            bar5.setSize(bar1.getWidth(), (int)(graph[4].size() * divide));
            bar6.setSize(bar1.getWidth(), (int)(graph[5].size() * divide));
            bar7.setSize(bar1.getWidth(), (int)(graph[6].size() * divide));
            bar8.setSize(bar1.getWidth(), (int)(graph[7].size() * divide));
            bar9.setSize(bar1.getWidth(), (int)(graph[8].size() * divide));
            bar10.setSize(bar1.getWidth(), (int)(graph[9].size() * divide));
            bar11.setSize(bar1.getWidth(), (int)(graph[10].size() * divide));
        }
    }
    
    public void setD(int a)
    {
        d = a;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        bar3 = new javax.swing.JLabel();
        bar4 = new javax.swing.JLabel();
        bar5 = new javax.swing.JLabel();
        bar6 = new javax.swing.JLabel();
        bar7 = new javax.swing.JLabel();
        bar8 = new javax.swing.JLabel();
        bar9 = new javax.swing.JLabel();
        bar10 = new javax.swing.JLabel();
        bar11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph");
        setMaximumSize(new java.awt.Dimension(610, 500));
        setMinimumSize(new java.awt.Dimension(610, 500));
        setPreferredSize(new java.awt.Dimension(610, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Graph");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red.png"))); // NOI18N
        bar11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bar11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bar11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar10, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar9, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 410, 340);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Results");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 314, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 10, 160, 340);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(430, 10, 160, 140);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 360, 580, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar10;
    private javax.swing.JLabel bar11;
    private javax.swing.JLabel bar2;
    private javax.swing.JLabel bar3;
    private javax.swing.JLabel bar4;
    private javax.swing.JLabel bar5;
    private javax.swing.JLabel bar6;
    private javax.swing.JLabel bar7;
    private javax.swing.JLabel bar8;
    private javax.swing.JLabel bar9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}

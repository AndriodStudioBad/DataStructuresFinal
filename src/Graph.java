
import java.awt.Dimension;
import java.util.ArrayList;
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

    private Thread t, t2;
    private int d;
    private ArrayList<Integer>[] array;
    
    public Graph() {
        initComponents();
        d = 15; 
        
        array = DataAnalysis.getGraph();

        t = new Thread(updater);
        t2 = new Thread(table);
        t.start();
        t2.start();
    }

    Runnable updater = new Runnable(){
            public void run(){
                update();                
            }
        };
    
    Runnable table = new Runnable(){
            public void run(){
                tableSetUp();                
            }
        };

    
    public void update()
    {
        int i = 0;
        while(i != 1)
        {
            DataAnalysis.Update();
            ArrayList<Integer>[] graph = DataAnalysis.getGraph();
            
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
            }
            if(divide != 0)
                divide = 279 / divide;
            
            bar1.setSize(bar1.getWidth(), (int)(graph[0].size() * divide));
            bar1.setLocation(bar1.getX(), (int)(279-graph[0].size() * divide));
            
            bar2.setSize(bar1.getWidth(), (int)(graph[1].size() * divide));
            bar2.setLocation(bar2.getX(), (int)(279-graph[1].size() * divide));
            
            bar3.setSize(bar1.getWidth(), (int)(graph[2].size() * divide));
            bar3.setLocation(bar3.getX(), (int)(279-graph[2].size() * divide));
            
            bar4.setSize(bar1.getWidth(), (int)(graph[3].size() * divide));
            bar4.setLocation(bar4.getX(), (int)(279-graph[3].size() * divide));
            
            bar5.setSize(bar1.getWidth(), (int)(graph[4].size() * divide));
            bar5.setLocation(bar5.getX(), (int)(279-graph[4].size() * divide));
            
            bar6.setSize(bar1.getWidth(), (int)(graph[5].size() * divide));
            bar6.setLocation(bar6.getX(), (int)(279-graph[5].size() * divide));
            
            bar7.setSize(bar1.getWidth(), (int)(graph[6].size() * divide));
            bar7.setLocation(bar7.getX(), (int)(279-graph[6].size() * divide));
            
            bar8.setSize(bar1.getWidth(), (int)(graph[7].size() * divide));
            bar8.setLocation(bar8.getX(), (int)(279-graph[7].size() * divide));
            
            bar9.setSize(bar1.getWidth(), (int)(graph[8].size() * divide));
            bar9.setLocation(bar9.getX(), (int)(279-graph[8].size() * divide));
            
            bar10.setSize(bar1.getWidth(), (int)(graph[9].size() * divide));
            bar10.setLocation(bar10.getX(), (int)(279-graph[9].size() * divide));
            
            bar11.setSize(bar1.getWidth(), (int)(graph[10].size() * divide));
            bar11.setLocation(bar11.getX(), (int)(279-graph[10].size() * divide));
        }
    }
    
    public void tableSetUp()
    {
        int i = 1;
        while(i != 0)
        {
        try
            {
                Thread.sleep(d);
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        
        
        int temp = 0;
            try
            {
                temp = TreeBall.getRecent();
            }
            catch(Exception e)
            {
                temp = 12;
            }
            
           
            switch(temp)
            {
                case 0:
                slot1.setText(TreeBall.getBellCurve()[0] + "");
                break;
                
                case 1:
                slot2.setText(TreeBall.getBellCurve()[1] + "");
                break;
                
                case 2:
                slot3.setText(TreeBall.getBellCurve()[2] + "");
                break;
                
                case 3:
                slot4.setText(TreeBall.getBellCurve()[3] + "");
                break;
                
                case 4:
                slot5.setText(TreeBall.getBellCurve()[4] + "");
                break;
                
                case 5:
                slot6.setText(TreeBall.getBellCurve()[5] + "");
                break;
                
                case 6:
                slot7.setText(TreeBall.getBellCurve()[6] + "");
                break;
                
                case 7:
                slot8.setText(TreeBall.getBellCurve()[7] + "");
                break;
                
                case 8:
                slot9.setText(TreeBall.getBellCurve()[8] + "");
                break;
                
                case 9:
                slot10.setText(TreeBall.getBellCurve()[9] + "");
                break;
                
                case 10:
                slot11.setText(TreeBall.getBellCurve()[10] + "");
                break;
                
                default:
                break;
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        slot11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        slot1 = new javax.swing.JLabel();
        slot2 = new javax.swing.JLabel();
        slot3 = new javax.swing.JLabel();
        slot4 = new javax.swing.JLabel();
        slot5 = new javax.swing.JLabel();
        slot6 = new javax.swing.JLabel();
        slot7 = new javax.swing.JLabel();
        slot8 = new javax.swing.JLabel();
        slot9 = new javax.swing.JLabel();
        slot10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Results");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(51, 2, 56, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Slot #");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 30, 34, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Amount of Balls");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(64, 30, 85, 15);

        slot11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot11.setText("0");
        jPanel2.add(slot11);
        slot11.setBounds(50, 250, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 50, 34, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 70, 34, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("3");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 90, 34, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("4");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 110, 34, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("5");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 130, 34, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("6");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 150, 34, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("7");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 170, 34, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("8");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 190, 34, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("9");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 210, 34, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("10");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 230, 34, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("11");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 250, 34, 20);

        slot1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot1.setText("0");
        jPanel2.add(slot1);
        slot1.setBounds(50, 50, 110, 20);

        slot2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot2.setText("0");
        jPanel2.add(slot2);
        slot2.setBounds(50, 70, 110, 20);

        slot3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot3.setText("0");
        jPanel2.add(slot3);
        slot3.setBounds(50, 90, 110, 20);

        slot4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot4.setText("0");
        jPanel2.add(slot4);
        slot4.setBounds(50, 110, 110, 20);

        slot5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot5.setText("0");
        jPanel2.add(slot5);
        slot5.setBounds(50, 130, 110, 20);

        slot6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot6.setText("0");
        jPanel2.add(slot6);
        slot6.setBounds(50, 150, 110, 20);

        slot7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot7.setText("0");
        jPanel2.add(slot7);
        slot7.setBounds(50, 170, 110, 20);

        slot8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot8.setText("0");
        jPanel2.add(slot8);
        slot8.setBounds(50, 190, 110, 20);

        slot9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot9.setText("0");
        jPanel2.add(slot9);
        slot9.setBounds(50, 210, 110, 20);

        slot10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slot10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot10.setText("0");
        jPanel2.add(slot10);
        slot10.setBounds(50, 230, 110, 20);

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
        jLabel1.setText("A bell curve is a graph of a normal (Gaussian) distribution, with a large rounded peak tapering");
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("values of either sides. For example, the ball has around a 0.00097% chance of hitting one of ");
        jLabel6.setToolTipText("");
        jLabel6.setAutoscrolls(true);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("away at each end. The values in the center of the graph will be exponentally better then the");
        jLabel7.setToolTipText("");
        jLabel7.setAutoscrolls(true);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("the far ends of the graph.");
        jLabel19.setToolTipText("");
        jLabel19.setAutoscrolls(true);
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel slot1;
    private javax.swing.JLabel slot10;
    private javax.swing.JLabel slot11;
    private javax.swing.JLabel slot2;
    private javax.swing.JLabel slot3;
    private javax.swing.JLabel slot4;
    private javax.swing.JLabel slot5;
    private javax.swing.JLabel slot6;
    private javax.swing.JLabel slot7;
    private javax.swing.JLabel slot8;
    private javax.swing.JLabel slot9;
    // End of variables declaration//GEN-END:variables
}

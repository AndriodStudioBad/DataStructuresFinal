
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class BellCurve extends javax.swing.JFrame {

    private int d;
    private Thread t, t2, t3, t4, t5, t6;
    private final double coefficient;
    private TreeBall data;
    
    private Graph frame;
    
    public BellCurve() {
        initComponents();
        d = 15;
        t = new Thread(ball_one);
        t2 = new Thread(ball_two);
        t3 = new Thread(ball_three);
        t4 = new Thread(ball_four);
        t5 = new Thread(ball_five);
        t6 = new Thread(ball_six);
        
        data = new TreeBall();
        
        ball2.setVisible(false);
        ball3.setVisible(false);
        ball4.setVisible(false);
        ball5.setVisible(false);
        ball6.setVisible(false);
        
        frame = new Graph();
        frame.setD(d);
        frame.setLocation(700, 0);
        frame.setVisible(true);
        
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        coefficient = (1/22.50);
    }

    Runnable ball_one = new Runnable(){
            public void run(){
                ballOneFall();                
            }
        };
    
    Runnable ball_two = new Runnable(){
            public void run(){
                ballTwoFall();                
            }
        };
    
    Runnable ball_three = new Runnable(){
            public void run(){
                ballThreeFall();                
            }
        };
    
    Runnable ball_four = new Runnable(){
            public void run(){
              ballFourFall();                
            }
        };
    
    Runnable ball_five = new Runnable(){
            public void run(){
              ballFiveFall();                
            }
        };
    
    Runnable ball_six = new Runnable(){
            public void run(){
              ballSixFall();                
            }
        };

    private void ballOneFall()
    {
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball1.setLocation((int)(ball1.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                    if(Math.random() > 0.5)
                    {
                        x = 1;
                        output = output + "R";
                    }
                    else
                    {
                         x = -1;
                         output = output + "L";
                    }
                }
                counter = 0; 
                flag = true; 
                levels++;
            }
            y = 1;
            x = 0;
            data.ProcessData(output);
            flag = false;
            levels = 0;
            output = new String();
            counter = 0;
            
            for(int q = 0; q < 30; q++)
            {
                ball1.setLocation(ball1.getX(), ball1.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            
            ball1.setLocation(340, 0);
           
        }
    }
    
    private void ballTwoFall()
    {
        
        ball2.setLocation(340, ball2.getY() - 60);
        for(int i = 0; i < 60; i++)
        {
            ball2.setLocation(ball2.getX(), ball2.getY() + 1);
            try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        ball2.setVisible(true);
        
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball2.setLocation((int)(ball2.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                if(Math.random() > 0.5)
                {
                    x = 1;
                    output = output + "R";
                }
                else
                {
                     x = -1;
                     output = output + "L";
                }
                }
                counter = 0; 
                flag = true; 
                levels++;
            }
            y = 1;
            x = 0;
            flag = false;
            levels = 0;
            data.ProcessData(output);
            output = new String();
            counter = 0;
            
            for(int q = 0; q < 30; q++)
            {
                ball2.setLocation(ball2.getX(), ball2.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            ball2.setLocation(340, 0);
        }
    }
    
    
    
    private void ballThreeFall()
    {
        
        ball3.setLocation(340, ball3.getY() - 120);
        for(int i = 0; i < 120; i++)
        {
            ball3.setLocation(ball3.getX(), ball3.getY() + 1);
            try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        ball3.setVisible(true);
        
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball3.setLocation((int)(ball3.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                if(Math.random() > 0.5)
                {
                    x = 1;
                    output = output + "R";
                }
                else
                {
                     x = -1;
                     output = output + "L";
                }
                }
                counter = 0; 
                flag = true; 
                levels++;
            }
            y = 1;
            x = 0;
            flag = false;
            levels = 0;
            data.ProcessData(output);
            output = new String();
            counter = 0;
            
            for(int q = 0; q < 30; q++)
            {
                ball3.setLocation(ball3.getX(), ball3.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            ball3.setLocation(340, 0);
        }

    }
    
    private void ballFourFall()
    {
        ball4.setLocation(340, ball4.getY() - 180);
        for(int i = 0; i < 180; i++)
        {
            ball4.setLocation(ball4.getX(), ball4.getY() + 1);
            try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        ball4.setVisible(true);
        
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball4.setLocation((int)(ball4.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                
                if(Math.random() > 0.5)
                {
                    x = 1;
                    output = output + "R";
                }
                else
                {
                     x = -1;
                     output = output + "L";
                }
                }
                counter = 0; 
                flag = true; 
                levels++;
            }
            y = 1;
            x = 0;
            flag = false;
            levels = 0;
            data.ProcessData(output);
            output = new String();
            counter = 0;
            
            for(int q = 0; q < 30; q++)
            {
                ball4.setLocation(ball4.getX(), ball4.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            ball4.setLocation(340, 0);
        
    }
    }
    
    private void ballFiveFall()
    {
        ball5.setLocation(340, ball5.getY() - 240);
        for(int i = 0; i < 240; i++)
        {
            ball5.setLocation(ball5.getX(), ball5.getY() + 1);
            try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        ball5.setVisible(true);
        
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
        {

            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball5.setLocation((int)(ball5.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                if(Math.random() > 0.5)
                {
                    x = 1;
                    output = output + "R";
                }
                else
                {
                     x = -1;
                     output = output + "L";
                }
                }
                counter = 0; 
                flag = true; 
                levels++;
            }
            y = 1;
            x = 0;
            flag = false;
            levels = 0;
            data.ProcessData(output);
            output = new String();
            counter = 0;
            
            for(int q = 0; q < 30; q++)
            {
                ball5.setLocation(ball5.getX(), ball5.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            ball5.setLocation(340, 0);
        }
        }
    }
    
    private void ballSixFall()
    {
        ball6.setLocation(340, ball6.getY() - 300);
        for(int i = 0; i < 300; i++)
        {
            ball6.setLocation(ball6.getX(), ball6.getY() + 1);
            try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        ball6.setVisible(true);
        
        String output = "";
        int y = 1; 
        boolean flag = false;
        double x = 0;
        int counter = 0;
        int levels = 0; 
        double calc = 0; 
        
        for(int i = 0; i < (3000); i++)
        {
            while(levels < 11)
            {
                while(counter != 30)
                {
                    calc = coefficient * Math.pow(counter, 2);
                    ball6.setLocation((int)(ball6.getX() + x), (int)((levels*40)+(calc)) - 7);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    counter++;
                }
                
                if(levels < 10)
                {
                
                if(Math.random() > 0.5)
                {
                    x = 1;
                    output = output + "R";
                }
                else
                {
                     x = -1;
                     output = output + "L";
                }
                }
                counter = 0; 
                flag = true; 
                levels++;            
            }
            
            y = 1;
            x = 0;
            flag = false;
            levels = 0;
            data.ProcessData(output);
            output = new String();
            counter = 0;
        
            
            for(int q = 0; q < 30; q++)
            {
                ball6.setLocation(ball6.getX(), ball6.getY() + 1);
                    try {
                        Thread.sleep(d);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BellCurve.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            ball6.setLocation(340, 0);
        }
    }
    
        
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ball1 = new javax.swing.JLabel();
        row3b1 = new javax.swing.JLabel();
        row5b3 = new javax.swing.JLabel();
        row9b4 = new javax.swing.JLabel();
        row7b5 = new javax.swing.JLabel();
        row1b2 = new javax.swing.JLabel();
        row4b3 = new javax.swing.JLabel();
        row6b4 = new javax.swing.JLabel();
        row8b5 = new javax.swing.JLabel();
        row8b6 = new javax.swing.JLabel();
        row1b3 = new javax.swing.JLabel();
        row4b4 = new javax.swing.JLabel();
        row6b5 = new javax.swing.JLabel();
        row8b7 = new javax.swing.JLabel();
        row8b8 = new javax.swing.JLabel();
        row3b2 = new javax.swing.JLabel();
        row3b3 = new javax.swing.JLabel();
        row5b4 = new javax.swing.JLabel();
        row5b5 = new javax.swing.JLabel();
        row5b6 = new javax.swing.JLabel();
        row3b4 = new javax.swing.JLabel();
        row3b5 = new javax.swing.JLabel();
        row5b7 = new javax.swing.JLabel();
        row5b8 = new javax.swing.JLabel();
        row5b9 = new javax.swing.JLabel();
        row4b5 = new javax.swing.JLabel();
        row6b6 = new javax.swing.JLabel();
        row8b3 = new javax.swing.JLabel();
        row10b8 = new javax.swing.JLabel();
        row4b6 = new javax.swing.JLabel();
        row6b7 = new javax.swing.JLabel();
        row8b4 = new javax.swing.JLabel();
        row10b9 = new javax.swing.JLabel();
        row5b10 = new javax.swing.JLabel();
        row7b11 = new javax.swing.JLabel();
        row7b12 = new javax.swing.JLabel();
        row5b11 = new javax.swing.JLabel();
        row7b13 = new javax.swing.JLabel();
        row7b14 = new javax.swing.JLabel();
        row6b8 = new javax.swing.JLabel();
        row6b9 = new javax.swing.JLabel();
        row6b10 = new javax.swing.JLabel();
        row6b11 = new javax.swing.JLabel();
        row6b12 = new javax.swing.JLabel();
        row6b13 = new javax.swing.JLabel();
        row7b15 = new javax.swing.JLabel();
        row7b16 = new javax.swing.JLabel();
        row7b17 = new javax.swing.JLabel();
        row7b18 = new javax.swing.JLabel();
        row6b14 = new javax.swing.JLabel();
        row6b15 = new javax.swing.JLabel();
        row6b16 = new javax.swing.JLabel();
        row6b17 = new javax.swing.JLabel();
        row7b19 = new javax.swing.JLabel();
        row7b20 = new javax.swing.JLabel();
        row6b18 = new javax.swing.JLabel();
        row6b19 = new javax.swing.JLabel();
        left1 = new javax.swing.JLabel();
        left4 = new javax.swing.JLabel();
        left6 = new javax.swing.JLabel();
        left8 = new javax.swing.JLabel();
        left9 = new javax.swing.JLabel();
        left10 = new javax.swing.JLabel();
        left11 = new javax.swing.JLabel();
        left12 = new javax.swing.JLabel();
        left13 = new javax.swing.JLabel();
        left14 = new javax.swing.JLabel();
        left15 = new javax.swing.JLabel();
        left16 = new javax.swing.JLabel();
        left17 = new javax.swing.JLabel();
        row1b4 = new javax.swing.JLabel();
        row1b5 = new javax.swing.JLabel();
        ball2 = new javax.swing.JLabel();
        ball3 = new javax.swing.JLabel();
        ball4 = new javax.swing.JLabel();
        ball5 = new javax.swing.JLabel();
        ball6 = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        s = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Standard Distribution");
        setMinimumSize(new java.awt.Dimension(690, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        ball1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball1.setToolTipText("");
        getContentPane().add(ball1);
        ball1.setBounds(340, 0, 10, 10);

        row3b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row3b1.setToolTipText("");
        getContentPane().add(row3b1);
        row3b1.setBounds(340, 120, 10, 10);

        row5b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b3.setToolTipText("");
        getContentPane().add(row5b3);
        row5b3.setBounds(340, 200, 10, 10);

        row9b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row9b4.setToolTipText("");
        getContentPane().add(row9b4);
        row9b4.setBounds(340, 360, 10, 10);

        row7b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b5.setToolTipText("");
        getContentPane().add(row7b5);
        row7b5.setBounds(340, 280, 10, 10);

        row1b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row1b2.setToolTipText("");
        getContentPane().add(row1b2);
        row1b2.setBounds(310, 80, 10, 10);

        row4b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row4b3.setToolTipText("");
        getContentPane().add(row4b3);
        row4b3.setBounds(310, 160, 10, 10);

        row6b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b4.setToolTipText("");
        getContentPane().add(row6b4);
        row6b4.setBounds(310, 240, 10, 10);

        row8b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b5.setToolTipText("");
        getContentPane().add(row8b5);
        row8b5.setBounds(310, 320, 10, 10);

        row8b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b6.setToolTipText("");
        getContentPane().add(row8b6);
        row8b6.setBounds(310, 400, 10, 10);

        row1b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row1b3.setToolTipText("");
        getContentPane().add(row1b3);
        row1b3.setBounds(370, 80, 10, 10);

        row4b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row4b4.setToolTipText("");
        getContentPane().add(row4b4);
        row4b4.setBounds(370, 160, 10, 10);

        row6b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b5.setToolTipText("");
        getContentPane().add(row6b5);
        row6b5.setBounds(370, 240, 10, 10);

        row8b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b7.setToolTipText("");
        getContentPane().add(row8b7);
        row8b7.setBounds(370, 320, 10, 10);

        row8b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b8.setToolTipText("");
        getContentPane().add(row8b8);
        row8b8.setBounds(370, 400, 10, 10);

        row3b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row3b2.setToolTipText("");
        getContentPane().add(row3b2);
        row3b2.setBounds(400, 120, 10, 10);

        row3b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row3b3.setToolTipText("");
        getContentPane().add(row3b3);
        row3b3.setBounds(400, 120, 10, 10);

        row5b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b4.setToolTipText("");
        getContentPane().add(row5b4);
        row5b4.setBounds(400, 200, 10, 10);

        row5b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b5.setToolTipText("");
        getContentPane().add(row5b5);
        row5b5.setBounds(400, 280, 10, 10);

        row5b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b6.setToolTipText("");
        getContentPane().add(row5b6);
        row5b6.setBounds(400, 360, 10, 10);

        row3b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row3b4.setToolTipText("");
        getContentPane().add(row3b4);
        row3b4.setBounds(280, 120, 10, 10);

        row3b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row3b5.setToolTipText("");
        getContentPane().add(row3b5);
        row3b5.setBounds(280, 120, 10, 10);

        row5b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b7.setToolTipText("");
        getContentPane().add(row5b7);
        row5b7.setBounds(280, 200, 10, 10);

        row5b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b8.setToolTipText("");
        getContentPane().add(row5b8);
        row5b8.setBounds(280, 280, 10, 10);

        row5b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b9.setToolTipText("");
        getContentPane().add(row5b9);
        row5b9.setBounds(280, 360, 10, 10);

        row4b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row4b5.setToolTipText("");
        getContentPane().add(row4b5);
        row4b5.setBounds(250, 160, 10, 10);

        row6b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b6.setToolTipText("");
        getContentPane().add(row6b6);
        row6b6.setBounds(250, 240, 10, 10);

        row8b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b3.setToolTipText("");
        getContentPane().add(row8b3);
        row8b3.setBounds(250, 320, 10, 10);

        row10b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row10b8.setToolTipText("");
        getContentPane().add(row10b8);
        row10b8.setBounds(250, 400, 10, 10);

        row4b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row4b6.setToolTipText("");
        getContentPane().add(row4b6);
        row4b6.setBounds(430, 160, 10, 10);

        row6b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b7.setToolTipText("");
        getContentPane().add(row6b7);
        row6b7.setBounds(430, 240, 10, 10);

        row8b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row8b4.setToolTipText("");
        getContentPane().add(row8b4);
        row8b4.setBounds(430, 320, 10, 10);

        row10b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row10b9.setToolTipText("");
        getContentPane().add(row10b9);
        row10b9.setBounds(430, 400, 10, 10);

        row5b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b10.setToolTipText("");
        getContentPane().add(row5b10);
        row5b10.setBounds(460, 200, 10, 10);

        row7b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b11.setToolTipText("");
        getContentPane().add(row7b11);
        row7b11.setBounds(460, 280, 10, 10);

        row7b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b12.setToolTipText("");
        getContentPane().add(row7b12);
        row7b12.setBounds(460, 360, 10, 10);

        row5b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row5b11.setToolTipText("");
        getContentPane().add(row5b11);
        row5b11.setBounds(220, 200, 10, 10);

        row7b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b13.setToolTipText("");
        getContentPane().add(row7b13);
        row7b13.setBounds(220, 280, 10, 10);

        row7b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b14.setToolTipText("");
        getContentPane().add(row7b14);
        row7b14.setBounds(220, 360, 10, 10);

        row6b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b8.setToolTipText("");
        getContentPane().add(row6b8);
        row6b8.setBounds(190, 240, 10, 10);

        row6b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b9.setToolTipText("");
        getContentPane().add(row6b9);
        row6b9.setBounds(190, 320, 10, 10);

        row6b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b10.setToolTipText("");
        getContentPane().add(row6b10);
        row6b10.setBounds(190, 400, 10, 10);

        row6b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b11.setToolTipText("");
        getContentPane().add(row6b11);
        row6b11.setBounds(490, 240, 10, 10);

        row6b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b12.setToolTipText("");
        getContentPane().add(row6b12);
        row6b12.setBounds(490, 320, 10, 10);

        row6b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b13.setToolTipText("");
        getContentPane().add(row6b13);
        row6b13.setBounds(490, 400, 10, 10);

        row7b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b15.setToolTipText("");
        getContentPane().add(row7b15);
        row7b15.setBounds(520, 280, 10, 10);

        row7b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b16.setToolTipText("");
        getContentPane().add(row7b16);
        row7b16.setBounds(520, 360, 10, 10);

        row7b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b17.setToolTipText("");
        getContentPane().add(row7b17);
        row7b17.setBounds(160, 280, 10, 10);

        row7b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b18.setToolTipText("");
        getContentPane().add(row7b18);
        row7b18.setBounds(160, 360, 10, 10);

        row6b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b14.setToolTipText("");
        getContentPane().add(row6b14);
        row6b14.setBounds(130, 320, 10, 10);

        row6b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b15.setToolTipText("");
        getContentPane().add(row6b15);
        row6b15.setBounds(130, 400, 10, 10);

        row6b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b16.setToolTipText("");
        getContentPane().add(row6b16);
        row6b16.setBounds(550, 320, 10, 10);

        row6b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b17.setToolTipText("");
        getContentPane().add(row6b17);
        row6b17.setBounds(550, 400, 10, 10);

        row7b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b19.setToolTipText("");
        getContentPane().add(row7b19);
        row7b19.setBounds(580, 360, 10, 10);

        row7b20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row7b20.setToolTipText("");
        getContentPane().add(row7b20);
        row7b20.setBounds(100, 360, 10, 10);

        row6b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b18.setToolTipText("");
        getContentPane().add(row6b18);
        row6b18.setBounds(70, 400, 10, 10);

        row6b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row6b19.setToolTipText("");
        getContentPane().add(row6b19);
        row6b19.setBounds(610, 400, 10, 10);

        left1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left1.setToolTipText("");
        getContentPane().add(left1);
        left1.setBounds(320, 0, 0, 40);

        left4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left4.setToolTipText("");
        left4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left4);
        left4.setBounds(70, 430, 10, 40);

        left6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left6.setToolTipText("");
        left6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left6);
        left6.setBounds(130, 430, 10, 40);

        left8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left8.setToolTipText("");
        left8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left8);
        left8.setBounds(190, 430, 10, 40);

        left9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left9.setToolTipText("");
        left9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left9);
        left9.setBounds(250, 430, 10, 40);

        left10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left10.setToolTipText("");
        left10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left10);
        left10.setBounds(310, 430, 10, 40);

        left11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left11.setToolTipText("");
        left11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left11);
        left11.setBounds(430, 430, 10, 40);

        left12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left12.setToolTipText("");
        left12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left12);
        left12.setBounds(370, 430, 10, 40);

        left13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left13.setToolTipText("");
        left13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left13);
        left13.setBounds(490, 430, 10, 40);

        left14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left14.setToolTipText("");
        left14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left14);
        left14.setBounds(550, 430, 10, 40);

        left15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left15.setToolTipText("");
        left15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left15);
        left15.setBounds(610, 430, 10, 40);

        left16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left16.setToolTipText("");
        left16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left16);
        left16.setBounds(670, 430, 10, 40);

        left17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wall.jpg"))); // NOI18N
        left17.setToolTipText("");
        left17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(left17);
        left17.setBounds(10, 430, 10, 40);

        row1b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row1b4.setToolTipText("");
        getContentPane().add(row1b4);
        row1b4.setBounds(340, 40, 10, 10);

        row1b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bounce.png"))); // NOI18N
        row1b5.setToolTipText("");
        getContentPane().add(row1b5);
        row1b5.setBounds(340, 40, 10, 10);

        ball2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball2.setToolTipText("");
        getContentPane().add(ball2);
        ball2.setBounds(340, 0, 10, 10);

        ball3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball3.setToolTipText("");
        getContentPane().add(ball3);
        ball3.setBounds(340, 0, 10, 10);

        ball4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball4.setToolTipText("");
        getContentPane().add(ball4);
        ball4.setBounds(340, 0, 10, 10);

        ball5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball5.setToolTipText("");
        getContentPane().add(ball5);
        ball5.setBounds(340, 0, 10, 10);

        ball6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N
        ball6.setToolTipText("");
        getContentPane().add(ball6);
        ball6.setBounds(340, 0, 10, 10);

        speedLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        speedLabel.setText("Speed Control");
        getContentPane().add(speedLabel);
        speedLabel.setBounds(570, 20, 90, 15);

        buttonGroup1.add(s);
        s.setSelected(true);
        s.setText("Standard");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        getContentPane().add(s);
        s.setBounds(580, 40, 80, 23);

        buttonGroup1.add(f);
        f.setText("Fast");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        getContentPane().add(f);
        f.setBounds(580, 60, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        d = 5;
        frame.setD(d);
    }//GEN-LAST:event_fActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        d = 15;
        frame.setD(d);
    }//GEN-LAST:event_sActionPerformed

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
            java.util.logging.Logger.getLogger(BellCurve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BellCurve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BellCurve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BellCurve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BellCurve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ball1;
    private javax.swing.JLabel ball2;
    private javax.swing.JLabel ball3;
    private javax.swing.JLabel ball4;
    private javax.swing.JLabel ball5;
    private javax.swing.JLabel ball6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton f;
    private javax.swing.JLabel left1;
    private javax.swing.JLabel left10;
    private javax.swing.JLabel left11;
    private javax.swing.JLabel left12;
    private javax.swing.JLabel left13;
    private javax.swing.JLabel left14;
    private javax.swing.JLabel left15;
    private javax.swing.JLabel left16;
    private javax.swing.JLabel left17;
    private javax.swing.JLabel left4;
    private javax.swing.JLabel left6;
    private javax.swing.JLabel left8;
    private javax.swing.JLabel left9;
    private javax.swing.JLabel row10b8;
    private javax.swing.JLabel row10b9;
    private javax.swing.JLabel row1b2;
    private javax.swing.JLabel row1b3;
    private javax.swing.JLabel row1b4;
    private javax.swing.JLabel row1b5;
    private javax.swing.JLabel row3b1;
    private javax.swing.JLabel row3b2;
    private javax.swing.JLabel row3b3;
    private javax.swing.JLabel row3b4;
    private javax.swing.JLabel row3b5;
    private javax.swing.JLabel row4b3;
    private javax.swing.JLabel row4b4;
    private javax.swing.JLabel row4b5;
    private javax.swing.JLabel row4b6;
    private javax.swing.JLabel row5b10;
    private javax.swing.JLabel row5b11;
    private javax.swing.JLabel row5b3;
    private javax.swing.JLabel row5b4;
    private javax.swing.JLabel row5b5;
    private javax.swing.JLabel row5b6;
    private javax.swing.JLabel row5b7;
    private javax.swing.JLabel row5b8;
    private javax.swing.JLabel row5b9;
    private javax.swing.JLabel row6b10;
    private javax.swing.JLabel row6b11;
    private javax.swing.JLabel row6b12;
    private javax.swing.JLabel row6b13;
    private javax.swing.JLabel row6b14;
    private javax.swing.JLabel row6b15;
    private javax.swing.JLabel row6b16;
    private javax.swing.JLabel row6b17;
    private javax.swing.JLabel row6b18;
    private javax.swing.JLabel row6b19;
    private javax.swing.JLabel row6b4;
    private javax.swing.JLabel row6b5;
    private javax.swing.JLabel row6b6;
    private javax.swing.JLabel row6b7;
    private javax.swing.JLabel row6b8;
    private javax.swing.JLabel row6b9;
    private javax.swing.JLabel row7b11;
    private javax.swing.JLabel row7b12;
    private javax.swing.JLabel row7b13;
    private javax.swing.JLabel row7b14;
    private javax.swing.JLabel row7b15;
    private javax.swing.JLabel row7b16;
    private javax.swing.JLabel row7b17;
    private javax.swing.JLabel row7b18;
    private javax.swing.JLabel row7b19;
    private javax.swing.JLabel row7b20;
    private javax.swing.JLabel row7b5;
    private javax.swing.JLabel row8b3;
    private javax.swing.JLabel row8b4;
    private javax.swing.JLabel row8b5;
    private javax.swing.JLabel row8b6;
    private javax.swing.JLabel row8b7;
    private javax.swing.JLabel row8b8;
    private javax.swing.JLabel row9b4;
    private javax.swing.JRadioButton s;
    private javax.swing.JLabel speedLabel;
    // End of variables declaration//GEN-END:variables
}

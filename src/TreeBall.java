/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakew
 */
public class TreeBall {
    //private Node head;
    private final int levels = 10;
    private int[] Tree;
    private static int[] bellCurve;
    public TreeBall(){
        Tree = new int[(levels/2) * (levels + 1)];
        bellCurve = new int[11];
    }
    
    private static String createBitString(int level){ //currently unused, might be needed later
        String r = Integer.toBinaryString(level);
        while(r.length() < level){
            r = '0' + r;
        }
        return r;
    }
    
    private int locateFromTree(int num, int level){
        return Tree[((level - 1) / 2) * (level /* +-1 cancel out*/) + num];
    }
    
    public void ProcessData(String Bitstring){
        int i = 0;
        int level = 1;
        String t = Bitstring;
        //int numR = 0;
        while(Bitstring.length() > 0 && i < Tree.length && level <= levels){
            Tree[i]++;
            if(Bitstring.charAt(0) == 'L'){
                i += level;
            }else if(Bitstring.charAt(0) == 'R'){
                i += level + 1;
            }
            level++;
            Bitstring = Bitstring.substring(1);
        }
        if(i < Tree.length){
            Tree[i]++;
        }
        processResult(t);
    }
    
    private void processResult(String in){
        int c = 0;
        while(in.contains("R")){
            c++;
            in = in.substring(in.indexOf('R') + 1);
        }
        bellCurve[c]++;
    }
    
    public static int[] getBellCurve(){
        return bellCurve;
    }
    
    
    @Override
    public String toString(){
        String r = "";
        int level = 1;
        int c = 0;
        for(int i = 0; i < Tree.length; i++){
            r += Tree[i] - 9 + '\t';
            if(i >= c){
                level++;
                c += level;
                r += '\n' + " ";
                if(level > levels){ break; }
            }
        }
        return r;
    }
    
}

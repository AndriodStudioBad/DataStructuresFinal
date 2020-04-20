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
    private Node head;
    private final int levels = 10;
    public TreeBall(){
        createTree();
    }
    private void createTree(){
        //this will have a default of 10 levels, and the trees will dual reference the children they share
        head = new Node();
        Node[] previouslevel = new Node[1];
        previouslevel[0] = head;
        Node[] setup = null;
        for(int i = 2; i <= levels + 1; i++){
            setup = new Node[i];
            for(int j = 0; j < i; j++){
                setup[j] = new Node();
            }
            previouslevel[0].setLeft(setup[0]);
            previouslevel[0].setRight(setup[1]);
            for(int c = 1; c < previouslevel.length; c++){
                previouslevel[c].setLeft(setup[c]);
                previouslevel[c].setRight(setup[c + 1]);
            }
            previouslevel[previouslevel.length - 1].setLeft(setup[setup.length - 2]);
            previouslevel[previouslevel.length - 1].setRight(setup[setup.length - 1]);
            
            previouslevel = setup;
        }
        //use a bitstring that resets at the next level to update the bitstring
    }
    
    
    private static String createBitString(int level){ //currently unused, might be needed later
        String r = Integer.toBinaryString(level);
        while(r.length() < level){
            r = '0' + r;
        }
        return r;
    }
    
    private Node locateFromTree(int num, int level){
        if(levels <= level){ return null; }
        //level--;
        Node r = head;
        if(level == 0){return head; }
        while(level > -1){
            if(level > num){
                r = r.getLeftChild();
            }else{
                r = r.getRightChild();
            }
            level--;
        }
        return r;
    }
    
    public void ProcessData(String Bitstring){
        //head.add();
        Node t = head;
        while(Bitstring.length() > 0){
            if(Bitstring.charAt(0) == 'L'){
                if(t.getLeftChild() != null){
                    t = t.getLeftChild();
                    t.add();
                }
            }else if(Bitstring.charAt(0) == 'R'){
                if(t.getRightChild() != null){
                    t = t.getRightChild();
                    t.add();
                }
            }
            Bitstring = Bitstring.substring(1);
        }
        head.add();
    }
    
    @Override
    public String toString(){
        String r = "";
        for(int i = 0; i < levels; i++){
            
            for(int l = 0; l < levels - i - 1; l++){
                    r += '\t';
                }
            for(int c = 0; c <= i; c++){
                if(locateFromTree(c, i) == null){ r += "null \t\t"; }else{
                r += locateFromTree(c, i).getValue() + "\t\t";
                }
            }
            r += '\n';
        }
        return r;
    }
    
}

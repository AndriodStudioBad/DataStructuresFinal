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
        
    }
    private void createTree(){
        //this will have a default of 10 levels, and the trees will dual reference the children they share
        head = new Node();
        for(int i = 1; i <= levels; i++){
            
        }
        //use a bitstring that resets at the next level to update the bitstring
    }
    
    private String createBitString(int level){
        String r = Integer.toBinaryString(level);
        while(r.length() < level){
            r = '0' + r;
        }
        return r;
    }
    
    public void ProcessData(String Bitstring){
        head.add();
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
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembler_1;
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;


import java.util.HashMap;
import javax.swing.JFrame;
/**
 *
 * @author Anant
 */

public class Assembler_1  {
    
    private static void createAndShowGUI() {
        new OpenWindow();
    }
    
    
HashMap<String,String> opTab=new HashMap<String,String>();
public Assembler_1() {
    
opTab.put("ADD","18");
opTab.put("AND","40");
opTab.put("COMP","28");
opTab.put("DIV","24");
opTab.put("J","3C");
opTab.put("JEQ","30");
opTab.put("JGT","34");
opTab.put("JLT","38");
opTab.put("JSUB","48");
opTab.put("LDA","00");
opTab.put("LDCH","50");
opTab.put("LDL","08");
opTab.put("LDX","04");
opTab.put("MUL","20");
opTab.put("OR","44");
opTab.put("RD","D8");
opTab.put("RSUB","4C");
opTab.put("STA","0C");
opTab.put("STCH","54");
opTab.put("STL","14");
opTab.put("STSW","E8");
opTab.put("STX","10");
opTab.put("SUB","1C");
opTab.put("TD","E0");
opTab.put("TIX","2C");
opTab.put("WD","DC");
}

public String[] token(String inputLine){
        String[] CommandArray=new String[2];
     CommandArray=inputLine.split("\t");
     return CommandArray;
     }
HashMap<Integer,Integer> addressTab=new HashMap<Integer,Integer>();

public int SearchOrFill(String inputLine ){
    String[] CommandArray_2=new String[2];
    CommandArray_2 =token(inputLine);
    int key_2=0;
    for(Integer key : addressTab.keySet()){

        if(key== Integer.valueOf(CommandArray_2[1])){
           key_2=addressTab.get(key);

        }
        else{
          addressTab.put(key,setAddress(addressTab.get(key)));
        }
        key_2=addressTab.get(key);
    }
    return key_2;
}

int setAddress(int value){
    Random rand = null;
    int address = rand.nextInt((16384) + 1) ;
return address;
}
public String getOpcode(String inputLine){
    String[] CommandArray_3=new String[2];
    CommandArray_3=token(inputLine);
   String opcode_2=null;
    for(String key:opTab.keySet()){
        if(key.equals(CommandArray_3[0])){
         opcode_2=opTab.get(key);
        }
    }
    return opcode_2;
}
public void join(String op,int key_2,String output){
    String adr_2=Integer.toHexString(key_2);
    output= op.concat(adr_2);
}
public void binary(String input,String F_output){
    int num = (Integer.parseInt(input, 16));
    F_output=Integer.toBinaryString(num);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
OpenWindow ow=new OpenWindow();
}    
// TODO code application logic here
    }


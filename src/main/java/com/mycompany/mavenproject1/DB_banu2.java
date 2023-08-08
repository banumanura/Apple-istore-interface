/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DB_banu2 extends Apple_Stock  {
    
    private static final String FILEPATH ="C:\\Users\\Manura\\Desktop\\New folder\\stock.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
              
    public void additemtotextfile2 (Apple_Stock st) throws IOException 
    {
        try{
        PrintWriter out = null;
        String itemData =st.getPnames()+" "+ st.getPprices()+" "+st.getPcodes()+" "+st.getPversions();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(itemData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Stock added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(DB_banu2.class.getName()).log(Level.SEVERE,null,ex);}
    }
    
    
    public Apple_Stock find(String banu)
            throws IOException {   
        Apple_Stock st = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  detailsitem = readLine.split(" ");
              if(banu.equals(detailsitem[0]))
            {
                st = new Apple_Stock() {
                    @Override
                    void additemtotextfile2() {
                        
                    }
                    
                    
                };
                st.setPnames(detailsitem[0]);
                st.setPprices(detailsitem[1]);
                st.setPcodes(detailsitem[2]);
                st.setPversions(detailsitem[3]);
            }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DB_banu2.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return st;
}

    @Override
    void additemtotextfile2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

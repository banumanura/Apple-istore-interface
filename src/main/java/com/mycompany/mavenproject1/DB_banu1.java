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
public class DB_banu1 {
    
    private static final String FILEPATH ="C:\\Users\\Manura\\Desktop\\New folder\\item.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    public void addItems (Apple_Products item) throws IOException 
    {
        try{
        PrintWriter out = null;
        String itemData =item.getPname()+" "+ item.getPprice()+" "+item.getPcode()+" "+item.getPversion();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(itemData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Product added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(DB_banu1.class.getName()).log(Level.SEVERE,null,ex);
        }  
       
    }

   public Apple_Products addItems(String banu)
            throws IOException {   
        Apple_Products item = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  detailsitem = readLine.split(" ");
              if(banu.equals(detailsitem[0]))
            {
                item = new Apple_Products();
                item.setPname(detailsitem[0]);
                item.setPprice(detailsitem[1]);
                item.setPcode(detailsitem[2]);
                item.setPversion(detailsitem[3]);
            }
            }
            } catch (FileNotFoundException ex) 
                    {
            Logger.getLogger(DB_banu1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return item;
       
        }
    
}


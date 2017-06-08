/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.local.interfaces;
/**
 *
 * @author sirbobby
 */
public class TgameWindow {
    public TgameWindow (String titulo){
 
        javax.swing.JFrame frame = new javax.swing.JFrame(titulo);
 
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(290, 150);
        frame.setVisible(true); 
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String []args){
        TgameWindow ventana = new TgameWindow("Monopoly");               
    }      
}

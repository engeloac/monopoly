/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usr.crazyhorse;

/**
 *
 * @author sirbobby
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        com.usr.controller.Controller controller = new com.usr.controller.Controller();
        com.usr.model.Model model = com.usr.model.Model.getInstace();
        com.local.interfaces.TmainWindow frame = new com.local.interfaces.TmainWindow();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usr.model;

/**
 *
 * @author sirbobby
 */
public class Model {
    private Model(){
    }
    
    public static Model getInstace() {
        if(model == null) {
            model = new com.usr.model.Model();
        }
        return model;
    }
    
    public boolean checkLogIn() {
        boolean logged = false;
        return logged;
    }
    
    private static com.usr.model.Model model;
}

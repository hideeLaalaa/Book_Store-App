/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.awt.Color;

/**
 *
 * @author detun
 */
public class Book_Store {
    
    static String user = "employee";
    static int theme = 0;
    
    static Color lightA = new Color(234,234,244);
    static Color lightB = new Color(240,240,240);
//    static Color lightC = new Color(223,223,245);
    static Color lightC = new Color(204,204,255);
    static Color lightD = new Color(0,0,0);
    static Color lightE = new Color(245,245,255);
    
    static Color darkA = new Color(193,190,190);
    static Color darkB = new Color(204,204,204);
    static Color darkC = new Color(153,153,153);
    static Color darkD = new Color(0,0,0);
    static Color darkE = new Color(236,230,230);
    
    static Color blueE = new Color(232,236,247);
//    static Color blueA = new Color(237,231,237);
//    static Color blueA = new Color(249,249,255);
//    static Color blueA = new Color(148,148,174);
    static Color blueA = new Color(242,249,249);
//    static Color blueC = new Color(118,118,154);
    static Color blueC = new Color(135,135,216);
//    static Color blueC = new Color(150,150,245);
    static Color blueD = new Color(0,0,0);
    static Color blueB = new Color(255,255,255);
    private static Color[] col1 = {lightA,lightB,lightC,lightD,lightE};
    private static Color[] col2 = {darkA,darkB,darkC,darkD,darkE};
    private static Color[] col3 = {blueA,blueB,blueC,blueD,blueE};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LoginPage test = new LoginPage();
        test.setLocation(70, 70);
        test.setVisible(true);
    }
    
    public static Color getColor(int x){
        if(theme==0)
            return col1[x];
        else if(theme==1)
            return col2[x];
        else 
            return col3[x];
    }
    
    public static String getUser(){
        return user;
    }
    
    public void setUser(String userType){
        user = userType;
    }
        
    
}

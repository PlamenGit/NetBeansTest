/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author PI
 */
public class SayColor {
    int colorCode;
    String colorWord;
    
    public String say (int getColorCode){
       this.colorCode = getColorCode; 
        
        
       return seeColor(); 
    }
    
    
    private String seeColor (){
        if (colorCode <= 150){colorWord = "Red"; }
        if (colorCode >= 150 && colorCode <= 300){colorWord = "Green"; }
        if (colorCode >= 300){colorWord = "Blue"; }
        if (colorCode < 0){colorWord = "Out of range"; }
        if (colorCode > 500){colorWord = "Out of range"; }
        
        
        return colorWord;
    }
    
    
}

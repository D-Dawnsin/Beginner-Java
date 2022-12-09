/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg17;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author dawso
 */
public class Lab17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factor = 1;
        int fillvalue=0;
        System.out.println("Matrix coming at you!");
        Matrix mat= new Matrix();
        mat.fillMatrix(fillvalue);
        mat.addAll();
        mat.multiplyMatrix(factor);
        mat.printAll();
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab.pkg17;

/**
 *
 * @author dawso
 */
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    int[][] array = new int[5][5];
    
     public void fillMatrix (int fillvalue)
    {
       
       int row, column;
       Scanner matrix= new Scanner(System.in);
       System.out.println("Enter all of the numbers startig with the first column of numbers: ");
       for (int index=0 ; index<array.length ; index++)
        {
            for (int i=0 ; i<array[index].length ; i++)
                array[index][i]= matrix.nextInt();
            System.out.println();
        }
       System.out.println(Arrays.deepToString(array));
    }
     
    int addAll()
    {
        int sum=0;
        for(int index=0 ; index<array.length ; index++)
        {
            for(int i=0 ; i<array[index].length ; i++)
            sum= sum + array[index][i];
        }
        System.out.println(sum);
        return sum;
       }  
    
    void multiplyMatrix(int factor)
    {
        factor=1;
        for (int index=0 ; index<array.length ; index++)
        {
            for (int i=0 ; i<array[index].length ; i++)
                factor=factor * array[index][i];
        }
        System.out.println(factor);
    }
    
    void printAll()
    {
       for (int index=0 ; index<array.length ; index++)
       {
           for (int i=0 ; i<array[index].length ; i++)
           {
               System.out.print(array[index][i]+" ");
           }
       System.out.println();
       }
    }
    }


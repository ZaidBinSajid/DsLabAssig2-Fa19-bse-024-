/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionlabtask;

import java.util.Scanner;

/**
 *
 * @author Zaid Bin Sajjid
 */
public class RecursionLabTask {

    public static void main(String[] args) {
        
        Scanner s =new Scanner (System.in);
       System.out.println(" Enter decimal number that you want to convert it in binary form");
       int num=s.nextInt();
       System.out.println(FindBinary(num));
     
       
       }
    static int FindBinary(int decimal){
        if(decimal==0)
            return 0;
        else
            return(decimal%2+10*FindBinary(decimal/2));

            }
    
}

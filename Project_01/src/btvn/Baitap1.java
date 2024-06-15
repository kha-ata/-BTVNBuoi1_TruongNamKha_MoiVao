/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn;

/**
 *
 * @author DELL
 */
public class Baitap1 {
   static boolean checkOddNum(int b){
       if(b%2==1)return true;
       else return false;
   }
     
     static boolean checkprime(int a){
         if(a<=1) return false;
         for (int i = 2; i < a; i++) {
             if (a%i==0){
                 return false;
             }
         }
        
        return true;
        
    }
    public static void main(String[] args) {
        int a=5,b=7;
        if (checkprime(a)==true) System.out.println("this is prime");
        else System.out.println("not prime");
         if (checkOddNum(b)==true) System.out.println("odd number");
        else System.out.println("not not odd number");
    }
    
}

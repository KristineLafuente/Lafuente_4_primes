/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_prime_methods;

/**
 *
 * @author Kristine
 */
public class Lafuente_4_prime_methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0;i < 100;i++){
            if(isPrime(i)){}
            System.out.println(i + " is even");
        // TODO code application logic here
    }
 
    }
    /*
    method - is like a little program
    it can recieve and return values to other methods
    */
 static boolean isEven(int n){
     return (n % 2 == 0);
 }   
 static boolean isOdd(int m){
     return (m % 2 != 1 );
     
 }
 
   static boolean isPrime(int p){
       int divisor = 0 ;
       for(int i = 2;i < p;i++) {
           if(p % i == 0) {
               divisor += 1;
           }
       }
       if(divisor > 0){
       return false;
       } else {
           return true;
       }
       //return (divisor == 0);
   }
}
    
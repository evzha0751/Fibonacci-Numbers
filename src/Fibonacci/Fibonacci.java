/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fibonacci;

import java.util.*;
public class Fibonacci {

    public static void FibonacciMethod(int n1,int n2,int index,int i){
    if(i<2){
        n1=1;
        n2=1;
        i+=1;
    }else{
        int x;
        x=n2;
        n2=n1+n2;
        n1=x;
        i+=1;
    }
    
    if(i!=index){
        FibonacciMethod(n1,n2,index,i);
    }else{
        System.out.println("Fibonacci number "+index+" is :"+n2);
    }
    }
    
    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int number = input.nextInt();
       FibonacciMethod(0,0,number,0);
       
    }
    
}

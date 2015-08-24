/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.*;

/**
 *
 * @author sony
 */

class Bank 
{
    protected int w;
    protected String pin;
    protected double balance;
    protected String p,n;
    
     protected void withdrawal()
     {
     }
    
    protected void pinvalid(){
        System.out.println("Enter your PIN");
        Scanner input1 = new Scanner(System.in);
        p = input1.next();
        if(p.equals(pin)){
        }
        else{
            System.out.println("The entered PIN is invalid");
            System.exit(0);
        }
    }
    
    protected void changepin(){
        System.out.println("Enter the old PIN");
        Scanner input1 = new Scanner(System.in);
        p = input1.next();
        if(pin.equals(p)){
            System.out.println("Enter the new PIN");
            Scanner input2 = new Scanner(System.in);
            n = input2.next();
        }
        else if(!pin.equals(p)){
            System.out.println("The entered PIN is invalid");
            System.exit(0);
        }
        pin=n;
    }
    
        
    protected void display(){
        System.out.println("Your transaction is being processed.\n Your balance is "+balance);
    }
    
    void balance_check(){
        System.out.println("Your balance is: "+balance);
    }
    
    void mini_statement(){
       System.out.println("MINI STATEMENT\nYour last withdrawal was Rs : "+w);
    }       

}

public class PNB extends Bank{     
    PNB()
    {
        w = 0;
        pin = "ooo";
        balance = 70000;
    }
    
    @Override
    protected void withdrawal(){
        System.out.println("Enter the amout you want to withdraw");
        Scanner input1 = new Scanner(System.in);
        w = input1.nextInt();
        if((balance-w)>2000){
            balance=balance-w;
        }
        else if((balance-w)<=2000){
            System.out.println("Your account is not having sufficient money");
        }
    }    
}

class SBI extends Bank{
    SBI()
    {
        pin = "aaa";
        balance = 90000;
        w = 0;
    }
    
    @Override
    protected void withdrawal(){
        System.out.println("Enter the amout you want to withdraw");
        Scanner input1 = new Scanner(System.in);
        w = input1.nextInt();
        if((balance-w)>1500){
            balance=balance-w;
        }
        else if((balance-w)<=1500){
            System.out.println("Your account is not having sufficient money");
        }
    }
}
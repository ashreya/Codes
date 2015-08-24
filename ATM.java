/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author sony
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        char ch='y';
        String bname;
        System.out.println("Enter your bank name");
        Scanner input = new Scanner(System.in);
        bname = input.next();
        if(bname.equals("PNB")){
            System.out.println("WELCOME TO PNB");
        }
        else if(!bname.equals("PNB")){
            System.out.println("WELCOME TO SBI");
        }
        
        Bank a=new PNB();
        Bank b=new SBI();
        
        while(ch=='y'||ch=='Y'){
            System.out.println("1.Change PIN\n2.Withdraw\n3.Balance Check\n4.Mini Statement\n Enter your choice.");
            Scanner input1 = new Scanner(System.in);
            choice = input1.nextInt();

            
                   
            switch(choice){
                case 1:
                    if(bname.equals("PNB")){
                        a.changepin();
                    }
                    if(bname.equals("SBI")){
                        b.changepin();
                    }
                    System.out.println("Your PIN is successfully changed.");
                    break;
                case 2:
                    if(bname.equals("PNB")){
                        a.pinvalid();
                        a.withdrawal();
                        a.display();
                    }
                    if(bname.equals("SBI")){
                        b.pinvalid();
                        b.withdrawal();
                        b.display();
                    }
                    
                    break;
                case 3:
                    if(bname.equals("PNB")){
                        a.pinvalid();
                        a.balance_check();
                    }
                    if(bname.equals("SBI")){
                        b.pinvalid();
                        b.balance_check();
                    }
                    break;
                case 4:
                    if(bname.equals("PNB")){
                        a.pinvalid();
                        a.mini_statement();   
                    }
                    if(bname.equals("SBI")){
                        b.pinvalid();
                        b.mini_statement();   
                    }
                   
                    break;
            }
            System.out.println("do u want to continue? y");
            Scanner input2 = new Scanner(System.in);
            ch = input2.next().charAt(0);
        }
    }
}

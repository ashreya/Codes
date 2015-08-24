/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author sony
 * 
 */

public class Binarytree {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        Node d = new Node();
        d.insert(2,4);
        d.insert(7,5);
        d.insert(4,6);
        d.insert(1,9);
        d.insert(5,8);
        System.out.println(d.get(4));
        System.out.println(d.floor(3));
        System.out.println(d.ceil(3));
        d.delete(4);
        d.print();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author sony
 */
class Node {
    
    class Tree{
    int key;
    int data;
    Tree leftchild;
    Tree rightchild;
    
      Tree(int key , int data){
          this.key=key;
          this.data=data;
      }
    }
    
    Tree root;
    
    public void insert(int key , int data){
        
        root=insertNode(key,data,root);
    }
    
    Tree insertNode(int key,int data,Tree x){
        
        if(x==null){
            
            return new Tree(key,data);
            
        }
        
        
        else if(x.key < key){
            
            x.rightchild=insertNode(key,data,x.rightchild);
            
        }
        else if(x.key > key){
            x.leftchild=insertNode(key,data,x.leftchild);
        }
        return x;
        
    }
    
     public int get(int key){
        int x;
        x=getNode(key,root);
        return x;
    }
     
     int getNode(int key,Tree x){
         if(x!=null){
             if(x.key==key){
                 return x.data;
             }
             if(key<x.key){
                 return getNode(key,x.leftchild);
             }
             else if(key>x.key){
                 return getNode(key,x.rightchild);
             }
         }
         return -1;
     }
     
     public Tree Min(){
         Tree temp=getMin(root);
    	 return temp;
     }
      
      Tree getMin(Tree x){
    	  while(x.leftchild != null){
              x=x.leftchild;
    	  }
    	  return x;
      }
      
      public void delete(int  key){
          root= deleteNode(key,root);
      }
      
      
      
      Tree deleteNode(int key ,Tree x){
    	  if(x==null){
              return null;
          }
    	  
    	  if(key < x.key ){
    	      x.leftchild= deleteNode(key,x.leftchild);
          }
    		  
          else if(key > x.key ){
    	      x.rightchild=deleteNode(key,x.rightchild);
          }
          else{
              if(x.leftchild==null){
    	          return x.rightchild;
    	      }
    	      if(x.rightchild==null){
    		  return (x.leftchild);
    	      }

               Tree t = x;
               x = getMin(t.rightchild);
               x.rightchild = deleteNode(x.key,t.rightchild);
               x.leftchild = t.leftchild;
          }
    	  
    	  
    	  return x;
    	  
    	 
    	  
      }
    public void print(){
    	inorder(root);
    }
      void inorder(Tree x){
    	 if(x!=null){
    	     inorder(x.leftchild);
    	     System.out.print(x.key+ ","+x.data+"   ");
    	     inorder(x.rightchild);
         }
      }
    	 
    	 
      public int floor(int key) {
          Tree x = gfloor(root, key);
          if (x == null){
              return -1;
          }
          else{
              return x.key;
          }
      } 

      private Tree gfloor(Tree x, int key) {
          if (x == null){
              return null;
          }
        if (x.key==key){
              return x;
          }
          if (x.key > key){
              return gfloor(x.leftchild, key);
          }
          Tree t = gfloor(x.rightchild, key); 
          if (t != null){
              return t;
          }
          else{
              return x; 
          }
      } 

      public int ceil(int key) {
          Tree x = ceil(root, key);
          if (x == null){
              return -1;
          }
          else{
              return x.key;
          }
      }

      private Tree ceil(Tree x, int key) {
          if (x == null){
              return null;
          }
          
          if (x.key == key){
              return x;
          }
          if (x.key  > key) { 
              Tree t = ceil(x.leftchild, key); 
              if (t != null){
                  return t;
              }
              else{
                  return x;
              } 
          } 
          return ceil(x.rightchild, key); 
      }
      
      void printn(Tree x){
          System.out.println(x.data);
          System.out.println(check(x));
          
      }
      Tree check(Tree x){
         check(x.leftchild);
         return check(x.rightchild);
      }
}
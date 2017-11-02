package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Java program to find sum of
//all leaf nodes of binary tree
public class GFG {

 // user define class node
 static class Node{
     int data;
     Node left, right;
      
     // constructor
     Node(int data){
         this.data = data;
         left = null;
         right = null;
     }
 }
  
 static int sum;
  

 static int leafSum(Node root){
     if (root == null)
         return 0;
   
     // add root data to sum if 
     // root is a leaf node
     if (root.left == null && root.right == null) {
    	// System.out.println(root.data);
         return root.data;
     } else {
    	 return leafSum(root.left) + leafSum(root.right);
     }
 }
 
 static int fullNode(Node root){
     if (root == null)
         return 0;
   
     // add root data to sum if 
     // root is a leaf node
     if (root.left != null && root.right != null) {
    	// System.out.println(root.data);
         return 1;
     } else {
    	 return fullNode(root.left) + fullNode(root.right);
     }
 }
 
 static boolean isSameTree(Node root1, Node root2){
     if (root1 == null && root2 == null)
         return true;
     
     if (root1 == null || root2 == null)
         return false;
     
     return (isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right));
 }
   
 public static void main(String[] args) {

     // create 2 BigDecimal Objects
     BigDecimal bg1, bg2;

     bg1 = new BigDecimal("123.12478");

     // set scale of bg1 to 2 in bg2 using floor as rounding mode
    // bg2 = bg1.setScale(2, RoundingMode.FLOOR);
     bg2 = bg1.setScale(2, BigDecimal.ROUND_HALF_UP);

     String str = bg1 + " after changing the scale to 2 and rounding is " +bg2;

     // print bg2 value
     System.out.println( str );
  }
}
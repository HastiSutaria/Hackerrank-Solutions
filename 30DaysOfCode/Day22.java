import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      int leftHeight=0;
      int rightHeight=0;
      
      if (root.left!=null){
          leftHeight=getHeight(root.left)+1;
      }
      if (root.right!=null){
          rightHeight=getHeight(root.right)+1;
      }
      if (leftHeight>rightHeight){
          return leftHeight;
      }
      else {
          return rightHeight;
      }
    }

	public static Node insert(Node root,int data){

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Btree{
    Node root=null;
    Node insertNode(Node curr){
        if (root==null){
            root=curr;
        }
        else{
            Node temp=root;
            while (true){
                if (temp.data<curr.data){
                    if (temp.right==null){
                        temp.right=curr;
                        break;
                    }
                    temp=temp.right;
                }
                else if (temp.data>=curr.data){
                    if (temp.left==null){
                        temp.left=curr;
                        break;
                    }
                    temp=temp.left;
                }
            }
        }
        return root;
    }
    void printNodes(Node start){
    if (start!=null){
        Node temp=start;
            System.out.print(temp.data+":");
            if (temp.left!=null) {
                System.out.print("L:"+temp.left.data+",");
            }
            if (temp.right!=null) {
                System.out.print("R:"+temp.right.data);
        }
        System.out.println();
        printNodes(temp.left);
        printNodes(temp.right);
    }
    }
    void delete(int val){
        Node temp=root;
        Node prev=null;
        Node rprev=null;
        while (temp!=null){
            if (temp.data==val){
                if (temp.right!=null && temp.left!=null){
                    Node temp2=temp.right;
                    rprev=temp;
                    while (temp2.left!=null){
                        rprev=null;
                        prev=temp2;
                        temp2=temp2.left;
                }
                    temp.data=temp2.data;
                    if (rprev!=null) temp.right=null;
                    if (prev!=null) prev.left=null;
                    break;
                }
                else {
                    if (temp.left==null){
                        if (prev!=null){
                            prev.right=temp.right;
                        }
                        else{
                            root=temp.right;
                            
                        }
                    }
                    else if (temp.right==null){
                        if (prev!=null){
                            prev.left=temp.left;
                        }
                        else{
                            root=temp.left;
                        }
                    }
                    else{
                        temp=null;
                    }
                    break;
                }
            }
            else if (temp.data<val) temp=temp.right;
            else if (temp.data>val) temp=temp.left;
        }
    }
    void search(int val){
        Node temp=root;
        while (temp!=null){
        if (temp.data==val){
            System.out.println("true");
            return;
        }
        else if (temp.data<val) temp=temp.right;
        else if (temp.data>val) temp=temp.left;
        }
        System.out.println("false");
    }
}
public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Btree bst=new Btree();
       int n=sc.nextInt();
        int inp;
        Node root=null;
       for (int i=0;i<n;i++){
           inp=sc.nextInt();
           if (inp==1){
               Node curr=new Node(sc.nextInt());
               root=bst.insertNode(curr);
           }
           else if (inp==2){
               int temp=sc.nextInt();
               bst.delete(temp);
           }
           else if (inp==4){
               bst.printNodes(root);
           }
           else if(inp==3){
               int temp=sc.nextInt();
               bst.search(temp);
           }
       }
    }
}
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    void addNode(int newData){
        Node newnode=new Node(newData);
        Node temp=head;
        if (head==null) head=newnode;
        else{
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void deleteAlt(){
        Node temp=head;
        int flag=0;
        while(temp.next.next!=null){
        if (flag==0){
            temp.next=temp.next.next;
            flag=1;
        }
            else{flag=0;temp=temp.next;}
        }
    }
}

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
       int inp=sc.nextInt();
       while(inp>=0){
           ll.addNode(inp);
           inp=sc.nextInt();
       }
        ll.deleteAlt();
       ll.printList();
       
    }
}
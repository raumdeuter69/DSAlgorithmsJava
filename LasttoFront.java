/*bring the last node to the front. */
import java.util.*;
import java.io.*;
class LinkedList 
{ 
    Node head; 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }
    void push(int new_data)
    {
      Node new_node = new Node(new_data); 
    if (head == null) 
    { 
        head = new Node(new_data); 
        return; 
    } 
    new_node.next = null; 
    Node last = head;  
    while (last.next != null) 
        last = last.next; 
    last.next = new_node; 
    return; 
    }
    void reverse()
    {
      if(head==null || head.next==null)
      return;
      Node tmp=head;
      Node prv=null;
      while (tmp.next != null){
      prv=tmp;
      tmp=tmp.next;}
      tmp.next=head;
      prv.next=null;
      head=tmp;
      return; 
    }
    void print()
    {
      Node tmp=head;
      while(tmp !=null)
      {
        System.out.print(tmp.data+" ");
        tmp=tmp.next;
      }
      System.out.println();
    }
}
public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0)
    {
      int n=sc.nextInt();
      LinkedList ll=new LinkedList();
      for(int i=n;i>0;i--)
      ll.push(sc.nextInt());
      ll.reverse();
      ll.print();
    }
  }
}
/*implementation of linked list in java.Inserting nodes at the end*/

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T--!=0)
{
  LinkedList store=new LinkedList();
  int N=sc.nextInt();
  for(int i=0;i<N;i++)
  {
    int data=sc.nextInt();
    store.insertAtEnd(data);
  }
  
}
  }
}

 class Node{
  int data;
  Node next;
  Node(int data)
  
  {
    this.data=data;
    this.next=null;
    
  }
}
class LinkedList{
  Node head=null;
  void insertAtBeg(int data)
  {
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
  }
  void insertAtEnd(int data)
  {
   Node newNode=new Node(data);
  Node TempNode=head;
  if(head==null)
  {
    head=newNode;
    
  }
  else{
  while(TempNode.next!=null)
  {
    TempNode=TempNode.next;
   
  }
   TempNode.next=newNode;
  }
}
 
}

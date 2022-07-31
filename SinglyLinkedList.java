import java.util.*;

public class SinglyLinkedList{
	
	Node head =null;
	private int size=0;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d) {
          data=d;
          next = null;
    }
		
	}
	
	public int size(){
		return size; 
		
	}
	public void add(int data){
		
		if(head==null)
			head=new Node(data);
		else{
			Node ptr = head;
			while(ptr.next!=null)
				ptr=ptr.next;
			ptr.next=new Node(data);
		}
		    size++;
		    printList();
		    System.out.println("\n");
	}
	
	public void addAt(int data,int index){
	 if(index<=size){
		 Node ptr = head;
		 
		 for(int i=0;i<index;i++){
			 
			 ptr=ptr.next;
			 
		 }
		 if(ptr==head){
			 ptr = new Node(data);
			 ptr.next=head;
			 head=ptr;
			 ptr=null;
		 }else
		 if(ptr.next==null){
			 ptr.next= new Node(data);
			 
		 }
		 else{
			  Node temp = new Node(data);
			  temp.next=ptr.next;
			  ptr.next=temp;
			  temp=null;
			 
		 }
		 size++;
	 }
	 
	 else
		 System.out.println("Index Out of bound");
	}
	public int get(int index){
		
		
		if(index>=size){
		    
		    System.out.println("Index out of bound");
		    return -1;
		};
	 Node ptr=head;
	 for(int i=0;i<index;i++){
		 
		 ptr=ptr.next;
		 
	 }
	 return ptr.data;
		
	}
	
	
	public boolean remove(int data){
		
		Node ptr = head;
		Node prev =ptr;
		
	    while(ptr!=null){
			if(ptr.data==data){
				if(ptr==head){
					head = ptr.next;
					prev=null;
					ptr=null;
					size--;
					
					
				}
				else{
					
					prev.next=ptr.next;
					ptr=null;
					prev=null;
					size--;
				
				}
			return true;
			}
			prev=ptr;
			ptr=ptr.next;
			
		}
		return false;
		
	}
	public void printList(){
	    Node ptr = head;
	    while(ptr!=null){
	        System.out.print(ptr.data + "-->");
	        ptr=ptr.next;
	    }
	    
	}
	
	public static void main(String args[]){
	    SinglyLinkedList ls = new SinglyLinkedList();
	    ls.add(1);
	    ls.add(9);
	    ls.add(5);
	   
	    
	    
	    
	}
	
}
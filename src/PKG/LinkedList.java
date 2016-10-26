package PKG;

public class LinkedList {
 private node head;
 private node tail;
 private int size=0;
 
 public LinkedList()
 {
	 head=null;
	 tail=null;
	 size=0;		 
 }
 

 public void addNode(int num)
 {
 	node newNode=new node(num,null);
 	
 	if(head==null)
 	{
 		head=newNode;
 		tail=newNode;
 	}
 	else
 	{
 		tail.setNext(newNode);
 		tail=newNode;
 	}
 }
  


public void deletNode(int num)
{
	if(head==null)
	{
		System.out.println("Empty List!");
	}
	else
	{
		if(head.getData()==num)
		{
			head=head.getNext();
		}
		else
		{
			node temp=head;
			
			
			while( temp.getNext()!=null && temp.getNext().getData()!=num)
			{
					temp=temp.getNext();	
			}
			if(temp.getNext()!=null)
			{
			temp.setNext(temp.getNext().getNext());
			}
			else{
				System.out.println("Can not find the node");
			}
		}
	}
}
 public node findNode(int num)
 {
	 if(head==null)
	 {
		 System.out.println("Empty list!");
		 return null;
	 }
	 {
	 if(head.getData()==num)
	 {
		 return head;
	 }
	 else
	 {
		 node temp=head;
		 while( temp.getNext()!=null && temp.getNext().getData()!=num)
			{
					temp=temp.getNext();	
			}
			if(temp.getNext()!=null)
			{
				return temp.getNext();
			}
			else{
				System.out.println("Can not find the node");
				return null;
			}
		 
	 }
	 }
 }
 
 public void print()
 {
 	node temp=head;
 	
 	System.out.println("The linked list is: ");
 	while(temp!=null)
 	{
 		System.out.println(temp.getData());
 		temp=temp.getNext();
 	}
 }
  
 
 
}

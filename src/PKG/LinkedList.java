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
 

 public void addNodeBack(int num)
 {
	 node newNode=new node(num,null,tail);

 	if(head==null)
 	{
 		
 		head=newNode;
 		tail=newNode;
 		size++;
 	}
 	else
 	{
 		
 		tail.setNext(newNode);
 		tail=newNode;
 	}
 }
 
 public void addNodeBefore(int num)
 {
	 node newNode=new node(num,head,null);

 	if(head==null)
 	{
 		
 		head=newNode;
 		tail=newNode;
 		size++;
 	}
 	else
 	{
 		head.setPrevious(newNode);
 		head=newNode;
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
				if(temp.getNext()!=tail)
				{
					temp.setNext(temp.getNext().getNext());
					temp.getNext().getNext().setPrevious(temp);
				}
				else{
					tail=temp;
					tail.setNext(null);
				}
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
 
 public void printFromTail()
 {
 	node temp=tail;
 	
 	System.out.println("The linked list is: ");
 	while(temp!=null)
 	{
 		System.out.println(temp.getData());
 		temp=temp.getPrevious();
 	}
 }
  
 
 
}

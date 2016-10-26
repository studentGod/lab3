package PKG;

public class node {

	private int data;
	private node next;
	private node previous;


public node()
{
	this.data=0;
	this.next=null;
	this.previous=null;
}

public node(int data1, node next1, node previous1)
{
	data=data1;
	next=next1;
	previous=previous1;
}
	
public int getData()
{
	return this.data;
}

public void setNext(node n)
{
	next=n;
}

public void setPrevious(node n)
{
	previous=n;
}

public void setData(int data1)
{
	data=data1;
}

public node getNext()
{
	return this.next;
}

public node getPrevious()
{
	return this.previous;
}

}

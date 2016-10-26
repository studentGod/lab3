package PKG;

public class node {

	private int data;
	private node next;


public node()
{
	this.data=0;
	this.next=null;
}

public node(int data1, node next1)
{
	data=data1;
	next=next1;
}
	
public int getData()
{
	return this.data;
}

public void setNext(node n)
{
	next=n;
}

public void setData(int data1)
{
	data=data1;
}

public node getNext()
{
	return this.next;
}

}

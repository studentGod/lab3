package PKG;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li=new LinkedList();
		
		
		
		li.addNodeBack(4);
		li.addNodeBack(3);
		li.addNodeBack(1);
		li.addNodeBefore(44);
		li.addNodeBefore(11);
		li.print();
		
		/*int k=1;
		
		while(k==1||k==2||k==3||k==4)
		{
			System.out.println("Press <1> for adding nodes");
			System.out.println("Press <2> for deleting nodes");
			System.out.println("Press <3> for finding nodes");
			System.out.println("Press <4> for printing nodes");
			Scanner n= new Scanner(System.in);
			k=n.nextInt();
			switch(k)
			{case 1:
				System.out.println("Enter the number you want to add: ");
				Scanner n1= new Scanner(System.in);
				int i=n1.nextInt();
				li.addNode(i);
				break;
			case 2:
				System.out.println("Enter the number you want to delete: ");
				Scanner n2= new Scanner(System.in);
				int j=n2.nextInt();
				li.deletNode(j);
				break;
			case 3:
				System.out.println("Enter the number you want to find: ");
				Scanner n3= new Scanner(System.in);
				int l=n3.nextInt();
				li.findNode(l);
				if(li.findNode(l)!=null)
				{
					System.out.println("Find the node: "+li.findNode(l).getData());
				}
				else
				{
					System.out.println("");
				}
				break;
			case 4:
				li.print();
				break;
			default:
				System.out.println("Exit the program");
			}
	}*/
		

	}

}

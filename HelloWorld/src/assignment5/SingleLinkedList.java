package assignment5;

import java.util.Scanner;
class Node<E>
{
	E data;
	Node head,tail,next;
	public int size;
	public void insert(E element)
	{
		if(head==null)
		{
			Node t=new Node();
			t.data=element;
			
			head=t;
			tail=t;
		}
		else
		{
			Node t=new Node();
			t.data=element;
			tail.next=t;
			tail=tail.next;
		}
		size++;
	}
	public void display()
	{
		System.out.println("elements are");
		Node cur=head;
		while (cur!=null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
		System.out.println("Done");
	}
	public void delete(E del)
	{
		//Node cur=null;
		
		if(head!=null) // Delelte at head of the Linked list
		{
			if(head.data==del)
			{
				head=head.next;
			}
			else if(tail.data==del) // delete at tail of the Linked List
			{
				System.out.println("tail element to delete "+tail.data);
				//Node prev=head;
				Node prev=head;
				while (prev.next!=tail)
				{
					
					prev=prev.next;
					//prev=cur;
				}
				tail=prev;
				tail.next=null;
				
			}
			else // to delete at middle of the Linked list
			{
				Node cur=head.next;
				Node prev=head;
				while (cur!=null)
				{
					if(cur.data==del)
					{
						prev.next=cur.next;
						//cur.next=cur.next;
						break;
					}
					else
					{
						//prev=cur;
						prev=prev.next;
						cur=cur.next;
					}
				}
			}
			
		}
		size--;
		

	}
	public void reverse()
	{
		Node cur,next,loopNode;
		cur=head;
		next=head.next;
		loopNode=null;
		while (next!=null)
		{
			cur.next=loopNode;
			loopNode=cur;
			cur=next;
			next=next.next;


		}
		head=cur;
		head.next=loopNode;
	}

	public void insertAtMiddle(E data){

		Node newNode=new Node();
		newNode.data=data;

		Node temp = head;
		Node current = null;
		int count=size/2;

		for(int i = 0; i < count; i++) {
			//Node current will point to temp
			current = temp;
			//Node temp will point to node next to it.
			temp = temp.next;
		}

		//current will point to new node
		System.out.println("cur datata"+current.data);
		current.next = newNode;
		//new node will point to temp
		newNode.next = temp;

		size++;
	}

};
class SingleLinkedList 
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		Node n=new Node();
		while (true)
		{
			System.out.println("Enter u r choice");
			System.out.println("1 to insert");
			System.out.println("2 to display");
			System.out.println("3 to delete");
			System.out.println("4 to reverse list");
			System.out.println("5 insert at middle");
			System.out.println("6 to exit");


			choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Enter element");
			   int element=sc.nextInt();
				

					n.insert(element);
				
				break;
			case 2:
			   
                n.display();
			break;
			case 3:
				System.out.println("Please element to delete");
				
				int del=sc.nextInt();
				n.delete(del);
				n.display();
				break;
			case 4:
				n.reverse();
				break;

			case 5:
				System.out.println("Please element to insert at middle");

				int m=sc.nextInt();
				n.insertAtMiddle(m);
				break;
			case 6:
				System.exit(0);
			break;
			default:
				System.out.println("Choose correct option");
			
			}
		}
	}
}

//Evan Lyons 3/28/24
//Program One
//This class creates a linked list that can search/remove/insert nodes.

public class List
{
	private Node head = null;
	private int n = 0;
	
	public List(){
		head = head;
		n = n;
	}
	
	public int length(){
		return n;
		
	}
	
	public boolean isEmptyList(){
		if(n == 0)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}	
	}
	
	public Node searchReturn(int key) //returns a pointer to the node x where the key of x = key
	{
		if(head==null)
		{
			return null;
		}
		else{
			Node temp1 = head;
			for(int i = 0; i<n; i++){
				if(key==temp1.getKey()){
					return temp1;
				}
				else {
					temp1 = temp1.getNext();
				}
			}
			return null;
		}
	}
	
	 public Node searchRemove(int key){ //returns a pointer to the node x where the key of x = key and removes it
	 	Node temp2 = head;
	 	if(temp2==null){
	 		return null;
	 	}
	 	else if(head.getKey()==key)
	 	{
	 		head = head.getNext();
	 		n--;
	 		return temp2;
	 	}
	 	else{
			for(int i = 0; i<n; i++){
				if(key==temp2.getNext().getKey()){
					Node tempNext = temp2.getNext();
					temp2.setNext(tempNext.getNext());
					tempNext.setNext(null);
					n--;
					return temp2;
				}
				else {
					temp2 = head.getNext();
				}
			}
			return null;
		}

	 }
	 public void insert(Node x){ //inserts x into the list
	 	if(head==null)
	 	{
	 		head = x;
	 		n++;
	 	}
	 	else
	 	{
	 		Node temp3 = head;
	 		head = x;
	 		head.setNext(temp3);
	 		n++;
	 	}
	 }
	 public void printList(){//prints the keys of each of the nodes of the list in the order
	 Node temp4 = head;
	 	System.out.println(n);
		for(int i = 0; i<n; i++){
			System.out.println(temp4.getKey());
			temp4 = temp4.getNext();
		}
	}
}

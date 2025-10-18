
public class MyLinkedList {
	public static class Node {
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	public static void printLinkedList(Node head) {
		if(head == null) {
			System.out.println("List is empty!");
		}else {
			Node temp = head;
			while(temp != null){ 
				System.out.print(temp.value);
				temp = temp.next;
				
				if(temp != null) {
					System.out.print(" -> ");
				}else {
					System.out.println();
				}
			}
		}
	}
	
	public static Node addToHead(Node headNode, int value) {
		Node newNode = new Node(value);
		
		if(headNode != null) {
			newNode.next = headNode; 
		}
		
		return newNode;
	}
	
	public static Node addToTail(Node headNode, int value) {
		Node newNode = new Node(value);
		
		if(headNode == null) {
			return newNode;
		}else {
			// B1: Xác định LastNode (LastNode.next = NULL)
			Node lastNode = headNode;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			// B2: gán next cho lastNode = new Node
			lastNode.next = newNode;
			
		}
		return headNode;
	}
	
	public static Node addToIndex(Node headNode, int value, int index) {
		
		if(index == 0) {
			return addToHead(headNode, value);
		}else {
			// B1. Tìm vị trí cần thêm
			int count = 0;
			
			Node newNode = new Node(value);
			Node curNode = headNode;
			while(curNode.next != null) {
				count++;
				
				if(count == index) {
					newNode.next = curNode.next;
					curNode.next = newNode;
					break;
				}
				
				curNode = curNode.next;
			}
		}
		return headNode;
	}
	
	// Remove section
	public static Node removeAtHead(Node headNode) {
		if(headNode != null) {
			return headNode.next;
		}
		return headNode;
	}
	
	public static Node removeAtTail(Node headNode) {
		if(headNode == null) {
			return null;
		}
		
		//B1. Xác định last và pervious
		Node lastNode = headNode;
		Node prevNode = null;
		
		while(lastNode.next != null) {
			prevNode = lastNode;
			lastNode = lastNode.next;
		}
		
		if(prevNode == null) {
			return null;
		}else {
			prevNode.next = lastNode.next; // thay bằng = null cũng được cho rõ nghĩa
		}
		
		return headNode;
	}
	
	public static Node removeAtIndex(Node headNode, int index) {
		if(headNode == null || index < 0) {
			return null;
		}
		
		if(index == 0) {
			return removeAtHead(headNode);
		}
		
		Node curNode = headNode;
		Node prevNode = null;
		
		int count = 0;
		boolean bIsFound = false;
		
		while(curNode.next != null) {
			if(count == index) {
				bIsFound = true;
				break;
			}
			prevNode = curNode;
			curNode = curNode.next;
			count++;
		}
		
		// Remove cur
		if(bIsFound) {
			if(prevNode == null) {
				return null;
			}else {
				prevNode.next = curNode.next;
			}
		}
		return headNode;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		 
		n1.next = n2;
		n2.next = n3;
		
		printLinkedList(n1);
		Node newList = addToHead(n1, 7);
		newList = addToTail(n1, 9);
		addToIndex(newList, 0, 3);
		
		printLinkedList(newList);
		
		newList = removeAtTail(newList);
		printLinkedList(newList);
	}
}

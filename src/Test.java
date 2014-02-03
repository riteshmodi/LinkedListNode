
public class Test {

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode();
		head.setVal(0);
		head.setNext(head);
		LinkedListNode current = head;
		
		for(int index=1;index<10;++index){
			current = current.getNext();
			current.setVal(index);
			LinkedListNode next = new LinkedListNode();
			current.setNext(next);
		}
		
		while(head.getNext()!=null){
			System.out.println(head.getVal());
			head=head.getNext();
		}

	}

}

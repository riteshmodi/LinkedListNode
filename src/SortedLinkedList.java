
public class SortedLinkedList {

	public static void main(String[] args) {
		printSortedLinkedList(getLinkedList(new int[]{2,7,13}),getLinkedList(new int[]{1,9,12}));

	}
	
	private static LinkedListNode getLinkedList(int[] x){
		LinkedListNode head = new LinkedListNode();
		head.setVal(0);
		head.setNext(head);
		LinkedListNode current = head;
		
		for(int i:x){
			current = current.getNext();
			current.setVal(i);
			LinkedListNode next = new LinkedListNode();
			current.setNext(next);
		}
		
		return head;
	}
	
	/*private static void printLinkedList(LinkedListNode head){
		while(head.getNext()!=null){
			System.out.println(head.getVal());
			head=head.getNext();
		}
	}*/
	
	private static void printSortedLinkedList(LinkedListNode head1, LinkedListNode head2){
		while(head1.getNext()!=null || head2.getNext()!=null){
			int min=0;
			if(head1.getNext()!=null && head2.getNext()!=null){
				if(head1.getVal()<=head2.getVal()){
					min = head1.getVal();
					head1 = head1.getNext();
				}else{
					min = head2.getVal();
					head2 = head2.getNext();
				}
			}else if(head1.getNext()!=null){
				min = head1.getVal();
				head1 = head1.getNext();
			}else {
				min = head2.getVal();
				head2 = head2.getNext();
			}
			System.out.println(min);
		}
	}

}

    public static Node removeDuplicates(Node head) {
      //Write your code here
for (Node node = head; node != null; node = node.next) {
			while (node.next != null && node.data == node.next.data) {
				node.next = node.next.next;
			}
		}
		return head;
    }

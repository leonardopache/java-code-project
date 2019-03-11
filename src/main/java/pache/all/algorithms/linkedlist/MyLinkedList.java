/**
 * 
 */
package pache.all.algorithms.linkedlist;

/**
 * @author lpache
 *
 */
public class MyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public void createMyLinkedList(T data) {
		this.setHead(new Node<>(data));
		this.setTail(getHead());
	}

	public void insertNodeAtEnd(T data) {
		Node<T> item = new Node<>(data);
		item.setNext(null);
		item.setPrevious(getTail());
		getTail().setNext(item);
		setTail(item);
	}

	public void removeNode(T data) {
		Node<T> item = getHead();
		while (item != null) {
			if (item.getData().equals(data)) {

				if (item.getNext() == null && item.getPrevious() == null) {
					setHead(null);
					setTail(null);
				}

				if (item.equals(head)) {
					item.getNext().setPrevious(null);
					setHead(item.getNext());
				} else if (item.equals(tail)) {
					item.getPrevious().setNext(null);
					setTail(item.getPrevious());
				} else {
					item.getNext().setPrevious(item.getPrevious());
					item.getPrevious().setNext(item.getNext());
				}

				break;
			}
			item = item.getNext();
		}
	}

	public void printList() {
		Node<T> item = head;
		while (item != null) {
			System.out.println(item.getData());
			item = item.getNext();
		}
		System.out.println("============");
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
}

package pache.all.algorithms.linkedlist;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<Employee> myList = new MyLinkedList<>();
		myList.printList();
		
		myList.createMyLinkedList(new Employee("Leonardo", "Pache"));
		myList.printList();
		
		myList.insertNodeAtEnd(new Employee("Arya", "Stark"));
		myList.printList();
		
		myList.insertNodeAtEnd(new Employee("Juicy", "Nepo"));
		myList.printList();
		
		myList.removeNode(new Employee("Arya", "Stark"));
		myList.printList();
		
		myList.removeNode(new Employee("Juicy", "Nepo"));
		myList.printList();
		
		myList.insertNodeAtEnd(new Employee("Arya", "Stark"));
		myList.printList();
		
		myList.removeNode(new Employee("Leonardo", "Pache"));
		myList.printList();
		
		
		MyLinkedList<Car> myListCar = new MyLinkedList<>();
		myListCar.printList();
		
		myListCar.createMyLinkedList(new Car("Ford"));
		myListCar.printList();
		
		myListCar.insertNodeAtEnd(new Car("Ferrari"));
		myListCar.printList();
		
		myListCar.insertNodeAtEnd(new Car("GM"));
		myListCar.printList();
		
		myListCar.removeNode(new Car("Ferrari"));
		myListCar.printList();
		
		myListCar.removeNode(new Car("GM"));
		myListCar.printList();
		
		myListCar.insertNodeAtEnd(new Car("VW"));
		myListCar.printList();
		
		myListCar.removeNode(new Car("Ford"));
		myListCar.printList();
		
	}

}

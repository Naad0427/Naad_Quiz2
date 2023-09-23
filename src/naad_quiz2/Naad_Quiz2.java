/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naad_quiz2;

/**
 *
 * @author Administrator
 */
public class Naad_Quiz2 {

   
     //Number 1
    public static void main(String[] args) {
        class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

   
    boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }

    
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        int targetElement = 3;
        boolean found = linkedList.search(targetElement);

        if (found) {
            System.out.println(targetElement + " found in the linked list.");
        } else {
            System.out.println(targetElement + " not found in the linked list.");
        }
    }
}

    }
    
}



//Number 2
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        if (position == 0) {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

  
    void display() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(1);
        cll.append(2);
        cll.append(3);
        cll.append(4);
        cll.append(5);

        System.out.println("Ambot lamang:");
        cll.display();

        int position = 2;
        int dataToInsert = 10;
        cll.insertAtPosition(dataToInsert, position);

        System.out.println("Inserted " + dataToInsert + " at position " + position + ":");
        cll.display();
    }
}


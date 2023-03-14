package JavaAssessment;

import java.util.LinkedList;
import java.util.List;


//How to remove Nth Node from the end of a linked lis

public class LinkedListOperations {

    static Node head=null;
    static Node tail=null;



    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=next;
        }

    }

    public  void addNode(int data){
        Node new_node=new Node(data);

        if (head==null){

            head=new_node;
            tail=new_node;
        }
        else {
            tail.next=new_node;
            tail=new_node;
        }

    }


    public  void display(Node node){
        Node current=head;

        if (head==null){
            System.out.println("list is empty");
        }
        else {
            while (current!=null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }


    public void deleteLast(){
        Node last1=head;
        Node last=head.next;

        if (head==null){
            System.out.println("List is Empty ");
        }
        else if (head.next==null){

            System.out.print(head);
        }
        while (last.next!=null){
            last1=last;
            last=last.next;
        }

        System.out.println("The deleted element is "+ last.data);
        last1.next=null;
        return;


    }


    public static void main(String[] args){

        LinkedListOperations list1=new LinkedListOperations();

        list1.addNode(2);
        list1.addNode(5);
        list1.addNode(6);
        list1.addNode(9);
        list1.addNode(12);

        list1.display(head);

        list1.deleteLast();

        list1.display(head);
    }


}

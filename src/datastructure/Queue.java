package datastructure;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }
    public Node getFirst(){
        return first;
    }
    public Node getLast(){
        return last;
    }
    public int getLength(){
        return length;
    }
    public void printQueue(){
        Node temp= first;
        while (temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length==0){
            first=newNode;
            last=newNode;
        } else {
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    public Node dequeue(){
        if (length==0){
            return null;
        }
        Node temp = first;
        if (length==1){
            first=null;
            last=null;
        }else {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}

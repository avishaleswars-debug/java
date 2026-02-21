
public class DoubleLinkedList {
    class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
this.data=data;
next=null;
prev=null;
    }}
    Node head;
void append(int data){
    Node newNode =new Node(data);
if(head==null){
    head=newNode;
   // newNode.prev=null;
   }
else {
    Node temp=head;
    while (temp.next!=null) {
      temp=temp.next;  }
        temp.next=newNode;
        newNode.prev=temp;
     }}
     void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
     }
     void reverse(){
        Node current=head;
        Node temp=null;
        while(current!=null){
temp=current.prev;
current.prev=current.next;
current.next=temp;
current=current.prev;

        }
     }
    public static void main(String args[]) {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.append(10);
        dl.append(20);
        dl.append(30);
        dl.reverse();
        dl.print();
 } 
 
}

 class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
      }
 }
public class Linked{
    Node head;
    int lenght(){
        int len=0;
        Node temp=head;
        while(temp!=null ){
            temp=temp.next;
            len++;
        }
        return len;
    }
    boolean contains(int data){
        Node temp=head;
        while(temp!=null ){
            if(temp.data==data)
            return true;
            temp=temp.next;
        }
            
        
return false;
    }
    int search(int data){
        int c=1;
        Node temp=head;
        while(temp!=null && temp.data!=data){
            temp=temp.next;
             c++;
        }
return c;
    }
    int get(int pos){
        Node temp=head;
        for(int i=1;i<pos;i++){
temp=temp.next;
        }
        return temp.data;
    }
    void update(int pos,int data){
     //  Node nNode=new Node(data);
     Node temp=head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
temp.data=data;
    }
    

    void deleteAtPostion(int pos1){
        Node temp=head;
        for (int i = 1; i < pos1-1; i++) {
            temp=temp.next;
        }
temp.next=temp.next.next;
    }
    void insertAtPostion(int pos,int data){
        Node newNode2=new Node(data);
        Node temp=head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
        newNode2.next=temp.next;
        temp.next=newNode2;
    }
    void insertAtBegining(int data){
        Node newNode1=new Node(data);
        if(head==null){
            head=newNode1;
            return;
        }
        newNode1.next=head;
        head=newNode1;
    }
    void append(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        return;
        }
Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        void print(){
            Node current =head;
            while (current!=null) {
                System.out.print(current.data+" ->");
                current = current.next;
            }
            System.out.println("null");
        }
        void pop(){
            head=head.next;
        }
        void rear(){
            Node temp2=head;
if(head==null){
    head=null;
    return;
}
while (temp2.next.next!=null) {
    temp2=temp2.next;
} 
temp2.next=null;
        }
void delete(int key){
    if(head==null)
    return;
    if(head.data==key){
        head=head.next;
    }
  Node current=head;
    while(current.next !=null && current.next.data !=key){
        current=current.next;
    }
    if(current.next !=null){
        current.next=current.next.next;
    }
}
public static void main(String[] args) {
  Linked l=new Linked();
  int n=20;
  l.append(n);
  l.append(40);
  l.append(60);
  l.append(80);
 l.print();
  l.delete(40);
  l.insertAtBegining(100);
  l.insertAtBegining(200);
  l.insertAtPostion(2,90);
  l.deleteAtPostion(3);
 l.pop();
  l.rear();
  System.out.println(l.get(3));
  l.update(3, 500);
System.out.println(l.search(20));
System.out.println(l.contains(20000));
l.append(80);
System.out.println(l.lenght());
  l.print();
    } 
}

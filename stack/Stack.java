
public class Stack {
   int top=-1;
int[] arr=new int[10];
void push(int data){
    top++;
    arr[top]=data;
}
void traverse() {
    for(int i=top;i>=0;i--){
        System.out.println(arr[i]);
    }
}
void peek(){
    System.out.println(arr[0]);
}
int pop(){
    return top--;
}

  
    public static void main(String[] args) {
       Stack node=new Stack();
       node.push(10);
       node.push(20);
       node.push(30);

node.peek();
node.pop();
node.traverse();
    }
}

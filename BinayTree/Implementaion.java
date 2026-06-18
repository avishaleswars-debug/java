import java.util.*;
class Tree{
    Node root;
    
class Node{

Node left;
Node right;
int data;
Node(int data){
    this.data=data;
    left=null;
    right=null;
}}
 void insert(int val){
    root=insertrec(root,val);
}
Node insertrec(Node root,int data){
    if(root==null)return new Node(data);
if(root.data<data){
    root.left=insertrec(root.left, data);
}else{
    root.right=insertrec(root.right, data);
}
return root;
        }
        void preorder(Node root){
              if (root == null) return;
System.out.print(root.data+ " ");
preorder(root.left);
preorder(root.right);
        }
        void postorder(Node root){
              if (root == null) return;
preorder(root.left);
preorder(root.right);
System.out.print(root.data+ " ");

        }
           void inorder(Node root){
              if (root == null) return;
preorder(root.left);
System.out.print(root.data+ " ");
preorder(root.right);


        }
        void levelorder(Node root){
            Queue<Node> queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                Node ele=queue.poll();
                System.out.print(ele.data+" ");
                if(ele.left!=null)queue.offer(ele.left);
                if(ele.right!=null)queue.offer(ele.right);
            }
        }
        Node getroot(){
            return root;
        }
}
class Implementaion{
    public static void main(String[] args) {
        Tree myTree=new Tree();
        myTree.insert(3);
        myTree.insert(8);
        myTree.insert(20);
        myTree.insert(40);
         myTree.insert(30);
      //  myTree.preorder(myTree.getroot());
        myTree.levelorder(myTree.getroot());
     }
}
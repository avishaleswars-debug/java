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
}
class Implementaion{
    public static void main(String[] args) {
        Tree myTree=new Tree();
        myTree.insert(10);
         myTree.insert(10);
        myTree.insert(5);
        myTree.insert(15);
    }
}
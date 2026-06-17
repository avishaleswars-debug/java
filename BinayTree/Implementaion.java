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
        Node getroot(){
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
        myTree.preorder(myTree.getroot());
    }
}
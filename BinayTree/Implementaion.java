class Tree{
    Node root;
    Tree(int val){
        root=new Node(val);
    }
class Node{

Node left;
Node right;
int data;
Node(int data){
    this.data=data;
    left=null;
    right=null;
}


}
void insertatright(Node v,int data){
    Node node =new Node(data);
    v.right=node;
    }
    void insertatleft(Node v,int data){
        Node node =new Node(data);
        v.left=node;
        }
}
class Implementaion{
    public static void main(String[] args) {
        Tree tree = new Tree(10);
tree.insertatright(tree.root,20);
tree.insertatleft(tree.root,30);
    }
}
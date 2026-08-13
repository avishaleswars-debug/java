public class MaxLength {
    Node root;

    // Calculates the maximum height/depth of the tree
    public int findmaxlengthoftree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(findmaxlengthoftree(root.left), findmaxlengthoftree(root.right));
    }
     public int findmaxsumoftree(Node root) {
       
    if (root == null) {
        return 0;
    }
    
    // If a subtree sum is negative, ignore it by taking Math.max with 0
    int leftSum = Math.max(0, findmaxsumoftree(root.left));
    int rightSum = Math.max(0, findmaxsumoftree(root.right));
    
    return root.data + Math.max(leftSum, rightSum);
}
public int findbalancedtree(Node root){
    if(root==null)return 0;
    int l=1+findbalancedtree(root.left);
    int r=1+findbalancedtree(root.right);
    return l-r;
}
    // Finished implementation of the recursive Binary Search Tree (BST) insertion
    public Node insert(Node root, int data) {
        // Base case: If the tree or subtree is empty, create and return the new node
        if (root == null) {
            return new Node(data);
        }

        // Otherwise, recur down the tree based on the data value
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        // Return the unchanged node pointer
        return root;
    }

    public static void main(String[] args) {
        MaxLength tree = new MaxLength();

        // Building a sample binary search tree
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Finding and printing the maximum length (height)
        System.out.println("Maximum length of tree: " + tree.findmaxlengthoftree(tree.root));
    }
}

class Node {
    Node left;
    Node right;
    int data; // Fixed: Changed from type 'Node' to 'int'

    Node(int data) {
        this.data = data;
    }   
}

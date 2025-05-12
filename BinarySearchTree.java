// Node class
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

// Binary Search Tree class
public class BinarySearchTree {
    Node root;

    // Insert a node into the BST
    Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder traversal (Left, Root, Right)
    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes dynamically
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        // Display the tree (in sorted order)
        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal(bst.root);
    }
}

    


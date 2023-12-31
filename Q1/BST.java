// Title: BST
// Description: Binary search tree implementation with some changes to store Product object.

class BST {

    class Node { //I designed my Binary Search Tree to store Product objects in its nodes
        Product key;
        Node left, right;

        public Node(Product item) { //Additionally, I changed the constructor to construct a Node with Product object
            key = item;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    BST(Product value) {
        root = new Node(value);
    }

    void insert(Product key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, Product key) { //I changed the parameter as Product

        if (root == null) {
            root = new Node(key);
            return root;
        }

        else if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public Node search(Node root, Integer key) //I changed the original search method, and I took the key as a Integer because I will search the products by looking their ID numbers
    {
        if (root==null || root.key.ID==key)
            return root;

        if (root.key.ID.compareTo(key)<0) //I used compareTo method because I preferred wrapper class in my parameter
            return search(root.right, key);

        return search(root.left, key);
    }
}
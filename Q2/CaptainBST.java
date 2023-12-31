// Title: Captain Binary Seach Tree Class
// Description: Implementation of Binary Search Tree structure with specified methods for requirements.
public class CaptainBST {
	// root node of BST
	Node root;

	// Constructors

	// Non-parameter constructor
	public CaptainBST() {
		root = null;
	}

	// Constructor with root node parameter
	public CaptainBST(Node root) {
		this.root = root;
	}

	// public insert method which have 2 inputs id and captain info.This method
	// calls 3-parameters insert method.
	public void insert(int id, Captain captain) {

		root = insert(root, id, captain);

	}

	// private insert method with additional 1 parameter which is root type of Node
	private Node insert(Node root, int id, Captain captain) {

		/* If the tree is empty, return a new node with given information */
		if (root == null) {
			root = new Node(id, captain);
			return root;
		}

		/* Otherwise, recur down the tree */
		else if (id < root.id)
			root.left = insert(root.left, id, captain);
		else if (id > root.id)
			root.right = insert(root.right, id, captain);

		/* return the (unchanged) node pointer */
		return root;
	}

	// Private recursive method for searching Node in BST for given id and root
	// information
	private Node search(Node root, int id) {
		// Root is null or id equals to current node's id.
		if (root == null || root.id == id)
			return root;

		// Id is greater than root's id
		// Search on right subtree of Node.
		if (root.id < id)
			return search(root.right, id);

		// Id is smaller than root's id
		// Search on left subtree of Node.
		return search(root.left, id);
	}

	// private contains method with id parameter. This method calls recursive
	// 2-parameter contains method.
	public boolean contains(int id) {
		return contains(root, id);
	}

	// Public recursive contains method with 2 parameters id and current node.
	private boolean contains(Node current, int id) {
		// if current node is null.
		if (current == null) {
			return false;
		}

		// if given id equals to current node's id.
		if (id == current.id) {
			return true;
		}

		// Otherwise search on left or right subtree of Node
		return id < current.id ? contains(current.left, id) : contains(current.right, id);
	}

	// Print in order method which represents In Order Traversal. This method calls
	// recursive 1-parameter print in order method.
	public void printInorder() {
		printInorder(root);
	}

	// Private recursive print in order method with node parameter. This method
	// prints elements of BST smallest to largest.
	private void printInorder(Node current) {
		// if tree is empty
		if (current == null) {
			return;
		}

		// first recur down to left
		printInorder(current.left);

		// then print
		System.out.println("--CAPTAIN:");
		display(current.id);
		System.out.println();

		// lastly print right Node
		printInorder(current.right);
	}

	// Method that finds the minimum value of subtree of given Node.
	private int minValue(Node root) {
		int minv = root.id;
		while (root.left != null) {
			minv = root.left.id;
			root = root.left;
		}
		return minv;
	}

	// public delete method with parameter id. This method calls recursive
	// 2-parameter delete method
	public void delete(int id) {
		root = deleteRec(root, id);
	}

	// recursive delete method with root and id parameters.
	private Node deleteRec(Node root, int id) {
		/* if the tree is empty */
		if (root == null) {
			System.out.println(" Couldn't find any captain with ID number " + id);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (id < root.id)
			root.left = deleteRec(root.left, id);
		else if (id > root.id)
			root.right = deleteRec(root.right, id);

		// if id is same as root's id then this is the node to be deleted
		else {
			System.out.println("The captain " + root.captain.getName() + " left CCR");
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			root.id = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.id);
		}

		return root;
	}

	public void display(int id) {
		Node node = search(root, id);

		if (node != null) {
			String available = node.captain.isAvailable().toString();
			String availableUpperCase = available.substring(0, 1).toUpperCase() + available.substring(1);
			System.out.println("\n\t\t       ID: " + node.id + "\n\t\t       Name: " + node.captain.getName()
					+ "\n\t\t       Available: " + availableUpperCase + "\n\t\t       Rating star: "
					+ node.captain.getRating());
		} else {
			System.out.println("Couldn't find any captain with ID number " + id);
		}
	}

	// Method which checks the availability of captain with given id (takes 1
	// parameter id)
	public void isAvailable(int id) {
		// search node on BST
		Node node = search(root, id);

		// if id does not exists
		if (node == null) {
			System.out.println("Couldn't find any captain with ID number " + id);

		} else {

			if (node.captain.isAvailable()) {
				System.out.println("Reserve a new Ride with captain " + id);
				node.captain.setAvailable(false);
			} else {
				System.out
						.println("The captain " + node.captain.getName() + " is not available. He is on another ride!");
			}
		}
	}

	// Finish method with 2 parameter id and rating. This method finishes the ride
	// of captain with given id.
	public void finish(int id, int rating) {
		Node node = search(root, id);

		// if node does not exists
		if (node == null) {
			System.out.println("Couldn't find any captain with ID number " + id);
		} else {
			// if captain is not in ride
			if (node.captain.isAvailable()) {
				System.out.println("The captain " + node.captain.getName() + " is not in a ride");
			} else {
				System.out.println("Finish ride with captain " + id);
				node.captain.setAvailable(true);
				node.captain.setRating(rating);
				display(id);
			}
		}
	}
}

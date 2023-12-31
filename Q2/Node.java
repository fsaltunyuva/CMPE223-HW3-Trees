// Title: Node Class
// Description: Node class implementation for the Captain Binary Search Tree(CaptainBST)
public class Node {
	// Captain id
	int id;
	// Captain info
	Captain captain;
	Node left;
	Node right;

	public Node(int id, Captain captain) {
		this.id = id;
		this.captain = captain;
		left = null;
		right = null;
	}
}

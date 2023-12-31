// Title: Product
// Description: Product class that stores the values, id, name, and piece of a product. Also, it includes addProduct and isAvailable methods that calls the insert and search methods in BST respectively.

public class Product implements Comparable<Product> { //I implemented the Comparable interface to indicate what should be referenced when comparing product classes
    static BST tree = new BST(); //I created a Binary Search Tree object and marked as static because when a product object is created, the tree must have its place in memory
    Integer ID;
    String name;
    Integer piece;

    public Product(Integer ID, String name, Integer piece) { //Constructor takes its parameters as stated in instructions
        this.ID = ID;
        this.name = name;
        this.piece = piece;
    }

    public static void addProduct (Product product) { //When the addProduct method called, it inserts the given product object into the binary search tree
        tree.insert(product);
        System.out.println(product.toString()); //Also when it adds a product, it prints the values of it (I wrote to toString method as stated in intructions)
    }

    public static void isAvailable(Integer ID){ //When the isAvailable method called, it checks the product object which has the given ID value is in BST or not.
        if(tree.search(tree.root, ID) != null && tree.search(tree.root, ID).key.piece != 0) { //First condition checks that is the object in the tree and the second condition checks that is the piece count is 0
            System.out.println("There are " + tree.search(tree.root, ID).key.piece + " products");
        }
        else { //If the piece count is 0, it should also print this because of the second condition on the if clause
            System.out.println("The product is out of stock!!!");
        }
    }

    public static void printTree(){
        tree.inorder();
    } //I used this method to test the code

    public static void quit(){ //This method quits the system after printing the quit message
        System.out.println("Thank you for using ITS, Good Bye!");
        System.exit(0);
    }


    @Override
    public String toString() { //toString method works as given in the expected output
        return "\t\t\t ID: " + this.ID + "\n \t\t\t Name: " + this.name + "\n \t\t\t Piece: " + this.piece + "\n";
    }


    @Override
    public int compareTo(Product o) { //It is the part that states that, if two products must be compared, they will compare as taking IDs as reference
        if (this.ID>o.ID){
            return 1;
        }
        else if(this.ID<o.ID){
            return -1;
        }
        else{return 0;}
    }



}

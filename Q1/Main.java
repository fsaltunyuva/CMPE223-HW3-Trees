// Title: Main
// Description: Main class that reads the given text file and calls the methods in Product class by checking the input.

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc2 = new Scanner(System.in); //To read the name of the file
        String fileName = sc2.next(); //To read the name of the file
        sc2.close(); //To read the name of the file

        Scanner sc = new Scanner(new File(fileName)); //To read the file itself
        ArrayList<String> inputs = new ArrayList<>(); //An array list that stores the string values in the text file

        int i = 0;
        while (sc.hasNext()) { //Iterates over the text file and adds the string values to array list
            inputs.add(i, sc.next());
            i++;
        }
        int size = inputs.size(); //Represents the size of the array list

        System.out.println("--------------- WELCOME TO ITS SYSTEM ---------------");

        for (int j = 0; j < size; j++) { //Iterates over the array list that stores the strings in text file and behaves according to the command
            if (inputs.get(j).equalsIgnoreCase("add_product")) {
                int id = Integer.parseInt(inputs.get(j + 1)); //It takes the first string value that comes after the add_product and it parses the string value into integer to use in the constructor of product
                String name = inputs.get(j + 2); //It takes the second string value that comes after the add_product and stores as name to use in the constructor of product
                int piece = Integer.parseInt(inputs.get(j + 3)); //It takes the third string value that comes after the add_product and it parses the string value into integer to use in the constructor of product
                Product product = new Product(id, name, piece); //It creates a product object with the parameters that are taken from the text file
                System.out.println("Create Product:");
                Product.addProduct(product); //It calls the (static) addProduct method located in Product class and takes the created product object as parameter
            } else if (inputs.get(j).equalsIgnoreCase("is_available")) {
                int checkPiece = Integer.parseInt(inputs.get(j + 1)); //It takes the value with the same logic in the add_product
                Product.isAvailable(checkPiece); //It calls the (static) isAvailable method located in Product class and takes the integer value that states the ID as paramater
            } else if (inputs.get(j).equalsIgnoreCase("Quit")) {
                Product.quit();
            }
        }

    }
}

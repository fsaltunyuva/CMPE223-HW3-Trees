## Question 1
In this question, you are expected to implement a simple Inventory Tracking System using one of 
the search trees. You must use your own implementation of tree data structure by taking 
inspiration from your textbook or web. You are not allowed to use any external library or .jar file.

In your implementation, for each product, you must keep ID, name and piece in tree data structure.

You should implement three basic operations for your systems, which are:
1. Create product

2. Is the product available

3. Quit

**Create product:** In this function you should create product and store it in your search tree data 
structure. 


**Is the product available:** This function, if the product is in stock, prints to the console how many 
are left. If the product is not found, the message “ The product is out of stock!!!” must be displayed.

**Quit:** This function must stop your program.

**Example Input/Output:**
Inputs must be read from an input.txt file, not from the console but your output must appear in the 
console. You can also find the input.txt file that gives the following output in LMS.


    --------------- WELCOME TO ITS ---------------
    Create Product: 
        ID: 23
        Name: sweatshirt
        Piece: 1
    Create Product: 
        ID: 56
        Name: skirt
        Piece: 2
    Create Product: 
        ID: 95
        Name: hat
        Piece: 6
    There are 1 products 
    There are 2 products 
    The product is out of stock!!!
    Thank you for using ITS, Good Bye!

## Question 2
In this question, a chauffeur-driven rental company (CDRC) asks you to write a management 
system code in java using binary search trees for their captain's salary increase. You must use 
your own implementation of binary search trees by taking inspiration from your textbook or web.
You are not allowed to use any external library or .jar file.

These chauffeurs should be kept in a captain database. In this captain database, for each captain, 
you should keep ID, name, available, and rating star.

In your implementation, you must keep the captain entries in a binary search tree by the ID of the 
captain. No two captains have the same ID!

Your system will have the following functionalities; the details of these functionalities are given 
below (see the end of this document for sample inputs/outputs):

1. Add a captain
2. Delete the captain
3. Print a captain’s information
4. Print all captains’ information
5. Rent a car
6. Finish the ride
7. Quit

**Add a captain:** This function generates a BST node for each captain in the tree. The function is 
followed by two values: the captain ID and the captain’s name. The default value for the rating 
stars will be “0” and the default value of available is “true”.

**Delete the captain:** This function has one value that represents the captain’s ID. The command 
will search for this captain in the tree then remove his/her node from the BST, and it will output 
the “The captain left CDRC” message. If the specified captain is not found, it will output the 
“Couldn’t find any captain with ID number ” message.

**Print a captain’s information:** This function has one value which is the captain ID. It will output 
the name and the rating stars for the specified captain. If the specified captain is not found, it will 
output the “Couldn’t find any captain with ID number ” message.

**Print all captain’s information:** This function prints all captain's IDs, names, available, and 
rating stars.


**Rent a car:** This function has one value which is the captain ID. The command will book a ride 
with the specified captain by changing the available to “false”. If the available for the specified 
captain is already “false”, then output the “The captain is not available. He is on another ride!” 
message. If the specified captain is not found, it will output the “Couldn’t find any captain with 
ID number ” message.

**Finish the ride:** This function has two value which is the captain ID, and the rider satisfaction (0 
or 1). This command will make the specified captain available again by changing the available to 
“true”. The rating stars will affect the captain rating stars. The rating stars will increase by one if 
the rider is satisfied and decrease by one otherwise. (Note: the rating stars is a value between 0 and 
5 only). If the available for the specified captain is already “true”, then output the “The captain is 
4
not in a ride!” message. If the specified captain is not found, it will output the “Couldn’t find any 
captain with ID number ” message.

**Quit:** This function must stop your program.

**Example Input/Output:**

Inputs must be read from an input.txt file, not from the console but your output must appear in the 
console. You can also find the input.txt file that gives the following output in LMS

    --------------- WELCOME TO CDRC SYSTEM ---------------
    Add Captain: Add a new captain record in the System
        ID: 801
        Name: Burak
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 802
        Name: Ahmet
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 803
        Name: Ali
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 804
        Name: Can
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 805
        Name: Yasir
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 806
        Name: Pelin
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Add Captain: Add a new captain record in the System
        ID: 807
        Name: Adem
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    IsAvailable: Reserve a new Ride with captain 801
    ----------------------------------------------------------------
    IsAvailable: Reserve a new Ride with captain 802
    ----------------------------------------------------------------
    IsAvailable: Reserve a new Ride with captain 803
    ----------------------------------------------------------------
    IsAvailable: Couldn't find any captain with ID number 814
    ----------------------------------------------------------------
    IsAvailable: The captain Ali is not available. He is on another ride!
    ----------------------------------------------------------------
    Display Captain: Couldn't find any captain with ID number 820
    ----------------------------------------------------------------
    Display Captain:
        ID: 802
        Name: Ahmet
        Available: False
        Rating star: 0
    ----------------------------------------------------------------
    Finish: Finish ride with captain 801
        ID: 801
        Name: Burak
        Available: True
        Rating star: 0
    ----------------------------------------------------------------
    Finish: Finish ride with captain 802
        ID: 802
        Name: Ahmet
        Available: True
        Rating star: 1
    ----------------------------------------------------------------
    Finish: The captain Adem is not in a ride
    ----------------------------------------------------------------
    Finish: Couldn't find any captain with ID number 811
    ----------------------------------------------------------------
    Delete Captain:The captain Can left CCR
    ----------------------------------------------------------------
    Delete Captain: Couldn't find any captain with ID number 814
    ----------------------------------------------------------------
    ----------ALL CAPTAINS----------
    --CAPTAIN:
        ID: 801
        Name: Burak
        Available: True
        Rating star: 0
    --CAPTAIN:
        ID: 802
        Name: Ahmet
        Available: True
        Rating star: 1
    --CAPTAIN:
        ID: 803
        Name: Ali
        Available: False
        Rating star: 0
    --CAPTAIN:
        ID: 805
        Name: Yasir
        Available: True
        Rating star: 0
    --CAPTAIN:
        ID: 806
        Name: Pelin
        Available: True
        Rating star: 0
    --CAPTAIN:
    ID: 807
        Name: Adem
        Available: True
        Rating star: 0
    Thank you for using CDRC, Good Bye!


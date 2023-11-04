Exercises: Encapsulation
This document defines the exercises for the "Java Advanced" course @ Software University. Please submit your solutions (source code) to all below-described problems in Judge.
1.	Class Box
You are given a geometric figure Box with fields length, width, and height. Model a class Box that can be instantiated by the same three parameters. Expose to the outside world only methods for its surface area, lateral surface area, and its volume (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm).
On the first three lines, you will get the length, width, and height. On the next three lines print the surface area, lateral surface area, and the volume of the box.
A box’s side should not be zero or a negative number. Add data validation for each parameter given to the constructor. Make a private setter that performs data validation internally.

Box
-	length: double
-	width:  double
-	height:  double
+ 	Box (double length, double width, double height)
-	setLength(double): void
-	setWidth(double): void
-	setHeight(double): void
+	calculateSurfaceArea (): double
+	calculateLateralSurfaceArea (): double
+	calculateVolume (): double

Examples
Input	Output
2
-3
4	Width cannot be zero or negative.

2
3
4	Surface Area - 52.00
Lateral Surface Area - 40.00
Volume – 24.00
1.3
1
6	Surface Area - 30.20
Lateral Surface Area - 27.60
Volume - 7.80



2.	Animal Farm
You should be familiar with encapsulation already. For this problem, you’ll need to create a class called Chicken. Chicken should contain several fields, a constructor, and several methods. Your task is to encapsulate or hide anything that is not intended to be viewed or modified from outside the class.

Chicken
-	name: String
-	age: int
+	Chicken(String, int)
-	setName(String) : void
-	setAge (int): void
+	productPerDay (): double
+	toString(): Override
-	calculateProductPerDay() : double

Chicken lives for 15 years. Chicken has a name for sure, at least 1 symbol long. Chicken producing eggs:
•	First 6 years it produces 2 eggs per day [0 - 5].
•	Next 6 years it produces 1 egg per day [6 - 11].
•	And after that, it produces 0.75 eggs per day.

Step 1. Encapsulate Fields
Fields should be private. Leaving fields open for modification from outside the class is potentially dangerous. Make all fields in the Chicken class private.
In case the value inside a field is needed elsewhere, use getters to reveal it.

Step 2. Ensure Classes Have a Correct State
Having getters and setters is useless if you don’t use them. The Chicken constructor modifies the fields directly which is wrong when there are suitable setters available. Modify the constructor to fix this issue.

Step 3. Validate Data Properly
Validate the chicken’s name (it cannot be null, empty, or whitespace). In case of an invalid name, print the exception message "Name cannot be empty."
Validate the age properly, minimum and maximum age are provided, make use of them. In case of invalid age, print the exception message "Age should be between 0 and 15."

Step 4. Hide Internal Logic
If a method is intended to be used only by descendant classes or internally to perform some action, there is no point in keeping them public. The calculateProductPerDay() method is used by the productPerDay() public method. This means the method can safely be hidden inside the Chicken class by declaring it private.

Step 4. Submit Code to Judge
Submit your code as a zip file in Judge. Make sure you have a public Main class with a public static void main method in it.


Examples
Input	Output
Chichi
10	Chicken Chichi (age 10) can produce 1.00 eggs per day.
Chichi
17	Age should be between 0 and 15.
Choko
6	Chicken Choko (age 6) can produce 1.00 eggs per day.



3.	Shopping Spree
Create two classes: class Person and class Product. Each person should have a name, money, and a bag of products. Each product should have a name and cost. The name cannot be an empty string. Be careful about white space in the name. Money and cost cannot be a negative number.
Person
-	name: String
-	money:  double
-	products:  List<Product>
+ 	Person (String,  double)
-	setName (String): void
-	setMoney (double): void
+	buyProduct (Product): void
+	getName(): String
Product
-	name: String
-	cost: double
+ 	Product (String,  double)
-	setCost (double): void
-	setName (String): void
+	getName(): String
+	getCost (): double

Create a program in which each command corresponds to a person buying a product. If the person can afford a product add it to his bag. If a person doesn’t have enough money, print an appropriate exception message:
"{Person name} can't afford {Product name}"
In the first two lines, you are given all people and all products. After all, purchases print every person in the order of appearance and all products that he has bought also in order of appearance. If nothing is bought, print: 
"{Person name} - Nothing bought".
Read commands till you find the line with the "END" command. In case of invalid input (negative money exception message: "Money cannot be negative") or empty name: (empty name exception message "Name cannot be empty") break the program with an appropriate message. See the examples below:

Examples
Input	Output
Peter=11;George=4
Bread=10;Milk=2
Peter Bread
George Milk
George Milk
Peter Milk
END	Peter bought Bread
George bought Milk
George bought Milk
Peter can't afford Milk
Peter - Bread
George - Milk, Milk
Maria=0
Coffee=2
Maria Coffee
END	Maria can't afford Coffee
Maria – Nothing bought
John=-3
Peppers=1
John Peppers
END	Money cannot be negative
Hint
Judge does not work with isBlank() method. You can use trim().isEmpty().


4.	Pizza Calories
A Pizza is made of dough and different toppings. You should model a class Pizza which should have a name, dough, and toppings as fields. Every type of ingredient should have its class.

Pizza
-	name: String
-	dought:  Dough
-	toppings: List<Topping> 
+ 	Piza (String, int numberOfToppings)
-	setToppings(int) : void
-	setName(String) : void
+	setDough(Dough) : void
+	getName(): String
+	addTopping (Topping) : void
+	getOverallCalories () : double

Every ingredient has different fields: the dough can be white or wholegrain and in addition, it can be crispy, chewy, or homemade. The toppings can be of type meat, veggies, cheese, or sauce. Every ingredient should weigh grams and a method for calculating its calories according to its type. Calories per gram are calculated through modifiers. Every ingredient has 2 calories per gram as a base and a modifier that gives the exact calories.


Dough
-	flourType: String
-	bakingTechnique: String
-	weight: double
+ 	Dought (String, String, double)
-	setWeight(double): void
-	setFlourType(String): void
-	setBakingTechnique(String): void
+	calculateCalories (): double 


Topping
-	toppingType: String
-	weight: double
+ 	Topping (String, double)
-	setToppingType (String): void
-	setWeight (double): void
+	calculateCalories (): double


Your job is to model the classes in such a way that they are properly encapsulated and to provide a public method for every pizza that calculates its calories according to the ingredients it has.
Dough Modifiers	Toppings Modifiers
•	White – 1.5;
•	Wholegrain – 1.0;
•	Crispy – 0.9;
•	Chewy – 1.1;
•	Homemade – 1.0;	•	Meat – 1.2;
•	Veggies – 0.8;
•	Cheese – 1.1;
•	Sauce – 0.9; 

For example, the white dough has a modifier of 1.5, a chewy dough has a modifier of 1.1, which means that a white chewy dough weighing 100 grams will have (2 * 100) * 1.5 * 1.1 = 330.00 total calories.
For example, meat has a modifier of 1.2, which means that meat weighing 50 grams will have (2 * 50) * 1.2 = 120.00 total calories.

Data Validation
Data Validation must be in the order of the Input Data.
•	If an invalid flour type or an invalid baking technique is given an exception is thrown with the message "Invalid type of dough.".
•	If dough weight is outside of the range [1..200] throw an exception with the message "Dough weight should be in the range [1..200]."
•	If topping is not one of the provided types throw an exception with the message "Cannot place {name of invalid argument} on top of your pizza."
•	If topping weight is outside of the range [1..50] throw an exception with the message "{Topping type name} weight should be in the range [1..50].".
•	If the name of the pizza is empty, only whitespace or longer than 15 symbols throw an exception with the message "Pizza name should be between 1 and 15 symbols.".
•	If a number of toppings are outside of the range [0..10] throw an exception with the message "Number of toppings should be in range [0..10].".
The input for a pizza consists of several lines:
•	On the first line is the pizza name and the number of toppings it has in the format: 
Pizza {pizzaName} {numberOfToppings}
•	On the second line you will get input for the dough in the format: 
Dough {flourType} {bakingTechnique} {weightInGrams}
•	On the next lines, you will receive every topping the pizza has, until an"END" command is given: 
Topping {toppingType} {weightInGrams}
If the creation of the pizza was successfully printed on a single line the name of the pizza and the total calories it has rounded to the second digit after the decimal point.


Examples
Input	Output
Pizza Meatless 2
Dough Wholegrain Crispy 100
Topping Veggies 50
Topping Cheese 50
END	Meatless - 370.00
Pizza Bulgarian 20
Dough Type500 Bulgarian 100
Topping Cheese 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END	Number of toppings should be in range [0..10].
Pizza Bulgarian 2
Dough Type500 Bulgarian 100
Topping Cheese 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END	Invalid type of dough.
Pizza Bulgarian 2
Dough White Chewy 100
Topping Parmesan 50
Topping Cheese 50
Topping Salami 20
Topping Meat 10
END	Cannot place Parmesan on top of your pizza.

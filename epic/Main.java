package epic;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//we learn
		System.out.println("Hello world!");
		
		//Primitive data types
		int hello = 5;
		double world = 5.0;
		boolean b = false;
		char c = 'd';
		
		// An if statement uses comparison symbols and only outputs a value if it is true
		// Equal to, == Same data type and equal to, == Less than, < Greater than, >
		// Less than or equal to, =< Greater than or equal to, => etc.
		if (b) {
			/* Non-primitive data type
			 * Not only is String special due to being a non primitive data type but it also
			 * uses different methods to return true or false. Simply str.equals("whatever")
			 * shall return you a false, while str.equals("comedy"); shall return you a true
			 */
			String str  = "comedy";
			

			/* So in this case we have two integers and one double
			 * and u is the quotient of y and z, if z was a int then u 
			 * would have printed out 8.0, instead because, z IS infact a 
			 * double, we can actually get an accurate value, same goes 
			 * if y was a double and z was an integer.
			 *
			 * On another note if u was an integer and if z OR y were a double
			 * u will output an error since a double cannot be turned into a 
			 * integer.
			 *
			 * EVEN MORE NOTES: there is another thing called typecasting in which you
			 * can forcefully change the type of a value into the type of your
			 * choice aslong as it is possible, the value shall be change into the
			 * data type you want, in this case I'm changing the integer y into a double
			 * which means I no longer need to declare z as a double to get an accurate 
			 * value.
			 */
			int x = 5;
			int y = 7;
			double z = 57;
			double u = z / (double)y;

			/* Exponents
			 * Math.pow outputs a double for some reason, so your data type has
			 * to be a double
			 */ 
			double d = Math.pow(x,y);

			/* Remainders 
			 * This shall output 1 since 56/5 can only be evenly divided into whole numbers
			 * by removing 1 from 56; 55/5 = 11 
			 */
			int r = 56 % 5; 
			
			System.out.println( hello + " " + str );
			System.out.println( u );
			System.out.println( (d) - x );
			System.out.println( ok(r) );
		}

		if (b) {
			/* Scan for input
			 * To get simple input from the user, java needs the util
			 * Scanner which grabs the input from the user and gives it to java.
			 * Normally to get this data you will set a String datatype to a new variable
			 * and assign the variable sc.next(), however, you are able to get other data
			 * types such as integers by assinging an int value to equal sc.nextInt(),
			 * however however (intentional), the user is now limited to only providing
			 * integers, any other data type will result in a error. The best way to avoid
			 * this is to set the value as a string first and then convert it to whatever
			 * data type you want through some conditions to check if it can be changed into
			 * an integer 
			 *
			 * Oh and btw the \n thing means new line, pretty much simulates you pressing
			 * enter.
			 */

			System.out.print("\nAdder:\nInput a integer: ");

			Scanner sc = new Scanner(System.in);
			
			String scan1 = sc.next();
			
			System.out.print("Input another integer: ");
			
			String scan2 = sc.next();
			
			// The non-primitive object, object, which can be outputed as an integer by
			// typecasting to an interger, very flexible and easy to use.

			Object scanned1;	
			Object scanned2;
			boolean bool;


			/* Here are the try and catch operators
			 * They are used to try a statement, and if that statement outputs any exception
			 * it will catch it and do another statement instead. Over here I'm checking if
			 * the scanned value can be converted to an integer, if it can it will return
			 * true and then output the value + a different value that is also being checked,
			 * if it can't it shall return false and output "That was not an integer"
			 */

			try {
				scanned1 = Integer.parseInt(scan1);
				scanned2 = Integer.parseInt(scan2);
				bool = true;

			} catch(Exception e) {
				scanned1 = "That was not an integer";
				scanned2 = "boo! you suck!"; 
				bool = false;
			}

			if (bool) {
				System.out.print("Sum: ");
				System.out.println((int)scanned1 + (int)scanned2 );
			// If the if statement is not true, check if something else is true
			// Dont worry about || right now
			} else if (scan1.equals("no") || scan2.equals("no")) {
				System.out.println(scanned2);
			// An else statement only occurs if all the other statements are not true 
			} else {
				//Also you can place if and else statements inside of other statements 
				System.out.println(scanned1);
				System.out.println("Do you even know what an integer is?   ");
				String scan3 = sc.nextLine();
				if (scan3.equals("no")) {
					System.out.println(scanned2);
				} else if (scan3.equals("yes")) {
					System.out.println("Then write an integer correctly!");
				} else {
					System.out.println("...");
				}
			}
 
		}
		
		if (b) {
			/* We are now going to learn of multiple if statements inside of a 
			 * singular if statement. For example lets say we want to find out 
			 * if x is greater than another y OR less than z. We can set the 
			 * outcome inside of a single boolean value or an if statement 
			 * simply by using the || operator on the two comparisons, if atleast
			 * one of them is true, the whole value shall be true aswell, but what 
			 * if we wanted a stricter mechanism to only output true if both if 
			 * statements are true? We can use the && operators to this! But what
			 * if we want to get the opposite of a false value and output true?
			 * You can use the ! operator to get the opposite of a equation or even
			 * a value! we can also add them to < > or = signs to get their opposite
			 * value. Not less than, !<, Not equal to, !=  Not greater than, !>
			 *
			 * You can even stack these operators by seperating them with brackets
			 * eg.
			 *
			 * ((x < 7) && (x > 2)) || (x > 4)
			 * Outputs true
			 *
			 * This will do the and operator first and then the or later, simple 
			 * order of operations if you ask me
			 */

			int x = 10;
			int y = 5;
			int z = 7;
			
			// This shall return true
			boolean compare = (x > y) || (x < z);

			// This was supposed to return false but now it returns true because of
			// ! operator
			if ((x > y) && !(x < z)) {
				System.out.println(compare);
			}
		}
		
		if (b) {
			/* Arrays and for loops
			 * There are two ways to set an array, both shown in this example, arrays
			 * are just a list of items of whatever single data type, you can set an
			 * array by predefining its values or by setting how many values it should have.
			 * Arrays are indexed by number, lets say you want to see the first piece
			 * of data on the array, you would expect it to be in index 1 however, it
			 * is actually index 0 since computers start counting from 0, so whatever
			 * value you want to change or get from, you can easily find the index by
			 * subtracting one. 
			 *
			 * For loops can be used with many things to repeat simple
			 * tasks such as printing out the z value of the array in this example
			 * but what is z? It turns out z is just a number that gets 1  added to it
			 * after every iteration of the for loop, it also is the same number that
			 * the for loop uses to know when to stop looping. In this example, we use
			 * z as the index of the array, and because z keeps increasing until it is
			 * 4 or in other words, 1 less than the length of the array. z will go 
			 * through all the elements of the array from 0 to 4 and will print them.
			 */
			

			String[] starr = {"Hello", "hi", "comedy", "chonky", "lemonade"};
			
			String y = starr[2];
			System.out.println(y);

			for (short z = 0 ; z < starr.length;  z++) {
				System.out.println(starr[z]);
				//Note: to find a length of string, use length with parentheses
				//To find the length of an array, use length without parentheses
				if (starr[z].length() >= 6) {
					System.out.println(starr[z] + " is greater than 6 characters!");
				}
			}

			int[] arr = new int[5];
			int x = 2;

			arr[0] = x;

			System.out.println(arr[0]);
			System.out.println(arr[1]);

			Scanner sc = new Scanner(System.in);
			int scan;
			
			//Here we go through all of the values inside of arr and ask the user to input
			//a integer for them
			for (short i = 0; i < arr.length ; i++) {
				System.out.print("Input (No error detection):");
				scan = sc.nextInt();
				arr[i] = scan;
			}
			
			//A for each loop, which simply repeats for all of the values in arr, setting
			//element to the current element inside of the array, u will be our counter.
			short u = 0;
			for (int element:arr) {
				System.out.println(element + " " + u);
				u++;
				//After the 3rd element has been printed out the for loop shall end
				if (u == 3) {break;}
			}
		}

		if (b) {
			// Here we state a while loop to waint until x = hi but also increases the
			// value of y for every iteration
			System.out.println("hello");
			Scanner sc = new Scanner(System.in);
			String x = "";
			short y = 0;
			while (!x.equals("hi")) {
				x = sc.nextLine();
				System.out.println("...");
				y++;
			}
			
			// Print out the amount of times the while loop was iterated
			System.out.println("You tried " + y + " amount of times on this while loops");
			
			// A do while loop which does something first and then repeats if y > 10
			do { System.out.println("You should've done it sooner"); } while (y > 10);

		}
		
		if (b) {
			/* Linked hashed sets are faster in some operations than hashed sets
			 * Here we will talk about HashSets, which are a type of array in which
			 * only check if something exist in the set, not the order or the amount
			 * of times it has appeared before, you can set it as whatever value you
			 * like.
			 */ 
			Set<Integer> t = new HashSet<Integer>();
			// We added 5 twice but then we remove it once, because 5 only exists in 
			// a set once it will get remove completly
			t.add(5);
			t.add(3);
			t.add(5);
			t.add(4);
			t.add(2);
			t.add(-8);
			t.remove(5);
			
			//We check if t contains the number 5, which it doesn't
			boolean w = t.contains(5);
			System.out.println(t);
			
			/* In a Tree set, we actually order them by their value, if its a string
			 * or char then it will order it alphabetacally, if its something like a 
			 * number, it will sort the from least to greatest
			 */
			Set<Integer> r = new TreeSet<Integer>(t);
			System.out.println(r);

			// An array list is just an array that doesn't have predefined amount of
			// spots
			ArrayList<Integer> e = new ArrayList<Integer>();
			e.add(6);
			e.add(6);
			e.add(6);
			e.add(18);
			e.add(3);
			
			// We get the value in index 0, or the first value 
			int E = e.get(0);
			
			// We change the second value to 9
			e.set(1, 9);
			
			//We get the amount of values inside of the array
			int y = e.size();
			// We can also create a array list from a portion of another array list
			// Ofcourse using indexes
			ArrayList<Integer> u = new ArrayList<Integer>(e.subList(2, 5));
			System.out.println(e + " " + E + " " + y + " " + u);
		}

		if (b) {
			/* Note: Linked Hash Map is like linked hash set
			 * A Hash Map is like a HashSet in the sense that it doesn't organize
			 * values. A HashMap uses 2 values for a single piece of data, one is the
			 * "key" or the x value, it pretty much acts like an index for a 
			 * HashMap, which can be an integer or String or whatever data type 
			 * you want, pretty much it holds the value or y. You can repeat y values
			 * but if you repeat an x key, the value inside that x will replace the
			 * previous x.
			 */
			Map<Object, Object> m = new HashMap<>();
			m.put("comedy", 5);
			m.put("joe", "x");
			m.put(11, 999);
			m.put(11, 998);


			/* TreeMaps are just Hashmaps organized in the same way that a TreeSet is
			 * but only for the key values
			 * Map tm = new TreeMap(m); shall return an error since the organization 
			 * component inside of a TreeMap cannot organize both Strings and ints 
			 * which m does have both String and ints as a key
			 */

			Map<String, Object> tm = new TreeMap<>();
			tm.put("lemonade", 5);
			tm.put("chonky", "x");

			//Checking if a value and a key is inside inside m
			System.out.print( m.containsValue(998) + " " + m.containsKey("joe"));
			// tm.get("chonky") shall return 5 because the key, chonky has 
			// the value of 5, tm.values just return all the values in tm
			System.out.print(" " + tm.get("chonky") + " " + tm.values() + "\n");
			//We remove everything from tm
			tm.clear();
			System.out.println(m + " " +  m.get("comedy"));
			//tm.isEmpty() shall return true since we use tm.clear()
			System.out.println(tm.isEmpty());


			/* We are now going to see how we can use these maps to find out how many
			 * of each character are in str.
			 *
			 * First we set our map to be a TreeMap, this will contain the characters
			 * and the amount of times they were in str. Now we convert this String
			 * into a char array and we will make a for each loop to iterate over each
			 * char inside of str and sets x to equal the char. Once we have that set
			 * up, we will now do the iteration, first we check if epic contains the
			 * char, if it does than we will add one to it. If it doesn't then we
			 * shall the value to 1. We also remove all the spaces since those aren't
			 * neccesary to wha twe are looking for. Now we just println and done!
			 */
			Map<Character, Integer> epic = new TreeMap<>();

			String str = "hello my name is comedy and i am cool";

			for (char x:str.toCharArray()) {
				if (epic.containsKey(x)) {
					int old = (int)epic.get(x);
					epic.put(x, old+1);
				} else { 
					epic.put(x, 1);
				}
			}
			epic.remove(' ');

			System.out.println(epic);
		}

		if (b) {
			short[] x = {-99,5,6,3,2,1,7,8,0};
			Arrays.sort(x, 1, 7);
			for (short i = 0; i < x.length ; i++) {
				if (x.length > i ) {
					System.out.print(x[i] + ",");
				} else {
					System.out.print(x[i] + ".");
				}
			}
			System.out.print("\n");

			Scanner sc = new Scanner(System.in);

			String y = sc.nextLine();
			char[] z = y.toCharArray();
			String n = "";

			for (int v = 0; v < z.length; v++) {
				n += z[z.length - 1 - v];
			}

			System.out.println(n);

			System.out.print("Input int: ");
			double j = sc.nextInt();
			System.out.print("Input int: ");
			double k = sc.nextInt();
			System.out.print("Input op: ");
			String l = sc.next();
			System.out.println(coom(j, k, l));
		}
		

		if (b) {
			Dog comedy = new Dog("comedy", 7);
			comedy.speak();

			Dog chonky = new Dog(null, 5);
			chonky.setName("chonky");

			Dog lemonade = new Dog("lemonade", 0);
			lemonade.setAge(5);

			Cat cherries = new Cat("Cherries", 18, 3);
			cherries.speak();

			Cat chase = new Cat("chase", 2);
			chase.speak();

			Cat.meow oop = chase.new meow("I will kill you");
			oop.display();

			System.out.println(chonky.getName() + " " + lemonade.getAge() + " " + Dog.count);
		}
		
		if (b) {
			Teacher joe = new Teacher("biden");
			Teacher epic = new Teacher("biden");
			Teacher coomer = new Teacher("coom");

			System.out.println(joe.equals(epic));
			System.out.println(joe.compareTo(coomer) > 0);
			System.out.println(epic);

			joe.checkRole();
		}

		if (b) {
			Goldfish boi = new Goldfish("boi");
			boi.glub(5);
			boi.splash(420);
			boi.display();

			int x = Fish.math(4);
			System.out.println(x);
		}
		if (!b) {
			Level lvl = Level.LOW;
			
			Level[] arr = Level.values();

			for (Level e:arr) {
				System.out.println(e);
			}

			switch (lvl) {
				case LOW:
					System.out.println(lvl);
					break;
				case MEDIUM:
					System.out.println(lvl);
					break;
				case HIGH:
					System.out.println(lvl);
					break;
			}

			System.out.println(lvl.getlvl());
			
			lvl.setlvl(5);

			System.out.println(Level.valueOf("LOW"));
			System.out.println(lvl.getlvl());
		}

	}
	// This is a new method that can be called in main
	public static double ok(double ko) {
		// Here I define n to equal to the double, ko which is the argument 
		// given to the method
		double n = ko;

		/* Here is a simple for loop in which you define i to be 1 the for loop
		 * shall keep on repeating until i is no longer less than or equal to 10 and the 
		 * i will keep on adding 1 onto itself everytime the for loop repeats
		 * meaning the loop will repeat 10 times
		 */
		for (short i = 1 ; i <= 10 ; i++) {
			// n shall add the value of i onto itself, and since i keeps on increasing,
			// n shall keep on adding the new value of i for every loop
			n += i;
		}
		// Gives the new value of n back to whereever it was called from
		return n;
	}
	public static double coom(double x, double y, String p) {
		switch (p) {
			case "/":
				return x/y;
			case "*":
				return x*y;
			case "-":
				return x-y;
			case "+":
				return x+y;
		}
		return 0;
	}
}

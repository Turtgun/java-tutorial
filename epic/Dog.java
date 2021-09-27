package epic;

public class Dog {
	protected String name;
	protected int age;

	protected static int count  = 0;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count += 1;
		Dog.display();
	}

	public static void display() {
		System.out.println("A dog has been added");
	}

	public void speak() {
 		System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age)  {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

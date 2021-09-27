package epic;

public class Cat extends Dog{

	private int food;
	private boolean yes;
	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
		this.yes = true;
		Cat.meow crap = this.new meow("crap");
		crap.display();
	}

	public Cat(String name, int age) {
		super(name, age);
		this.yes = false;
	}

	public void speak() {
		if (yes) {
			System.out.println("I, " +  this.name + " am now an " + this.age +  " year old cat, and for that I request thou to give thy " + this.food + " snacks." );
		} else {
			System.out.println("hello im "+ this.name + " and I am  " + this.age + " years old");
		}
	}

	protected class meow {
		public String me;
		public meow(String ow) {
			this.me = ow;
		}
		public void display() {
			System.out.println("A new cat has entered the cult");
		}
	}
}

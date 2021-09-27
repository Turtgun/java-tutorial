package epic;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Teacher implements Comparable<Teacher> {
	
	private String name;
	protected Map<String, Boolean> students = new TreeMap<>();
	public String x;
	public String y;

	public Teacher(String name) {
		this.name = name;
	}

	public void checkRole() {
		Scanner sc = new Scanner(System.in);
		System.out.println( this.name +"\nCheck role\n------------------------------\n");
		boolean bool = true;

		while (bool) {
			System.out.print("\nPlace name of student: ");
			this.x = sc.nextLine();
			System.out.print("\nIn class? (y/n)(default n): ");
			this.y = sc.nextLine();
			this.students.put(x, pog(y));
			this.getStudent(x);
			System.out.print("\nContinue? : ");
			this.y = sc.nextLine();
			bool = pog(y);
			
		}
		this.getRole();
	}
	
	public void getRole() {
		System.out.println(this.students);	
	}

	public void checkStudent(String student) {
		if (this.students.containsKey(student)) {
			Scanner sn = new Scanner(System.in);
			System.out.print("\nIs " + student + " present (y/n) : " );
			boolean spa;

			String cs = sn.nextLine();
			this.students.put(student, pog(cs));
		}
	}	

	private static boolean pog(String ss) {
		switch (ss) {
			case "y":
				return true;
			case "n":
				return false;
			default:
				return false;
		}
	}

	public void  getStudent(String student) {
		if (this.students.containsKey(student)) {
			if (this.students.get(student)) {
				System.out.println(student + " is present.");
				return;
			}
			System.out.println(student + " is not present.");
		}
	}
	public boolean equals(Teacher other) {
		if (this.name == other.name) {
			return true;
		}
		return false;
	}

	public int compareTo(Teacher other) {
		return this.name.compareTo(other.name);
	}

	public String toString() {
		return "Student(" + this.name +")";
	}
}

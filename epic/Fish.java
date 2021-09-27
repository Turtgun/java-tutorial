package epic;

public interface Fish {
	final int bubbles = 5;

	void die();
	void glub(int a);
	void splash(int a);

	default void out() {
		System.out.println("I am a fish");
	}

	static int math(int b) {
		return b + 5;
	}
}

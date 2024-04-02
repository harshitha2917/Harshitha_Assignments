package methods_classes;
interface WorldOne {
	abstract void one();

	abstract void two();
}

abstract class One1 implements WorldOne {
	abstract void three();

	abstract void four();

	void anger() {
		System.out.println("Angry");
	}

	static void sad() {
		System.out.println("Sad");
	}
}

abstract class Two2 extends One1 {
	abstract void five();

	abstract void six();

}
public class Demo_Interface extends Two2 {
	void laugh() {
		System.out.println("Laughing");
	}

	static void cry() {
		System.out.println("Crying");
	}

	public static void main(String[] args) {
		Demo_Interface d1 = new Demo_Interface();
		d1.laugh();
		cry();
		d1.anger();
		sad();
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub

	}

	@Override
	public void two() {
		// TODO Auto-generated method stub

	}

	@Override
	void five() {
		// TODO Auto-generated method stub

	}

	@Override
	void six() {
		// TODO Auto-generated method stub

	}

	@Override
	void three() {
		// TODO Auto-generated method stub

	}

	@Override
	void four() {
		// TODO Auto-generated method stub

	}

}
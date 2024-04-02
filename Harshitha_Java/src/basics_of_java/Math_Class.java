package basics_of_java;

public class Math_Class {

	public static void main(String[] args) {
		double pi=Math.PI;
		int r=7;
		System.out.println(pi*r*r);
		
		System.out.println(Math.addExact(23, 56));
		System.out.println(Math.addExact(12343567, 123466477));
		
		System.out.println(Math.subtractExact(100, 10));
		System.out.println(Math.subtractExact(234565, 123546));
		
		System.out.println(Math.multiplyExact(20, 30));
		
		System.out.println(Math.sqrt(100));
		
		System.out.println(Math.min(55, 345));
		System.out.println(Math.max(654, 445));
		
		for(int i=1;i<10;i++) {
		System.out.println(Math.random());

	}

}
}
package practiceNote;

public class MathPrac {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		d1 = 45.67;
		
		d1 = d1 * 10;
		l1 = Math.round(d1);
		d1 = (double) l1 / 10;
		System.out.println(d1);
		
	}

}

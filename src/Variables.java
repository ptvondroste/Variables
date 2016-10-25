
public class Variables {

	public static void main(String[] args) {
		// 
		int a = 63;
		int b = 45;
		a = b;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	
		a = a+10;
		a += 10; //extended assignment operator 
		
		a = a+1; //binary
		a +=1; //binary operators
		a++; //increments
		//a = a++; //bad style form
		System.out.println("a is " + a);
		
		double c = Math.PI;
		int d = (int)c;
		long e = Math.round(c);
		System.out.println("d is " + c);
		System.out.println("d is " + d);
		System.out.println("d is " + e);
		
	}

}

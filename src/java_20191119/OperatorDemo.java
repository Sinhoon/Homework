package java_20191119;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 7;
		int b = 20;		
		int c = 0;
		float d = 0f;
		
		d = b/a;
		System.out.println(d);
		
		d = (float)b/(float)a;
		System.out.println(d);
		
		c= a++;
		System.out.println(c);		
		c= ++a;
		System.out.println(c);

		// a && b - a�� false �̸�  b������ �������� (short circuit) 
		// a || b - a�� true �̸�  b������ �������� (short circuit) 
		boolean isSucess;
		isSucess = (a==b) && (++a == ++b); 
		System.out.println(isSucess);	
		System.out.println(a);	
		System.out.println(b);	
	}
}

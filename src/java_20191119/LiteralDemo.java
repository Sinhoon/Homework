package java_20191119;

public class LiteralDemo {
	public static void main(String[] args){
		// byte ������ �Ѿ�� overflow �߻�
		//byte b1 = 128;
		
		int a1 =128; 		// 10
		int a2 = 076;		// 8 
		int a3 = 0x123;		// 16
		int a4 = 0b10101;	// 2
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		// long literal ���ڵڿ� l , L 
		long l1 = 22000000l;
		
		// float literal �Ҽ����ڿ�  f , F
		float f1 = 123.43f;
		
		
		// double literal �Ҽ����ڿ� d , D , ����
		double d1 = 1234.56;
		
		// boolen literal true,false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0;
		// primitive data type�� == ������ ���� ����
		System.out.println(a1==d1);
		
		int first = 10;
		int second =first ;
		first = 20;
		System.out.print(first);
		System.out.print(second);
	}
}

package sec02_method.EX06_MethodOverloading;

/*�޼����� �����ε�(Overloading)*/

public class MethodOverloading {
	public static void main(String[] args) {		
		print(); //�����Ͱ� �����ϴ�.
		print(3); //3
		print(5.8); //5.8
		print(2, 5);
	}	
	public static void print() {
		System.out.println("�����Ͱ� �����ϴ�.");
	}	
	public static void print(int a) {
		System.out.println(a);
	}	
	public static void print(double a) {
		System.out.println(a);
	}
	/* �Ұ��� (void print(double a) {}�� �ߺ�)
	public static void print(double b) { //�Ұ���
		System.out.println(b);
	}
	*/	
	public static void print(int a, int b) {
		System.out.println("a: "+ a + " b: "+b);
	}
	/* �Ұ��� (void print(int a, int b){}�� �ߺ�)
	public static int print(int a, int b) { //�Ұ���
		System.out.println("a: "+ a + " b: "+b);
		return a+b;
	} 
	*/
}









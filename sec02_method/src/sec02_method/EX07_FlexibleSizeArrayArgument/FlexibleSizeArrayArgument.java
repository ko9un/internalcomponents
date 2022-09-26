package sec02_method.EX07_FlexibleSizeArrayArgument;

/*�޼����� �������� �迭 �Ű�����*/

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {		
		//#1. method1(int...values)
		method1(1,2);
		method1(1,2,3);
		method1();		
		
		//#2. method2(String...values)
		method2("�ȳ�", "�氡");
		method2("��ť", "����", "����");
		method2();		
	}	
	public static void method1(int...values) { //�������� �迭
		System.out.println("�迭�� ����: " + values.length);
		/* �迭 ��� ��� 1
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		} */
		// �迭 ��� ��� 2
		for(int k: values) {
			System.out.print(k+" ");
		}
		/* �迭 ��� ��� 3
		//System.out.println(Arrays.toString(values));
		 */
		System.out.println();		
	}	
	public static void method2(String...values) { //�������� �迭
		System.out.println("�迭�� ����: " + values.length);		
		/* �迭 ��� ��� 1
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		} */
		// �迭 ��� ��� 2
		for(String k: values) {
			System.out.print(k+" ");
		}
		/* �迭 ��� ��� 3
		//System.out.println(Arrays.toString(values));
		 */
		System.out.println();		
	}	
}

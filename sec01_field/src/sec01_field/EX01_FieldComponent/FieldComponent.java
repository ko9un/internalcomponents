package sec01_field.EX01_FieldComponent;

// Ŭ���� ����
class A {
	int m = 3; // �ʵ�
	int n = 4; // �ʵ�

	void work1() {
		int k = 5; // ��������
		System.out.println(k);
		work2(3);

	}

	void work2(int i) {
		int j = 4; //��������
		System.out.println(i + j);
	}

}

public class FieldComponent {
	public static void main(String[] args) {
		//Ŭ������ ��ü ����
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		//�޼��� ȣ��
		a.work1();
		
	}

}

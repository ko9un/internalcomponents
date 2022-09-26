package sec03_consturctor.EX01_DefaultConstructor;

/*�⺻ �������� �ڵ� �߰�*/

class A {
	int m;
	void work() {
		System.out.println(m); //0
	}
	//�����Ϸ��� �ڵ����� �߰����ִ� �⺻ ������
	/*
	A(){
		//��ü ���� ���Ŀ� �ؾ� �� �߰� �ϵ�
	}
	*/
}
class B {
	int m;
	void work() {
		System.out.println(m); //0
	}
	B() { //�⺻������
		
	}
}
class C {
	int m;
	void work() {
		System.out.println(m); //�����ڷ� �Ѿ�� ��
	}
	C(int a) { //�������� �⺻��� : ��ü ���� + �ʵ� �ʱ�ȭ
		m=a;
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {		
		//#1. Ŭ������ ��ü ����
		A a = new A();
		B b = new B();
		//C c = new C(); //�Ұ���
		C c = new C(3);		
		
		//#2. �޼��� ȣ��
		a.work(); //0
		b.work(); //0
		c.work(); //3
	}
}
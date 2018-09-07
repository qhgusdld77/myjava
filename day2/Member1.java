// import java.long.String;
// import java.lang.*;

public class Member1
{
	String userid;		// ���̵�  (���ڿ�)
	String pwd;			// ��ȣ   (���ڿ�)
	String name;		// ����   (���ڿ�)
	int age;			// ����   (����)
	String address;		// �ּ�   (���ڿ�)

	// !!!! java���� ()�� 2������ �����Ѵ�. !!!!
	//1. �޼ҵ�(method)
	//2. ������(constructor)

	// ==== ������(constructor) �����ϱ� ====
	/*
		�� ������(constructor)��?
		-- ��ü�� ����(Ŭ������ ��ü������ = new Ŭ������();) �Ҷ� ����
		   �ڵ������� ȣ��Ǿ��� ����Ǿ����� ��� ������ ����� ���̶�� �����ϸ� �ȴ�.

		�� ������()�� ���Ѿ��� ��Ģ
		  1. ������()�� �̸��� �ݵ�� Ŭ�������� ���ƾ� �Ѵ�.
		  2. ������()�� ��ȯŸ��(����Ÿ��)�� ����ϸ� �ȵȴ�. (�޼ҵ�� �ִ�)

		�� ������()�� �ֵ� ������ 
			�Ϲ������� �������(�ν��Ͻ� ����, Ŭ��������(static ����))�� 
			�ʱ�ȭ�� �ϰ��� �ϴµ� �ִ�.
	*/

	public Member1()/*Ŭ�������̿��� ������ �ƴϸ� �޼ҵ�*/ {
		System.out.println(" Member1() �����ڸ� ȣ���߽��ϴ�.");
	}

	public Member1(String userid, String pwd, String name, int age, String address) {
		this.userid/*�������*/ = userid/*��������*/; // ��������� �̸��� ���������� �̸��� ���ٶ�� 
		                                         // ���������� �̸��� �켱�Ѵ�. !!!!!
		// this�� �����Ǿ����� ��ü�� ���Ѵ�.
		// �׷��� ��Ӻ������� ������������ ������ ��� ������ ���� ���� �����
		// this.��Ӻ����� ���� ������ ���´�.

		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public void showInfo() {
		System.out.println("====================");
		System.out.println("1.���̵� : " + userid);
		System.out.println("2.�� ȣ : " + pwd);
		System.out.println("3.�� �� : " + name);
		System.out.println("4.�� �� : " + age);
		System.out.println("5.�� �� : " + address);
		System.out.println("====================");
	}
}
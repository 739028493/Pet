package ����;

public class Pet {
	private String name;
	private int age;

	public void eat(String food) {
		System.out.println(name + "�ڳ�" + food);
	}

	public void sleep() {
		System.out.println(name + "��˯��");
	}

	public void age() {
		System.out.println(name + age + "����!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20 || age < 0) {
			System.out.println("���ݴ���");
		} else
			this.age = age;
	}
}
package 方法;

public class Pet {
	private String name;
	private int age;

	public void eat(String food) {
		System.out.println(name + "在吃" + food);
	}

	public void sleep() {
		System.out.println(name + "在睡觉");
	}

	public void age() {
		System.out.println(name + age + "岁了!");
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
			System.out.println("数据错误");
		} else
			this.age = age;
	}
}
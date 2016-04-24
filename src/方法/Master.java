package 方法;

import java.util.Scanner;

public class Master {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog myDog = new Dog();
		Cat myCat =new Cat();
		myCat.setName("小白");
		myDog.setName("小黑");
		System.out.println("请输入狗的年龄！");
		myDog.setAge(input.nextInt());
		System.out.println("请输入猫的年龄！");
		myCat.setAge(input.nextInt());
		
		String food="骨头";
		String food1="猫粮";
		
		myDog.age();
		myCat.age();
		
		String result=myDog.lookdoor();
		System.out.println(result);
		String result1=myCat.maimeng();
		System.out.println(result1);
		
		String sound =myDog.bark();
		System.out.println(sound);
		String sound1 =myCat.bark();
		System.out.println(sound1);
		
		myDog.eat(food);
		myCat.eat(food1);
		
		myDog.sleep();
		myCat.sleep();
		input.close();
	}
}

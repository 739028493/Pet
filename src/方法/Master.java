package ����;

import java.util.Scanner;

public class Master {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Dog myDog = new Dog();
		Cat myCat =new Cat();
		myCat.setName("С��");
		myDog.setName("С��");
		System.out.println("�����빷�����䣡");
		myDog.setAge(input.nextInt());
		System.out.println("������è�����䣡");
		myCat.setAge(input.nextInt());
		
		String food="��ͷ";
		String food1="è��";
		
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

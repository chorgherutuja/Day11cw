package day11cw;

public class day11 {
	//1. Write a program to print your name using default constructor.
	class Name{
	Name(){
		System.out.println("Sneha");
	}
	}

	//2. Write a program to print average of marks of two subjects of a student using parameterized constructor.
	class Avg {
	Avg(int a, int b, int c){
		float avg = (a+b+c)/3;
		System.out.println("average is " + avg);
	}
	}

	//3. Write a program to print the name of different programming languages using parameterized constructor
	class Lang {
	Lang(String a, String b, String c){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	}

	//4. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
	class Person {
	private String  name;
	private int age ;
	private String country;

	public String getName() {
		return name;
	}
	public int getAge () {
		return age;
	}
	public String getCountry () {
		return country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setCountry (String country) {
		this.country = country;
	}
	}

	//5. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate perimeter of the rectangle using constructor.
	class Rectangle {
	int length =10;
	int width = 12;
	Rectangle() {
		int perimeter = 2*(length + width);
		System.out.println("perimeter of rectangle is " + perimeter);
	}
	}

	public class Hw {
	public static void main(String[] args) {
		Name n = new Name();
		Avg a = new Avg(85,74,96);
		Lang l = new Lang("C Language", "C++ Language", "Java Language");
		Person p = new Person();
		
		p.setName("Sneha");
		System.out.println(p.getName());
		
		p.setAge(22);
		System.out.println(p.getAge());
		
		p.setCountry("India");
		System.out.println(p.getCountry());
		
		Rectangle r = new Rectangle();
	}
	}

}



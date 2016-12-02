package com.silentpeople.getset;

public class cat1 {
	
	public int age1 = 1; 
	protected int age2 = 2;
	int age3 = 3; // default는 안쓰면 default
	private int age4 = 4;
	
	public void agePrint() {
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
	}
	
	/*int age;
	String name;
	private String spices;
	static int catCount;
	final double pi = 3.14;
	
	public void test1() {
		System.out.println("public");
	}
	
	private void test2() {
		System.out.println("private");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public static int getCatCount() {
		return catCount;
	}
	public static void setCatCount(int catCount) {
		cat1.catCount = catCount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpices() {
		return spices;
	}
	public void setSpices(String spices) {
		this.spices = spices;
	}*/
	
}

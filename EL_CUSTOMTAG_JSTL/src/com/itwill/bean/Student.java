package com.itwill.bean;

public class Student {
	private int no;
	private String name;
	private int age;
	private Car car;
	public Student() {
		
	}
	
	
	public Student(int no, String name, int age, Car car) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.car = car;
	}


	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}


	public int getNo() {
		return no;
	}
	public String getIrum() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setIrum(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

/*
	no, name, age 3개 프로퍼티를 가진다(read전용  -> set 만 있을때)
	no, name, age 3개 프로퍼티를 가진다(write전용  -> get 만 있을때)
	Student 객체는 read, write 가능한 no, irum, age 3개 프로퍼티를 가진다
*/
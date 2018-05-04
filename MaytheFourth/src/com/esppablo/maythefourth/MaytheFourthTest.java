package com.esppablo.maythefourth;

public class MaytheFourthTest {

//	Build a Character class to represent characters in Star Wars
//	Each Character should have a name, weight, and famous_saying
//	Each Character can be built one of two ways.
//	Either with all the attributes provided
//	or with defaults you create.
//	*Each Character should be able to introduce themselves to another Character, such as "Hello, Luke Skywalker, I'm Han Solo."

	public static void main(String[] args) {
		Character skywalker = new Character("Luke Skywalker", 100, "lol");
		Character hanSolo = new Character("Han Solo", 120, "Never tell me the odds!");
		
		Character r2d2 = new Character();
		
		r2d2.setName("R2D2");
				
		System.out.println("My name is " + skywalker.getName());
		System.out.println("And this is " + r2d2.getName());

//		System.out.println("Hey there! My name is " + hanSolo.getName());

		System.out.println(hanSolo.introduction(skywalker));



	}

}

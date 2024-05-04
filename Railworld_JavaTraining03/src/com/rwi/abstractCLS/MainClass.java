package com.rwi.abstractCLS;

public class MainClass {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();

		Square s = new Square();
		s.draw();

		Ractangle r = new Ractangle();
		r.draw();
		// here we are getting object throught the method of Abstract Factory Method

		System.out.println("------here we are getting object throught \n the method of Abstract Factory Method--------\n");
		Shape circle = ShapeFactory.getObject("circle");
		circle.draw();

		Shape square = ShapeFactory.getObject("square");
		square.draw();

		Shape ractangle = ShapeFactory.getObject("ractangle");
		ractangle.draw();
	}
}

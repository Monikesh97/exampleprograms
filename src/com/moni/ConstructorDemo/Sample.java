package com.moni.ConstructorDemo;

public class Sample {

	Sample() //Default construictor
	{
		System.out.println("Default constructor");
	}

    Sample(int a ,int b)//parameterized constructor
    {
    	this();
    	int c = a+b;
    	System.out.println("a+b is value : " +c);
    }

    Sample(int a ,int b ,int c) //constructoir overloading
    {
    	this(a,b);
    	int d = a+b+c;
    		System.out.println("a+b+c is value  : " +d);
    }
}

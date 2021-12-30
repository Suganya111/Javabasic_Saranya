package com.aaludrajavabasicprograms;

public class GenericExample3Main {

	public static void main(String[] args) {
      GenericExample3<String,Integer> obj=new GenericExample3<String,Integer>("hai",1);
obj.print();
GenericExample3<Integer,String> obj1=new GenericExample3<Integer,String>(2,"hello");
obj1.print();
	}

}

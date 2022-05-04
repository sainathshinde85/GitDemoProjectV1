package com.mytest.practice;

public class TestNetCracker {

	public static void main(String[] args) {
		// String s = new String("5");
	      //  System.out.println(1 + 10 + s + 1 + 10);
		 Base obj = new Base1();
	        ((Base2) obj).test(); 
	}

}
class Base {
    public void test() {
    }
}

class Base1 extends Base {
    public void test() {
         System.out.println("Base1");
    }
}

class Base2 extends Base {
    public void test() {
         System.out.println("Base2");
    }
}
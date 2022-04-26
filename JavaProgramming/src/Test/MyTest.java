package Test;

class Parent {
	int x = 100;

	Parent() {
		this(200);
		System.out.println("check4");
	}

	Parent(int x) {
		this.x = x;
		System.out.println("check5" + x);
	}

	int getX() {
		//System.out.println("this는 누구?" + this.x);
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		//super();
		this(1000);
		System.out.println("check1");
	}

	Child(int x) {
		//super();                  
		this.x = x;                // super생략?
		System.out.println("check2");
	}
}

public class MyTest {
	public static void main(String[] args) {
		Child c = new Child();                  // Child() -> Child(1000) -> Parent() -> Parent(200)
		System.out.println("x="+c.getX());     //
	}
}

test;
[p] {
[B]
    package p;
  public class B {
  
  	public static void method() {
  		System.out.println("TestB.method");
  	}
  }
  
[A]
    package p;
  public class A {
  
  	public static void method() {
  		System.out.println("TestA.method");
  		B.method();
  	}
  }
}

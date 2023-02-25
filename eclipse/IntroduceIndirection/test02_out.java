test;
[p] {
[B]
    package p;
  
  public class B {
  
  	public void foo() {
		
  	}
  
  }
  
[A]
    package p;
  
  public class A extends B {
  
  	// Test warning because of super keyword
  
  	/**
  	 * @param b
  	 */
  	public static void bar(B b) {
  		b.foo();
  	}
  
  	{
  		super.foo(); //<------invoke here
  	}
  }
  
}

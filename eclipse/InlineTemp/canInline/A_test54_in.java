test;
[p] {
[A]
    package p;
  
  public class A {
  	static int f= 42;
  
  	int foo() {
  		int r= f;
  		int f= 23;
  		return r;
  	}
  }
  
}

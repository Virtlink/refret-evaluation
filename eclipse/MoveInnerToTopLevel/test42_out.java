test;
[p] {
[B]
    package p;
  class B {
  	void foo() {
  		System.out.println(A.s3 + A.s1);
  	}
  }
[A]
    package p;
  
  public class A {
  	static String s1 = "1";
  	private static String s2 = "2";
  	static String s3 = "3";
  }
  
}

test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.f();
  	}
  }
[A]
    package p;
  public class A{
  	static void f(){}
  }
}

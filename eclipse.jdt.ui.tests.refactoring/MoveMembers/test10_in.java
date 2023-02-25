test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	public static void m(){
  		A.m1();
  	}
  	public static void m1(){
  	}
  }
}

test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.m1();
  	}
  }
[A]
    package p;
  public class A{
  	public static void m1(){
  	}
  }
}

test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	public static void m(){}
  	public static void n(){
  		A.m();
  	}
  }
}

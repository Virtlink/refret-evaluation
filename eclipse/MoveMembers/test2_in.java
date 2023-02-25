test;
[p] {
[B]
    package p;
  class B{
  	public static void n(){
  	}
  }
[A]
    package p;
  public class A{
  	public static void m(){
  		B.n();
  	}
  }
}

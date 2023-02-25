test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m() {
  		n();
  	}
  
  	public static void n() {
  		m();
  	}
  }
[A]
    package p;
  public class A{
  }
}

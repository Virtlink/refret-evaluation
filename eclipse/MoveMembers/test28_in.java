test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	public static void m() {
  		n();
  	}
  	public static void n() {
  		m();
  	}
  }
}

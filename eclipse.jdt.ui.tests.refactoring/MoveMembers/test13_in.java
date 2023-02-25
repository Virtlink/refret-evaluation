test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	public static class Inner{}
  	public static void m(){
  		new A.Inner();
  	}
  }
}

test;
[p] {
[B]
    package p;
  class B{
  
  	static int i;
  }
[A]
    package p;
  public class A{
  	public static int F= B.i;
  }
}

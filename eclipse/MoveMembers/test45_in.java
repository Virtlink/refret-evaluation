test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	private static int m(){ return 1;};
  	public static int i= m();
  }
}

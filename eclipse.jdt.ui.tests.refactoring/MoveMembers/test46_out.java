test;
[p] {
[B]
    package p;
  class B{
  
  	static int m(){ return 1;}
  }
[A]
    package p;
  public class A{
  	public static int i= B.m();
  }
}

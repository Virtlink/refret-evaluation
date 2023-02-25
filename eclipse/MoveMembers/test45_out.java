test;
[p] {
[B]
    package p;
  class B{
  
  	public static int i= A.m();
  }
[A]
    package p;
  public class A{
  	static int m(){ return 1;}
  }
}

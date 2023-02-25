test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.F= 0;
  	}
  }
[A]
    package p;
  public class A{
  	static int F;
  }
}

test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.F= 1;
  	}
  }
[A]
    package p;
  public class A{
  	public static int F;
  }
}

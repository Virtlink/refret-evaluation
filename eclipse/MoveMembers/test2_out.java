test;
[p] {
[B]
    package p;
  class B{
  	public static void n(){
  	}
  
  	public static void m(){
  		n();
  	}
  }
[A]
    package p;
  public class A{
  }
}

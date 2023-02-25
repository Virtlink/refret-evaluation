test;
[p] {
[B]
    package p;
  
  import p.A.Inner;
  
  class B{
  
  	public static void m(){
  		new A.Inner();
  	}
  }
[A]
    package p;
  public class A{
  	public static class Inner{}
  }
}

test;
[p] {
[B]
    package p;
  
  import p.A.Inner;
  
  class B{
  
  	public static void m(){
  		A.Inner[] i;
  	}
  }
[A]
    package p;
  public class A{
  	public static class Inner{}
  }
}

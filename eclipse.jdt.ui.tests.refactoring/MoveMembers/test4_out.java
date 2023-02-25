test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){}
  }
[A]
    package p;
  public class A{
  	public void n(){
  		B.m();
  		p.B.m();
  		B.m();
  	}
  }
}

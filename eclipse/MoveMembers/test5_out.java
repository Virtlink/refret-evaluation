test;
[p] {
[B]
    package p;
  class B{
  
  	public static A f;
  }
[A]
    package p;
  public class A{
  	public void n(){
  		B.f= null;
  		B.f= null;
  		p.B.f= null;
  	}
  }
}

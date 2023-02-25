test;
[p] {
[B]
    package p;
  class B{
  
  	public static A i;
  }
[A]
    package p;
  public class A{
  	public static A i2;
  	void f(){
  		B.i.i2= null;
  	}
  
  }
}

test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.F= null;
  		A.F= null;
  		A.F= null;
  		A.F= null;
  		A.F= null;
  		A.F= null;
  	}
  }
[A]
    package p;
  public class A{
  	public static A F;
  	A i(){
  		return this;
  	}
  }
}

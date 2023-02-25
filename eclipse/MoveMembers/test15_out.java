test;
[p] {
[B]
    package p;
  class B{
  
  	public static void m(){
  		A.F= 0;
  		A.F= 0;
  		A.F= 0;
  		A.F= 0;
  	}
  }
[A]
    package p;
  public class A{
  	public static int F;
  	A i(){
  		return this;
  	}
  }
}

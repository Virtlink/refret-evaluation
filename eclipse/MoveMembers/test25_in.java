test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public class A{
  	public static final int[] FRED= {1};
  	void f(){
  		int i= A.FRED.length;
  	}
  }
}

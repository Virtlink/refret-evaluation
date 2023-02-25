test;
[p] {
[B]
    package p;
  class B{
  
  	public static final int[] FRED= {1};
  }
[A]
    package p;
  public class A{
  	void f(){
  		int i= B.FRED.length;
  	}
  }
}

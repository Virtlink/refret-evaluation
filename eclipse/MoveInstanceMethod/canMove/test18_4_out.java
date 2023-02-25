test;
[p2] {
[B]
    package p2;
  
  public class B {
  
  	/**
  	 * This is a comment
  	 * @param a TODO
  	 * @param j
  	 * @param foo
  	 * @param bar
  	 */
  	public void mA1(A a, float j, int foo, String bar) {
  		System.out.println(bar + j + a);
  		String z= A.fString + A.fBool;
  	}
  
  }
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public interface A {
  	public int fInt= 10;
  	public B fB= new B();
  	public String fString= "something";
  	public boolean fBool= true;
  
  	public void mA2();
  }
}

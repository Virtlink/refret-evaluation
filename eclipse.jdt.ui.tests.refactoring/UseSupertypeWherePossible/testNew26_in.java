test;
[p] {
[B]
    package p;
  public class B {
  	public B(A a){
  		a.m();
  	}
  	public B(int y, A a){
  		this(a);
  	}
  	public void m() {	}
  }
[A]
    package p;
  //use Object
  interface A{
  	void m();
  }
}

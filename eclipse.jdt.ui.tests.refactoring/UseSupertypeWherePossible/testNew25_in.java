test;
[p] {
[B]
    package p;
  public class B {
  	public B(A a){
  		a.m();
  	}
  	public void m() {	}
  }
[C]
    package p;
  public class C extends B{
  	public C(A a, int i) {
  		super(a);
  	}
  }
  
[A]
    package p;
  //use Object
  interface A{
  	void m();
  }
}

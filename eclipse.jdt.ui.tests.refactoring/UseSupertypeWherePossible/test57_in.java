test;
[p] {
[A1]
    package p;
  
  public class A1 extends A{
  	protected A f(){
  		return this;
  	}
  	void test(){
  		f().m();
  	}
  }
[I]
    package p;
  /** typecomment template*/
  interface I {
  	void m();
  }
[A]
    package p;
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  	protected A f(){
  		return this;
  	}
  	void test(){
  		f().m();
  	}
  }
}

test;
[p] {
[As]
    package p;
  /** typecomment template*/
  public class As {
  	void f(){
  		I a= A.getA();
  		a.m();
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
  	static I getA(){
  		return null;
  	}
  	public void m(){}
  	public void m1(){}
  }
}

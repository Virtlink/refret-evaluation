test;
[p] {
[As]
    package p;
  /** typecomment template*/
  public class As {
  	void f(){
  		A a= A.getA();
  		a.m1();
  	}
  }
[A]
    package p;
  class A {
  	static A getA(){
  		return null;
  	}
  	public void m(){}
  	public void m1(){}
  }
}

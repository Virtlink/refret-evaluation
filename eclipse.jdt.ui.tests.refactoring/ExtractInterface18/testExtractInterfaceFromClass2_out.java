test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  class A extends C implements I {
  	@Override
  	public void m() {
  	}
  }
  
  abstract class C {
  	abstract void m();
  }
  
}

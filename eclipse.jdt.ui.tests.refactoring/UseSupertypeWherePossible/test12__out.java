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
  class A implements I{
  	public void m(){}
  	private void f(){
  		I a= new A();
  	}
  }
}

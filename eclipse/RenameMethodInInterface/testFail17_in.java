test;
[p] {
[A]
    package p;
  //can't rename A.m to k - defined in superclass
  class B {
  	void k(){
  	}
  }
  class A extends B implements I{
  	public void m(){
  	}
  }
  interface I{
  	void m();
  }
}

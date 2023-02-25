test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	I getFoo();
  
  	void foo(I foo);
  
  }
[A]
    package p;
  class A implements I {
  	public I getFoo() {
  		return null;
  	}
  	public void foo(I foo) {
  
  	}
  }
}

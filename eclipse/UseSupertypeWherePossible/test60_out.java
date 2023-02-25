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
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  	public static void s() {}
  	void t(){
  		A.s();
  	}
  }
}

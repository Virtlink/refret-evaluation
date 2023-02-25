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
  	public static int s= 0;
  	void t(){
  		A.s= 1;
  	}
  }
}

test;
[p] {
[I]
    package p;
  /** typecomment template*/
  interface I {
  	void m(int i, boolean b, short s, char c, long l, double d);
  }
[A]
    package p;
  class A implements I{
  	public void m(int i, boolean b, short s, char c, long l, double d){}
  }
}

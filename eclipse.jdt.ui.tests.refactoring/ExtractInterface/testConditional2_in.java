test;
[p] {
[X]
    package p;
  
  public class X {
  	public double x;
  	public final double dot(X v) {
  		return v.x;
  	}
  }
  
[A]
    package p;
  
  public class A {
  	void foo() {
  		X v1[] = null;
  		X v2[] = null;
  		v2[1] = (true ? null : v1[1]); // BUG
  		v1[1].dot(v2[1]);
  	}
  }
  
}

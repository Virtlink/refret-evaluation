test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  }
[A]
    package p;
  class A implements I {
  	private int x;
  	void f(A[] v){
  		A[] a= v;
  		g(a);
  	}
  	void g(A[] x){
  		x[0].x= 0;
  	}
  }
}

test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	int X= 0;
  
  }
[A]
    package p;
  class A implements I {
  	public static final int Y= 0;
  }
  class Test{
  	void f(A a){
  		int i= a.X;
  		i= a.Y;
  	}
  }
}

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
  	void f(){
  		int i= I.X;
  		i= A.Y;
  	}
  }
}

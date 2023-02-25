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
  }
  class Test{
  	void f(){
  		int i= I.X;
  	}
  }
  
}

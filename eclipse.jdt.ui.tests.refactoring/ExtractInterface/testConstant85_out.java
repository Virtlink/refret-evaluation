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
  
  import java.util.ArrayList;
  
  class A extends ArrayList implements I{
  }
  class Test{
  	void f(A a){
  		x(a);
  	}
  	void x(ArrayList o){}
  }
}

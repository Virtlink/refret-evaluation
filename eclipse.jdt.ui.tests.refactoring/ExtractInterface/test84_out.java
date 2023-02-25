test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  }
[A]
    package p;
  class A implements I{
  	int x;
  }
  class B {
  	A f(){
  		A a= null;
  		return (a);	
  	}
  	void x(){
  		f().x= 0;
  	}
  }
}

test;
[p] {
[B]
    package p;
  
  class B extends A {
  	int a;
  	void m() { 
  		a++;
  	}	
  }
[A]
    package p;
  
  class B extends A {
  	private int a;
  	void m() { 
  		a++;
  	}	
  }
  
}

test;
[p] {
[A]
    package p;
  
  class A {
  }
  
  class B extends A {
  	void m() { 
  		int i= B.ss();
  	}	
  	public static int ss() { 
  		return 9;
  	}
  }
}

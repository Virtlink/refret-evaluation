test;
[p] {
[B]
    package p;
  class B {
  
  	public void subroutine(A a, float subArg) {
  	    a.subsub();
  	}
  
  }
[A]
    package p;
  class A {
      B fB;
    
      public void doit(String doitArg) {
          subroutine(1.2f);
      }
    
      public void subroutine(float subArg) {
  		fB.subroutine(this, subArg);
  	}
  
      public void subsub() {
        
      }
    
  }
}

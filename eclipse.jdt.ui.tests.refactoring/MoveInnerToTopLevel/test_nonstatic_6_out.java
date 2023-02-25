test;
[p] {
[Inner]
    package p;
  class Inner {
  	/** Comment */
  	private A a;
  
  	Inner(A a, int t){
  		this.a= a;
  	}
  }
[A]
    package p;
  
  class A{
  }
}

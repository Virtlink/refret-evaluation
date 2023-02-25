test;
[p] {
[Inner]
    package p;
  
  import p.A.X;
  
  class Inner {
  	/** Comment */
  	private A a;
  
  	/**
  	 * @param a
  	 */
  	Inner(A a) {
  		this.a= a;
  	}
  
  	void f(){
  		X x= new A.X();
  	}
  }
[A]
    package p;
  
  class A{
  	static class X{}
  }
}

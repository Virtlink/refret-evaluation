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
  		X x= this.a.new X();
  	}
  }
[A]
    package p;
  
  class A{
  	class X{}
  }
}

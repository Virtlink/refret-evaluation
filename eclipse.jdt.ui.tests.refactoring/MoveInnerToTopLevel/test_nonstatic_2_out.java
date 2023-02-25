test;
[p] {
[Inner]
    package p;
  class Inner{
  	/** Comment */
  	private A a;
  
  	/**
  	 * @param a
  	 */
  	Inner(A a) {
  		this.a= a;
  	}
  
  	void f(){
  	}
  }
[A]
    package p;
  class A{
  	class Inner2{
  		void f(){
  			new Inner(A.this);
  		}
  	}
  }
}

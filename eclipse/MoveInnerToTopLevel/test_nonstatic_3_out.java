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
  }
[A]
    package p;
  
  class A{
  	static class Inner2{
  		void f(){
  			new Inner(new A());
  		}	
  	}
  }
}

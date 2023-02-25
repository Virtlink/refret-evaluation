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
  }
  class I2 extends Inner{
  	I2(){
  		super(new A());
  	}
  }
  class I3 extends I2{
  }
}

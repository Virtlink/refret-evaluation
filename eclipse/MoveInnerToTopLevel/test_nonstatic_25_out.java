test;
[p] {
[Inner]
    package p;
  class Inner{
  	/** Comment */
  	private A a;
  
  	Inner(A a){
  		super();
  		this.a= a;
  	}
  }
[A]
    package p;
  
  class A{
  }
}

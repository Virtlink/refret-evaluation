test;
[p] {
[Inner]
    package p;
  class Inner{
  	/** Comment */
  	private A a;
  	Inner(A a){
  		this.a= a;
  	}
  	Inner(A a, int i){
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
  	I2(int i){
  		super(new A(), i);
  	}
  }
}

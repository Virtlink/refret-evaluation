test;
[p] {
[Inner]
    package p;
  class Inner{
  	/** Comment */
  	private A a;
  	Inner(A a){
  		this.a= a;
  		f();
  	}
  	void f(){
  	}
  }
[A]
    package p;
  class A{
  	void f(){
  		new Inner(this);
  	}
  }
}

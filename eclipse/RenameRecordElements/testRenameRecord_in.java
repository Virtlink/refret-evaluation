test;
[p] {
[B]
    package p;
  class B{
  
  	public int val() {
  		A a= new A(10);
  		return a.f();
  	}
  }
[A]
    package p;
  record A(int f){
  	public A{
  		this.f= f;
  	}
  
  	public A() {
  		this.f=0;
  	}
  
  	public void val(int f) {
		
  	}
  
  	public int getVal() {
  		return f();
  	}
  
  	public int f() {
  		return f;
  	}
  }
}

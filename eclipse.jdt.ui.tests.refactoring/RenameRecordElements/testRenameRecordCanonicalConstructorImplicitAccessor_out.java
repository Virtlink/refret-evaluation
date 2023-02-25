test;
[p] {
[B]
    package p;
  class B{
  
  	public int val() {
  		A a= new A(10);
  		java.util.function.ToDoubleFunction<A> f = A::g;
  		return a.g();
  	}
  }
[A]
    package p;
  record A(int g){
  	A (int g){
  		this.g=g;
  	}
  
  	public void val(int f) {
		
  	}
  
  	public int getVal() {
  		return g();
  	}
  }
}

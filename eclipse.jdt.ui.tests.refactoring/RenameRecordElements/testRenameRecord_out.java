test;
[p] {
[B]
    package p;
  class B{
  
  	public int val() {
  		C a= new C(10);
  		return a.f();
  	}
  }
[C]
    package p;
  record C(int f){
  	public C{
  		this.f= f;
  	}
  
  	public C() {
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

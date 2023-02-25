test;
[p] {
[B]
    package p;
  class B{
  
  	public int val() {
  		A a= new A(10);
  		return a.g();
  	}
  }
[C]
    package p;
  class C{
  
  	public int val2() {
  		A a= new A(40);
  		return a.g();
  	}
  }
  
[D]
    package p;
  record D(int f){
  	A{
  		this.f= f;
  	}
  
  	public void val(int f) {
		
  	}
  
  	public int getVal() {
  		return f();
  	}
  
  	public static void val() {
  		D d= new D(20);
  		return d.f();
  	}
  }
  
[A]
    package p;
  record A(int g){
  	A{
  		System.out.println(g);
  	}
  
  	public void val(int f) {
		
  	}
  
  	public int getVal() {
  		return g();
  	}
  }
}

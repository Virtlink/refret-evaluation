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
  
  	public int g() {
  		return g;
  	}
  }
}

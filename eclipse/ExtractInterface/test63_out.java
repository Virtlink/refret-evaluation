test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  	void t(){
  		new A(){
  			void g() throws InterruptedException{
  				A.super.wait();
  			}
  		};	
  	}
  }
}

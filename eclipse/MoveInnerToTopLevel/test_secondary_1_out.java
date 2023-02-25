test;
[p] {
[Secondary]
    package p;
  class Secondary {
  	void f(){
		
  	}
  }
[A]
    package p;
  
  public class A {
  	void f(){
  		new Secondary();
  	}
  }
}

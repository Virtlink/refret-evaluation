test;
[p] {
[A]
    package p;
  
  class A{
  	void foo(){
  	}
  	class Inner {
  		void f(){
  			foo();
  		}
  	}
  }
}

test;
[p] {
[A]
    package p;
  
  class A{
  	class Inner {
  	}
  	class X extends A{
  		void f(){
  			new Inner();
  		}
  	}
  }
}

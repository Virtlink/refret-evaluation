test;
[p] {
[A]
    package p;
  
  class A{
  	class X{}
  	class Inner {
  		void f(){
  			X x= new X();
  		}
  	}
  }
}

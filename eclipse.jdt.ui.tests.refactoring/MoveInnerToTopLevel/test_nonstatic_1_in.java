test;
[p] {
[A]
    package p;
  class A{
  	class Inner{
  		void f(){
  		}
  	}
  	void f(){
  		new Inner();
  	}
  }
}

test;
[p] {
[A]
    package p;
  class A<T>{
  }
  class Outer{
  	class B extends A<T>{
  		/**
  	 	* comment
  	 	*/
  		void f(){}
  	}
  }
}

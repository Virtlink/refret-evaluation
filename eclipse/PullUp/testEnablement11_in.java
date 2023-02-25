test;
[p] {
[A]
    package p;
  class A<T>{
  }
  class Outer{
  	class B extends A<String>{
  		/**
  	 	* comment
  	 	*/
  		void f(){}
  	}
  }
}

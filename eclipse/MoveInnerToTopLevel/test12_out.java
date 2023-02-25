test;
[p] {
[Inner]
    package p;
  
  import p.A.Inner2;
  
  class Inner{
  	void foo() {
  		Inner2 a;
  	}
  }
[A]
    package p;
  class A {
  	static class Inner2{
  		static class Inner2Inner{
  		}
  	}
  }
}

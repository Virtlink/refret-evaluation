test;
[p] {
[C]
    package p;
  class C{
  }
  
  class Inner {
  	void foo() {//comment here
  	}
  	int bar;//comment there
  	int baz;
  }
[A]
    package p;
  import java.util.*;
  class A {
  	class Inner {
  		void foo() {//comment here
  		}
  		int bar;//comment there
  		int baz;
  	}
  }
}

test;
[p] {
[C]
    package p;
  class C{
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

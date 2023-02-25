test;
[p] {
[MyEnum]
    package p;
  
  enum MyEnum {
      FOO, BAR;
  
  	void someMethod(A a) {
  	    switch (this) {
  	    case FOO:
  	        System.out.println(A.a);
  	        break;
  	    case BAR:
  	        System.out.println(a.b);
  	    }
  	}
  }
[A]
    package p;
  
  public class A {
      B someField;
      static int a;
      String b;
  }
  
  class B {
  
  }
}

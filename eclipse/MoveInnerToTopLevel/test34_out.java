test;
[p] {
[SomeClass]
    package p;
  class SomeClass {
  	String a;
  }
[A]
    package p;
  
  public class A {
  
  	Object o= new SomeClass().a;
  }
  
}

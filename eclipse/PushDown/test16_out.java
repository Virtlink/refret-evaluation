test;
[p] {
[A]
    package p;
  abstract class A{
  }
  abstract class B extends A{
  
  	public abstract void f();
  }
  class C extends A{
  	public void f(){}
  }
}

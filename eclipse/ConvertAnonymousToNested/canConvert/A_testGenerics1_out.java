test;
[p] {
[A]
    package p;
  //public, static, final
  class A<T>{
  	public final class Inner extends A<T> {
  	}
  
  	void f(){
  		new Inner();
  	}
  }
  
}

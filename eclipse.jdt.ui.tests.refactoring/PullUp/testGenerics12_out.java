test;
[p] {
[B]
    package p;
  
  class B<T> extends A<T>{
  }
  
[A]
    package p;
  
  import java.io.IOException;
  
  class A<T>{	
  	void x(){}
  
  	private void m(T t) throws IOException {
  	}
  }
}

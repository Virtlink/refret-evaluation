test;
[p] {
[B]
    package p;
  import java.io.IOException;
  class B<T> extends A<T>{
  	private void m(T t) throws IOException{
  	}
  }
  
[A]
    package p;
  class A<T>{	
  	void x(){}
  }
}

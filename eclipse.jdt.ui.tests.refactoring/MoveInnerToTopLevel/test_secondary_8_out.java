test;
[p] {
[Secondary]
    package p;
  
  import q.S;
  import q.T;
  
  final class Secondary {
  	void f(){
  		S s= new S();
  	}
  	void g(){
  		T t= new T();
  	}
  }
[A]
    package p;
  
  public class A {
  
  	class B {
  		public B(){
  			Secondary sec= new Secondary();
  			sec.f();
  			sec.g();
  		}
  	}
  }
}
[q] {
[S]
    package q;
  
  public class S {
  
  }
[T]
    package q;
  
  public class T {
  
  }
}

test;
[p] {
[Secondary]
    package p;
  
  import q.S;
  
  final class Secondary {
  	void f(S s){
		
  	}
  }
[A]
    package p;
  
  import q.S;
  import q.T;
  
  public class A {
  	S s= new S();
  	T t= new T();
  	class B {
  		public B(){
  			Secondary sec= new Secondary();
  			sec.f(s);
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

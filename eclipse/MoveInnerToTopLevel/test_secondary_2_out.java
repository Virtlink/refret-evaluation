test;
[p] {
[Secondary]
    package p;
  
  final class Secondary {
  	void f(){
  		new A().new B();
  	}
  }
[A]
    package p;
  
  public class A {
  	class B {
  		void B(){
  			Secondary s= new Secondary();
			
  		}
  	}
  }
}

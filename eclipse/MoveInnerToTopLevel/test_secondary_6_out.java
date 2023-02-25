test;
[p] {
[Secondary]
    package p;
  
  import p.A.X.Inner;
  
  class Secondary {
  	void f(){
  		Inner x= new A().new X().new Inner();
			
  	}
  }
[A]
    package p;
  
  
  class A {
  	class X {
  		class Inner {
			
  		}
  	}
  }
}

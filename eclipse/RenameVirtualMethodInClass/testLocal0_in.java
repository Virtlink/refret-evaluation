test;
[p] {
[A]
    package p;
  class A {
    void m() {
    }
    void baz() {
    	class B extends A {
    		void m() {
    		}
  		
    	}
    }
  }
  
}

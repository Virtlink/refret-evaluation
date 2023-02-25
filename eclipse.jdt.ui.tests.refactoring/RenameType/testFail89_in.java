test;
[p] {
[A]
    package p;
  class A{
  	class Inner{
  		void m(){
  			class C{
  				native void m();
  			}
  		}
  	}	
  }
}

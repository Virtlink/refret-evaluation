test;
[p] {
[B]
    package p;
  public class B {
  	static class Inner {
  		Inner buddy;
  		public Inner(B.Inner other) {
  			buddy= other;
  		}
  	}
  
  	B.Inner iFromB;
  }
  
[A]
    package p;
  public class A {
  	B.Inner i;
  	B.Inner ii;
  	p.B.Inner iii;
  }
  
  class AA {
  	B.Inner Inner;
  }
  
}

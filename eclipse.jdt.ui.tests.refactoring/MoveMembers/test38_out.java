test;
[r] {
[B]
    package r;
  
  public class B {
  
  	public static class Inner {
  		Inner buddy;
  		public Inner(Inner other) {
  			buddy= other;
  		}
  	}
  }
  
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A {
  	B.Inner i;
  	B.Inner ii;
  	r.B.Inner iii;
  }
  
}

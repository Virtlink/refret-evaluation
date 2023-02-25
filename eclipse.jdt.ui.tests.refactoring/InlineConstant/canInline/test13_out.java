test;
[p2] {
[InlineSite]
    // Here, an import is added for a type needed only after a qualification is added.
  // 8, 19 -> 8, 29  removeAll == false
  package p2;
  
  import p1.A;
  
  class InlineSite {
  	Object thing= A.ALFRED;	
  }
}
[p1] {
[A]
    package p1;
  
  public class A {
  	public class B {
  		public static final Object CONSTANT= ALFRED;	
  	}
  
  	public static final Object ALFRED= null;
  }
}

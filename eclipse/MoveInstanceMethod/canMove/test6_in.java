test;
[p2] {
[B]
    package p2;
  public class B {
  	int b;
  }
  
}
[p1] {
[Nestor]
    // class qualify referenced type name to top level, original receiver not used in method
  package p1;
  
  import p2.B;
  
  public class Nestor {
  	public static class Nestee {
  		public static int fgN;
  	}
  
  	public void m(B b) {
  		Nestee n= null;
  		int i= Nestee.fgN;
  	}
  }
}

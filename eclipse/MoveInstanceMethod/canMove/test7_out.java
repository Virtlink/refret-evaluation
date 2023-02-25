test;
[p2] {
[B]
    package p2;
  
  import p3.N1;
  import p3.N1.N2;
  import p3.N1.N2.N3;
  
  public class B {
  
  	public void m() {
  		N3 anN3= new N1().new N2().new N3();
  	}
  }
}
[p3] {
[N1]
    package p3;
  
  
  public class N1 {
  	public class N2 {
  		public class N3 {	
  		}
  	}
  }
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public class A {
  	public void m(B b) {
  		b.m();
  	}
  }
}

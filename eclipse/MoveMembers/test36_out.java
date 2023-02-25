test;
[p] {
[B]
    package p;
  public class B{
  
  	public static class I {
  		public I(I other) {
  			A.a= new A();
  		}
  		public static class J {
  			static int bla;
  			int x() {return 1;}
  		}
  	}
  }
  
[A]
    package p;
  public class A {
  	public static A a;
  	public B.I i;
  	{
  		i= new B.I(i);
  		int blub= B.I.J.bla + new B.I.J().x();
  	}
  }
  
}

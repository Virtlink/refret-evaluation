test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  	public String bar= "bar";
  
  	/**
  	 * m
  	 * @param a TODO
  	 * @return Object
  	 * @throws Exception
  	 */
  	public Object m(A a) throws Exception {
  		System.out.println(a.foo);
  		System.out.println(a.foo);
  		System.out.println(bar);
  		return null;
  	}
  }
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public class A {
  
  	public String foo= "foo";
  
  	/**
  	 * m
  	 * @param b
  	 * @return Object
  	 * @throws Exception
  	 */
  	public Object m(B b) throws Exception {
  		return b.m(this);
  	}
  }
}

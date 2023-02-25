test;
[p] {
[Inner]
    package p;
  
  import p.A.OtherInner;
  
  public class Inner extends A.OtherInner {
  
  /** Comment */
  private A a;
  
  /**
   * @param a
   */
  Inner(A a) {
  	a.super();
  	this.a = a;
  }}
[A]
    package p;
  public class A {
      public class OtherInner {}
  }
  
}

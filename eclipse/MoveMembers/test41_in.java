test;
[p] {
[B]
    
  
  package p;
  /**
   * @see A
   * @see p.A
   * @see p.A#m()
   * @see p.A#f
   */
  class B{
  }
[A]
    package p;
  
  public class A{
      public A() {
          m();
          f = A.f;
      }
  
      public static void m() {
          A.m();
          m();
          f = A.f;
      }
  
      public static int f;
  }
  
  package p;
  class B{
  }
}

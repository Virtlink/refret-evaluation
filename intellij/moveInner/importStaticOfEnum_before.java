test;
[p2] {
[U]
    package p2;
  
  import static p.A.E;
  
  public class U {
      E myE;
  }
}
[p] {
[A]
    package p;
  
  public class A {
      public enum E {
      }
  }
}

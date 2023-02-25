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
           EA("a"),
           EB("b")
  
           public final String PRESENTABLE_TEXT;
  
           E(final String presentableText) {
             PRESENTABLE_TEXT = presentableText;
           }
         
           void usageInside() {
             Object o = values();
           }
      }
  }
}

test;
[p2] {
[E]
    package p2;
  
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
  
[U]
    package p2;
  
  public class U {
      E myE;
  }
}
[p] {
[A]
    package p;
  
  public class A {
  }
}

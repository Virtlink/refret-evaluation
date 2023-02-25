test;
[pack1] {
[OuterClass]
    package pack1;
  
  public class OuterClass {
      @NewInnerClass public static class InnerClass { }
  }
  @interface NewInnerClass {}
}

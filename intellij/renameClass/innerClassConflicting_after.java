test;
[pack1] {
[OuterClass]
    package pack1;
  
  public class OuterClass {
      @pack1.NewInnerClass
      public static class NewInnerClass { }
  }
  @interface NewInnerClass {}
}

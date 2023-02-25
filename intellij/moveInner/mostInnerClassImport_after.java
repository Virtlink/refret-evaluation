test;
[pack1] {
[Inner]
    package pack1;
  
  public class Inner {
      private final MostInner innerMost = new MostInner();
  
      public class MostInner {}
  }
  
[Outer]
    package pack1;
  
  public class Outer {
  }
}

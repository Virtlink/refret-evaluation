test;
[Super]
    sealed class Super permits Test, Test1, Test2 {
    void doSmth() {
      System.out.println("hello");
    }
  }
[Test]
    final class Test extends Super {}
  
  non-sealed class Test1 extends Super {}
  
  sealed class Test2 extends Super permits Test3 {}
  
  final class Test3 extends Test2 {}
  
  

test;
[p] {
[Main]
    package p;
  
  import java.util.List;
  
  public class Main {
  }
  
[A]
    package p;
  
  import java.util.List;
  
  abstract class A implements List<A.B> {
      static class B {
      }
  }
  
}

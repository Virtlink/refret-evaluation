test;
[Test]
    public class Test {
  }
  
[Extracted]
    import java.util.Collections;
  import java.util.List;
  
  public class Extracted {
      public Extracted() {
      }
  
      List<Test> foo() {
          return Collections.emptyList();
      }
  }

test;
[Test]
    import java.util.function.Supplier;
  
  public class Test {
  
    public Test() {
      this(0);
    }
  
    public Test(int i) {}
  
  
    {
      Supplier<Test> sup = () -> new Test(0);
    }
  }

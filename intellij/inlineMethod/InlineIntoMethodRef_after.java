test;
[Test]
    import java.util.function.Supplier;
  
  class Test {
    {
      Supplier<String> sup = () -> {
          if (true) return null;
          return null;
      };
    }
  
    private String get() {
      if (true) return null;
      return null;
    }
  }

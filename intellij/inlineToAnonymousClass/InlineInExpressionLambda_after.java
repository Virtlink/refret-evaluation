test;
[Test]
    import java.util.function.Function;
  
  class InlineFromLambda {
    private static Function<String, Object> func(int p) {
      return s -> {
          final String name = s;
          final int p1 = p;
          return new Object();
      };
    }
  
  }

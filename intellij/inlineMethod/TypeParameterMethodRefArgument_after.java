test;
[Test]
    public class Test {
    @FunctionalInterface
    public interface Sup<T> {
      T make();
    }
  
    public String method() {
        return ((Sup<String>) this::toString).make();
    }
  
  }

test;
[Test]
    import java.util.stream.Stream;
  
  class Test {
    private static class Destination{
        private boolean notNull(String it) {
          return it != null;
        }
    }
  
    private final Destination destination = new Destination();
  
    public void main(Stream<String> stream){
      stream.filter(destination::notNull);
    }
  
  }

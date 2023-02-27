test;
[Test]
    import java.util.stream.Stream;

  class Test {
    private static class Destination{
        private boolean [[@1|notNull]]() {
          return this != null;
        }
    }

    private final Destination destination = new Destination();

    public void main(Stream<Destination> stream){
      stream.filter([[->1|notNull|Destination::notNull]]);
    }

  }

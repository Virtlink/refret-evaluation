[[{disabled}]] // Method reference

test;
[Test]
    import java.util.stream.Stream;

  class Test {
    private static class Destination{
        private boolean [[@1|notNull]](String it) {
          return it != null;
        }
    }

    private final Destination destination = new Destination();

    public void main(Stream<String> stream, Test [[@2|ref]]){
      stream.filter([[->1|&2|ref.destination::notNull]]);
    }

  }

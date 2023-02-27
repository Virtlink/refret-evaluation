[[{disabled}]] // Method reference

test;
[Test]
    import java.util.function.Consumer;

  class Source {
  }

  class Destination {
    public void [[@1|doSomething]](String s) {
    }

      public void foo() {
        Consumer<String> doSomething = [[->1|doSomething|this::doSomething]];
      }
  }

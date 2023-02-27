test;
[Test]
    import java.util.function.Predicate;

  class X {
    Predicate<String> predicate() {
      return [[@1|s]] -> ![[->1|s]].isEmpty() && [[->1|s]].length() + [[->1|s]].charAt(0) > 0;
    }

  }

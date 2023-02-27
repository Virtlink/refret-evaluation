[[{disabled}]]
test;
[Test]
    import java.util.function.Predicate;

  class X {
    Predicate<String> predicate() {
      return [[@3|s]] -> {
          if ([[->3|s]].isEmpty()) return false;
          int [[@1|length]] = [[->3|s]].length();
          int [[@2|ch]] = [[->3|s]].charAt(0);
          return [[->1|length]] + [[->2|ch]] > 0;
      };
    }

  }

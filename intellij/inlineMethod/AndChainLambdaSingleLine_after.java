test;
[Test]
    import java.util.function.Predicate;
  
  class X {
    Predicate<String> predicate() {
      return s -> !s.isEmpty() && s.length() + s.charAt(0) > 0;
    }
  
  }

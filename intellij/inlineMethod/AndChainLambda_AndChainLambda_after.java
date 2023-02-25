test;
[AndChainLambda]
    import java.util.function.Predicate;
  
  class X {
    Predicate<String> predicate() {
      return s -> {
          if (s.isEmpty()) return false;
          int length = s.length();
          int ch = s.charAt(0);
          return length + ch > 0;
      };
    }
  
  }

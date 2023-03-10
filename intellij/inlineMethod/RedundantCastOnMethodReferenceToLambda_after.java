test;
[Test]
    
  import java.util.*;
  import java.util.function.Function;
  import java.util.function.Predicate;
  
  import static java.util.function.Predicate.isEqual;
  
  class InlineRef {
    Optional<? extends Descriptor> findEmpty() {
      Set<? extends Descriptor> children = new HashSet<>();
      return children
        .stream()
        .filter(where(desc -> "name", isEqual("")))
        .findAny();
    }
  
  
    static <T, V> Predicate<T> where(Function<T, V> function, Predicate<? super V> predicate) {
      return input -> predicate.test(function.apply(input));
    }
  
  }
  
  class Descriptor { }

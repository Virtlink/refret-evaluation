[[{disabled}]] // Generics

test;
[Test]

  import java.util.Collection;
  import java.util.LinkedHashSet;
  import java.util.List;

  class A {
    <T> void bar(List<T> [[@1|root]], LinkedHashSet<List<T>> [[@2|list]]) {
        nested([[->2|list]], [[->1|root]]);
    }


      private static <S> void [[@3|nested]](Collection<S> result, S element) {}
  }

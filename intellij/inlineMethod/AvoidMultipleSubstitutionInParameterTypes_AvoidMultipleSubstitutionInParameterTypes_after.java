test;
[AvoidMultipleSubstitutionInParameterTypes]
    
  import java.util.Collection;
  import java.util.LinkedHashSet;
  import java.util.List;
  
  class A {
    <T> void bar(List<T> root, LinkedHashSet<List<T>> list) {
        nested(list, root);
    }
  
  
      private static <S> void nested(Collection<S> result, S element) {}
  }

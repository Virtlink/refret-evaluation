test;
[Substitution]
    class Foo {
  
  
      public WeighingComparable<String, ProximityLocation> method(boolean b,
                                                                final Computable<String> elementComputable,
                                                                Object processingContext) {
          return new WeighingComparable<String, ProximityLocation>(elementComputable, new ProximityLocation(), new Weigher[0]);
      }
  
    public static final Key<ProximityWeigher> WEIGHER_KEY = null;
  }
  
  abstract class ProximityWeigher extends Weigher<String, ProximityLocation> {
  
  }
  
  class ProximityLocation {
  }
  
  class Key<P> {
  }
  
  class Weigher<A, B> {
  }
  
  class Computable<O> {}
  
  class WeighingComparable<T, Loc> implements Comparable<WeighingComparable<T, Loc>> {
  
    public WeighingComparable(final Computable<T> element, final Loc location, final Weigher[] weighers) {
    
    }
  
    public int compareTo(@NotNull final WeighingComparable<T, Loc> comparable) {
      return 0;
    }
  
    @Nullable
    private Comparable getWeight(final int index) {
      return null;
    }
  }
  

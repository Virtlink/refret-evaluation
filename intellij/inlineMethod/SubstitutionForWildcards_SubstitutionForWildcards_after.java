test;
[SubstitutionForWildcards]
    interface Pair<A extends String> {
      A get();
  }
  
  class B {
  
      {
          Pair<?> p = null;
          String v = p.get();
      }
  }
  
  
  

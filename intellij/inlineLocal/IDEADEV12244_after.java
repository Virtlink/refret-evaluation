test;
[Test]
    import java.util.*;
  
  class IDEADEV12244 {
      {
          TreeMap<String, Set<Integer>> map = new TreeMap<String, Set<Integer>>();
          map.put("foo", Collections.<Integer>emptySet());
      }
  }

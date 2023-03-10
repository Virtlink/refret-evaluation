test;
[Test]
    import java.util.*;
  
  class Foo {
      public void foo(Bar bar) {
          for (Iterator it = bar.getCns().iterator(); it.hasNext();) {
              final String o = (String) it.next();
          }
      }
  }
  
  class Bar<CN extends Bar> {
      private List<CN> cns;
  
      public List<CN> getCns() {
          if (cns == null) {
              return Collections.emptyList();
          }
          return cns;
      }
  }

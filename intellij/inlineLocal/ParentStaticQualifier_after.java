test;
[Test]
    import java.util.*;
  class GrCaseLabel {
  }
  
  class A0 {
    protected static <T> List<T> findChildrenByType() {
      return null;
    }
  }
  
  class A extends A0 {
    void f() {
        for (GrCaseLabel label : A0.<GrCaseLabel>findChildrenByType()) {
      }
    }
  }
  

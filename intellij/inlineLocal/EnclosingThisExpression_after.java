test;
[Test]
    import java.util.*;
  class GrCaseLabel {
  }
  
  class A0 {
    protected <T> List<T> findChildrenByType() {
      return null;
    }
  }
  
  class A extends A0 {
    void f() {
        for (GrCaseLabel label : this.<GrCaseLabel>findChildrenByType()) {
      }
    }
  }
  

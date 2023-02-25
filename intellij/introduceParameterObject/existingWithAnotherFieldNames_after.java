test;
[Test]
    public class Test {
    void foo(Param param) {
      System.out.println(param.getMyClass());
    }
  }
[Param]
    class Param {
      private String myClass;
  
      public P(String myClass) {
          this.myClass = myClass;
      }
  
      public String getSourceClass() {
          return myClass;
      }
  
      public String getMyClass() {
          return myClass;
      }
  }
  

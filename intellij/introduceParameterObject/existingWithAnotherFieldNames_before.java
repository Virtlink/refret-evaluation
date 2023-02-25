test;
[Test]
    public class Test {
    void foo(String aClass) {
      System.out.println(aClass);
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
  }
  

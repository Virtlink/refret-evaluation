test;
[RefFinalLocalInitializedWithMethod]
    public class A {
      void test(String s) {
          System.out.println(s);
          System.out.println(s.length());
      }
  
      void callTest(String aString) {
          test(aString);
      }
  }
  

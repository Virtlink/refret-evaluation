test;
[RefFinalLocal]
    public class A {
      void test(String s1) {
          final String s2 = s1;
          System.out.println(s1);
          System.out.println(s2);
      }
  
      void callTest() {
          String s = "";
          test(s);
      }
  }
  

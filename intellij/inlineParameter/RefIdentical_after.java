test;
[A]
    public class A {
      void test(String s1) {
          String s2 = s1;
          System.out.println(s1);
          System.out.println(s2);
      }
  
      void callTest() {
          String s = "";
          test(s);
      }
  }
  
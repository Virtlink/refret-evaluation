test;
[QualifyInnerTest]
    public class QualifyInnerTest {
      public class C2User {
          public void test() {
              Object inner = new Object() {
                  public void doStuff() {
                      System.out.println(C2.a);
                  }
              };
          }
      }
  }
  
  class C2 {
      public static int a;
  
  }
  

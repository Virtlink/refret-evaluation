test;
[QualifiedNew]
    public class QualifiedNewTest {
      public class C2 {
          private int a;
  
      }
  
      public class C2User {
          public void test() {
              C2 c2 = new C2();
              final C2 c21 = c2;
              Object inner = new Object() {
                  public void doStuff() {
                      System.out.println(c21.a);
                  }
              };
          }
      }
  }
  

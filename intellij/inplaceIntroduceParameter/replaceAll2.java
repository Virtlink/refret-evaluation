test;
[ATest]
    public class ATest {
    public static final String FOO = "foo";
    public static final String FOO1 = "foo1";
  
      String m_interval = "";
      void foo() {
        if (FOO.equals(<caret>m_interval.substring(1))) {
            System.out.println(FOO);
        } else if (FOO1.equals(m_interval.substring(1))) {
            System.out.println();
        }
      }
  }
  

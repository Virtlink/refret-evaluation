test;
[QualifiedExpressionInLib]
    class QTest {
    {
      System.out.println(Foo.FOO);
    }
  }
  
  class Foo {
    public static final String FOO = "FOO";
    public static final String BAR = FOO;
  }

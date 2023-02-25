test;
[FoldReturnExpression]
    public class Test {
    String foo(String[] s, int i) {
      return <selection>s[i]</selection>;
    }
  }

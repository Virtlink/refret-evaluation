test;
[Test]
    class MyTest {
    {
      int <caret>j = 0;
      System.out.println(false ? j : 'x');
    }
  }

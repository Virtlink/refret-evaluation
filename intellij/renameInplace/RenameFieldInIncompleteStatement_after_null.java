test;
[RenameFieldInIncompleteStatement]
    class MyTest {
  
      String bar;
  
      {
          I i;
  
          bar
          i = MyTest::foo;
      }
  }

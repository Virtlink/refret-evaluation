test;
[Test]
    class Test {
      int test(int x){
          <selection>String out = "out";
          if (x > 10) return 0;
          if (x < 10) return 1;</selection>
          System.out.println(out);
          return -1;
      }
  }
  
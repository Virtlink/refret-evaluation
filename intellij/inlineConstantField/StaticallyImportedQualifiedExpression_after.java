test;
[p] {
[Test]
    package p;
  
  import static p.C.mock;
  class C {
    public static String mock() {
      return null;
    }
  }
  
  class D {
  }
  class QTest {
    public static void main(String[] args) {
      String s = mock();
    }
  }
}

test;
[D]
    class A {
    class C {
      int x = 42;
    }
  }
  
  public class D {
    static class C extends A {
      int x = 23;
  
      int m() {
        return D.C.this.x;
      }
    }
  
    public static void main(String[] args) {
      System.out.println(new C().m());
    }
  }

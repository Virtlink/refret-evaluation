test;
[RenameInnerInSuperClassStatic]
    class A {
    static class C {
      static int x = 42;
    }
  }
  
  public class D {
    static class C extends A {
      static int x = 23;
  
      static int m() {
        return D.C.x;
      }
    }
  
    public static void main(String[] args) {
      System.out.println(D.C.m());
    }
  }

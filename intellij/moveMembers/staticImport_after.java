test;
[B]
    public class B {
      public static final String X = "x";
      public static final String Z = "z";
  }
[C]
    public class C {
  }
[A]
    import static B.*;
  
  public class A {
    public static void main(String[] args) {
      System.out.println("X = " + X);
      System.out.println("Z = " + Z);
    }
  }

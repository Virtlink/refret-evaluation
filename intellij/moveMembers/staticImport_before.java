test;
[B]
    public class B {
      public static final String X = "x";
  }
[C]
    public class C {
    public static final String Z = "z";
  }
[A]
    import static C.*;
  import static B.*;
  
  public class A {
    public static void main(String[] args) {
      System.out.println("X = " + X);
      System.out.println("Z = " + Z);
    }
  }

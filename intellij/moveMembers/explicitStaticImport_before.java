test;
[B]
    public class B {
  }
[C]
    public class C {
    public static final String Z = "z";
  }
[A]
    import static C.Z;
  
  public class A {
    public static void main(String[] args) {
      System.out.println("Z = " + Z);
    }
  }

test;
[p1] {
[B]
    // 8,33 -> 8,40 replaceAll == true
  package p1;
  
  import static p1.A.version2;
  
  public class B {
  
      private static final String version = version2;
  
      private void test() {
          String copy = version;
      }
  }
[A]
    package p1;
  
  public class A {
  
  	public static String version2;
  
  }
}

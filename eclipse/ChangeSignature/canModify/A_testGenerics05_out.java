test;
[p] {
[A]
    package p;
  
  interface I
  {
    public void test(Class<?> arg);
  }
  
  class C implements I
  {
    public void test(Class<?> arg) {}
  }
}

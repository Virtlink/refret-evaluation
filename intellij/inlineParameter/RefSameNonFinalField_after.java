test;
[Subject]
    public class Subject {
    private int myInt;
    private int t;
  
    public void wp(String s) {
      myInt += t;
    }
  
    void foo() {
        wp("s1");
        wp("s2");
    }
  }

test;
[Subject]
    public class Subject {
    private int myInt;
  
    public void wp() {
      myInt += User.OUR_CONST;
    }
  }
  
  class User {
    public static final int OUR_CONST = 2;
    public static final int OUR_CONST2 = 2;
  
    private void oper() {
      Subject subj = new Subject();
      subj.wp();
      subj.wp();
    }
  }
  

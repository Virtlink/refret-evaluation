test;
[RefThis]
    class User {
    public class Subject {
      private int myInt;
  
      public void withClass() {
        myInt += User.this.hashCode();
      }
    }
  
    private void oper() {
      Subject subj = new Subject();
      subj.withClass();
    }
  }
  
  

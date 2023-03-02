test;
[Subject]
    class User {

      int [[@1|hashCode]]() { return 0; }

    public class Subject {
      private int myInt;

      public void withClass() {
        myInt += [[->1|hashCode()|User.this.hashCode()]];
      }
    }

    private void oper() {
      Subject subj = new Subject();
      subj.withClass();
    }
  }



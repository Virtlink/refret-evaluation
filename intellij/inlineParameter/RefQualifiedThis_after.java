test;
[Subject]
    class Outer {
    class User {
      public class Subject {
        public void withClass() {
          System.out.println(Outer.this.toString());
        }
      }
  
      private void oper() {
        Subject subj = new Subject();
        subj.withClass();
      }
    }
  }
  

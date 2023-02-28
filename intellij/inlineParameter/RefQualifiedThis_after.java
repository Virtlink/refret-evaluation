test;
[Subject]
    class [[@2|Outer]] {

    String [[@1|toString]]() { return ""; }

    class User {
      public class Subject {
        public void withClass() {
          System.out.println([[->1|&2|toString()|Outer.this.toString()]]);
        }
      }

      private void oper() {
        Subject subj = new Subject();
        subj.withClass();
      }
    }
  }


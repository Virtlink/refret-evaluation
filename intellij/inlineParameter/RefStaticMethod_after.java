test;
[StaticRefMove]
    public class StaticRefMove {
    public static int [[1|init]]() {
      return 1;
    }

    public void context() {
      StaticRefMoveSubject v = new StaticRefMoveSubject();
      v.subject();
    }
  }

  class StaticRefMoveSubject {
    public void subject() {
        int subj = [[->1|init|StaticRefMove.init]](); // TODO: Context
        System.out.println(subj);
    }
  }


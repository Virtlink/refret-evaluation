test;
[StaticRefMove]
    public class [[@2|StaticRefMove]] {
    public static int [[@1|init]]() {
      return 1;
    }

    public void context() {
      StaticRefMoveSubject v = new StaticRefMoveSubject();
      v.subject();
    }
  }

  class StaticRefMoveSubject {
    public void subject() {
        int subj = [[->1|&2|init|StaticRefMove.init]]();
        System.out.println(subj);
    }
  }


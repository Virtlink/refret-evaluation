test;
[MappingMember2MemberDifferent]
    class Mapping {
    public void <caret>method() {
      toString();
    }
  
    public void context() {
      Mapping m = new Mapping();
      m.toString();
    }
  }
  

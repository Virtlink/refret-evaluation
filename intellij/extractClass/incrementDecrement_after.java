test;
[Test]
    class Test {
      final Extracted extracted = new Extracted();
  
      {
          extracted.setMyT(0);
    }
  
    void bar(){
      int i = extracted.setMyT(extracted.getMyT() + 1);
    }
  }
[Extracted]
    public class Extracted {
      int myT;
  
      public int getMyT() {
          return myT;
      }
  
      public void setMyT(int myT) {
          this.myT = myT;
      }
  
      public Extracted() {
      }
  }

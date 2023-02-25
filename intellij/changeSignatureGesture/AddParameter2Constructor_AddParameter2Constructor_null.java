test;
[refactoring.changeSignatureGesture] {
[AddParameter2Constructor]
    package refactoring.changeSignatureGesture;
  class TestMeabracadabra {
    TestMeabracadabra(<caret>){
    }
  
    public static void main(String[] args) {
      TestMeabracadabra t = new TestMeabracadabra();
    }
  }
}

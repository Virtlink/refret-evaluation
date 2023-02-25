test;
[refactoring.changeSignatureGesture] {
[AddParameter2UnusedConstructor]
    package refactoring.changeSignatureGesture;
  class TestMeabracadabra {
    private TestMeabracadabra(<caret>){
    }
    private TestMeabracadabra(String f){
    }
  }
}

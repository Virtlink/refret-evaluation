test;
[q] {
[Consts]
    package q;
  
  public interface Consts {
  	int I= 1;
  	int III= I + I + I;
  }
}
[p] {
[A]
    //8, 16 -> 8, 19  replaceAll == true, removeDeclaration == false
  package p;
  
  import static q.Consts.III;
  
  class A {
  	int getIII() {
  		return III;
  	}
  }
  
}

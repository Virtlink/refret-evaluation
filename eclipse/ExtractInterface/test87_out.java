test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  }
[A]
    package p;
  class A implements I {
  	int x;
  }
  class ST{
  }
  class T extends ST{
  	void add(I c){
  		new I[]{null}[0]= c;
  	}
  }
}

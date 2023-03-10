test;
[p] {
[A]
    package p;
  
  class TestInlineMethodReference0 {
  
  	private FI fun1() {
  		final FI fi = this::m;
		
  		FI fi1 = fi;	// [1]
  		FI fi2;
  		fi2 = fi;		// [2]	
		
  		FI[] a = new FI[] {fi, fi}; // [3]
  		FI[][] b = new FI[][] {{fi, fi}, {fi}}; // [4]
  		FI[] c = {fi, fi}; // [5]
  		FI[][] d = {{fi}, {fi}}; // [6]
  
  		int x1 = fun2(fi);	// [7]
  		TestInlineMethodReference0 c1 = new TestInlineMethodReference0(fi);	// [8]
  		F f1 = (fi_p) -> fi;	// [9]
  		F f2 = (fi_p) -> {
  			return fi;		// [10]
  		};
  		f1.bar(fi); // [11]
  		FI fi4 = true ? fi : fi; // [12]
  		return fi;		// [13]
  	}
  
  	private int fun2(FI fi) {return 0;}
  	public TestInlineMethodReference0(FI fi) { }
  
  	int m(int x) {
  		return x++;
  	}
  }
  
  @FunctionalInterface
  interface FI {
  	int foo(int x);
  }
  
  @FunctionalInterface
  interface F {
  	FI bar(FI fi);
  }
}

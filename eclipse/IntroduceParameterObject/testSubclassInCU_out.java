test;
[p] {
[TestSubclassInCU]
    package p;
  
  public class TestSubclassInCU {
  	int x = foo(new FooParameter(1, 2, 3));
  
  	public int foo(FooParameter parameterObject) {
  		return parameterObject.xg + parameterObject.yg;
  	}
  }
  
  class B extends TestSubclassInCU {
  	public int foo(FooParameter parameterObject) {
  		System.out.println(parameterObject.xg);
  		foo(new FooParameter(parameterObject.xg, parameterObject.yg, parameterObject.zg));
  		this.foo(new FooParameter(parameterObject.xg, parameterObject.zg, parameterObject.yg));
  		new B().foo(new FooParameter(parameterObject.xg, parameterObject.zg, parameterObject.yg));
  		super.foo(new FooParameter(parameterObject.xg, parameterObject.zg, parameterObject.yg));
  		return super.x;
  	}
  }
[FooParameter]
    package p;
  
  public class FooParameter {
  	public int xg;
  	public int yg;
  	public int zg;
  	public FooParameter(int xg, int yg, int zg) {
  		this.xg = xg;
  		this.yg = yg;
  		this.zg = zg;
  	}
  }
}

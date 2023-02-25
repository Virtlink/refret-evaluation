test;
[p] {
[FooParameter]
    package p;
  
  public class FooParameter<T> {
  	public T t;
  	public FooParameter(T t) {
  		this.t = t;
  	}
  }
[TestMethodTypeParamArgsTopLevel]
    package p;
  interface TestMethodTypeParamArgsTopLevel<T> {
  	void foo(FooParameter parameterObject);
  }
}

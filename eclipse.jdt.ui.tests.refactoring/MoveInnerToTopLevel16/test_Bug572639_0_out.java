test;
[p] {
[Layout]
    package p;
  // To see the error
  // select Layout -> right click to get context menu, Refactor -> Move Type to a New File
  // an extra import com.github.forax.tomahawk.schema.Schema.Layout.PrimitiveLayout; is in Layout.java
  public interface Layout {
  	default boolean isPrimitive() {
        return this instanceof Layout.PrimitiveLayout;
      }
      record PrimitiveLayout() implements Layout { }
  }
[A]
    package p;
  
  public interface A {
  }
}

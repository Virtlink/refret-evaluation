test;
[p] {
[Rectangle]
    package p;
  
  public class Rectangle {
  	public int x;
  	public int y;
  	public int width;
  	public int height;
  
  	public Rectangle (int x, int y, int width, int height) {
  		this.x = x;
  		this.y = y;
  		this.width = width;
  		this.height = height;
  	}
  
  	public int getWidth() {
  		return width;
  	}
  
  	public int getHeight() {
  		return height;
  	}
  
  	/**
  	 * Returns the filled area
  	 * @param shape TODO
  	 * @return the filled area
  	 */
  	public int filledArea(Shape shape) {
  		return shape.area() -	getWidth() * getHeight();
  	}
  }
  
[Shape]
    package p;
  
  public class Shape {
  	Rectangle fBounds;
  	Rectangle fInnerBounds;
  
  	public int area() {
  		int width= fBounds.getWidth();
  		int height= fBounds.getHeight();
  		return width*height;
  	}
  
  	/**
  	 * Returns the filled area
  	 * @return the filled area
  	 */
  	public int filledArea() {
  		return fInnerBounds.filledArea(this);
  	}
  
  	public boolean isSmallerThan(Rectangle rect) {
  		return area() < rect.getWidth() * rect.getHeight();
  	}
  
  }
  
}

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
  	 * Returns the area
  	 * @return the area
  	 */
  	public int area() {
  		int width= getWidth();
  		int height= getHeight();
  		return width*height;
  	}
  }
  
[Shape]
    package p;
  
  public class Shape {
  	Rectangle fBounds;
  	Rectangle fInnerBounds;
  
  	/**
  	 * Returns the area
  	 * @return the area
  	 */
  	public int area() {
  		return fBounds.area();
  	}
  
  	public int filledArea() {
  		return area() -	fInnerBounds.getWidth() * fInnerBounds.getHeight();
  	}
  
  	public boolean isSmallerThan(Rectangle rect) {
  		return area() < rect.getWidth() * rect.getHeight();
  	}
  
  }
  
}

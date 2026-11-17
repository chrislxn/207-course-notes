/** A rectangle with a width and height that can be scaled together. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the initial width
   * @param height the initial height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions of this rectangle by the given factor.
   *
   * @param factor the multiplier applied to the width and height
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * Compares the area of this rectangle with another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a strictly greater area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}

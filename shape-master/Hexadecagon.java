
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Hexadecagon implements Shape
{
  private int sidelength;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public Hexadecagon(int radius, String color)
  {
    this.sidelength = sidelength;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return (4*(sidelength*sidelength))/(4*Math.coTanA(Math.PI/6));
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 16 * sidelength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}

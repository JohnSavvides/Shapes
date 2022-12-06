
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class RegularPolygon implements Shape
{
  private int sidelength;
  private String color;
  private int sides;
  
  /**
   * Constructor for objects of class Circle
   */
  public RegularPolygon(int sidelength, String color, int sides)
  {
    this.sidelength = sidelength;
    this.color = color;
    this.sides = sides;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
      double apothem = sidelength/(2*(Math.tan(Math.PI/sides)));
      return apothem*sides*sidelength*0.5;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return sides * sidelength;
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
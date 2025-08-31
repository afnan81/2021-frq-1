public class Rectangle {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
  }

  public int calculateArea() {
      return length * width;
  }

  public static void main(String[] args) {
      Rectangle rect = new Rectangle(10, 5);
      int area = rect.calculateArea();
      System.out.println("The area of the rectangle is: " + area);
  }
}
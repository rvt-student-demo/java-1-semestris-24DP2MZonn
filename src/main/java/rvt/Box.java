package rvt;

public class Box {
    public double width;
    public double height;
    public double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double side){

    }

    public Box(Box oldBox) {
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.width = oldBox.width;
    }

    public Box biggerBox() {
        return new Box(
            1.25 * this.width,
            1.25 * this.height,
            1.25 * this.length
        );
    }

    public Box smallerBox() {
        return new Box(
            0.75 * this.width,
            0.75 * this.height,
            0.75 * this.length
        );
    }
    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width &&
            this.height < outsideBox.height &&
            this.length < outsideBox.length;
        
        }

    public double area() {
       return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    private double faceArea() {
        return width * height;
    }
    private double topArea() {
        return length * width;
    }
    private double sideArea() {
        return height * length;
    }

    public double volume(){
        return width * length * height; 
    }
    public static void main ( String[] args )
  {
     Box oldBox = new Box(2.5, 5.0, 6.0);
     Box box = new  Box(oldBox);
     Box biggerBox = oldBox.biggerBox();
     Box smallerBox = oldBox.smallerBox();

     System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox. volume() );

     System.out.println( "length: " + biggerBox.length + " height: " + biggerBox. height +
                         " width:  " + biggerBox.width )  ;
     System.out.println("Is this box fitting inside the outside box? " + smallerBox.nests(box));

  }
}

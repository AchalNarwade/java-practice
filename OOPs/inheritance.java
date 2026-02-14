class Shape{
    String color;

    //constructor
    Shape(String color){
        this.color = color;
        System.out.println("Shape Constructor called");
    }

    void displayColor(){
        System.out.println("Color: " + color);
    }

    void area(){
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape{
    int length , breadth;

    //constructor
    Rectangle(String color,int l,int b){
        super(color); //calling parent constructor
        this.length = l;
        this.breadth = b;
        System.out.println("Rectangle constructor called");
    }

    @Override
    void area(){
        System.out.println("Rectangle area: " + (length*breadth));
    }

    void rectangleOnlyMethod(){
        System.out.println("Rectangle specific method");
    
    }
}

class Circle extends Shape{
    int radius;

    //constructor
    Circle(String color,int r){
        super(color);
        this.radius = r;
        System.out.println("Circle constructor called");
    }

    @Override
    void area(){
        System.out.println("Circle area: " + ((3.14)*radius*radius));
        
    }
}

class Square extends Shape{
    int side;
    
    //constructor
    Square(String color,int s){
        super(color);
        this.side = s;
        System.out.println("Square Constructor called");
    }

    @Override
    void area(){
        System.out.println("Square area: " + (side*side));
    }

    void squareOnlyMethod(){
        System.out.println("Square specific method");
    }
}


public class inheritance{
    public static void main(String[] args){

// Parent references

    Shape s1 = new Rectangle("Red",10,5);
    s1.displayColor();
    s1.area();
//s1.rectangleOnlyMethod(); - NOT ALLOWED
 
    System.out.println();

    Shape s2 = new Circle("Blue",7);
    s2.displayColor();
    s2.area();

    System.out.println();

//Child reference 

    Square s3 = new Square("Yellow",5);
    s3.displayColor();
    s3.area();
    s3.squareOnlyMethod();


    }
}
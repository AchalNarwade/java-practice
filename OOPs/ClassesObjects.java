//EX-1

class Rectangle {

    int length;
    int breadth;

    int area() {
        return length*breadth;
    }
}

class Main {
    public static void main(String[] args) {
        
    Rectangle r1 = new Rectangle();
    r1.length = 10;
    r1.breadth = 5;
   
    System.out.println("Area = " + r1.area());

   }
}


//Ex-2

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    
    int sub(int a , int b){
        return a-b;
    }
}

class Main{
    public static void main(String[] args){
    
    Calculator c = new Calculator();
    System.out.println(c.add(5,10));
    System.out.println(c.sub(20,6));
    
    }
}

// EX-3

class Book{
    
    String title;
    int price;

    void display(){
        System.out.println(title + " , " + price);

    }
}

class Main{
    public static void main(String[] args){
      
        Book b1 = new Book();
        b1.title = "Twisted Love";
        b1.price = 250;
        b1.display();

    }
}


// EX-4

class Employee {
    int id;
    String name;
    double salary;

    void display(){
        System.out.println(name + ", " + id + " & salary:" + salary);

    }

}

class Main{
    public static void main(String[] args){
    
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();

    e1.id = 102;
    e1.name = "Achal";
    e1.salary = 123456;

    e2.id = 106;
    e2.name = "prathamesh";
    e2.salary = 12345;
    
    e3.id = 109;
    e3.name = "Geeta";
    e3.salary = 1234;

    Employee highest = e1;
    
    if (e2.salary > highest.salary){
    highest = e2;
    }

    if(e3.salary > highest.salary){
    highest = e3;
    }
    
    System.out.println("Employee with highest salary:");
    highest.display();

    }
    
}
import java.util.*;


class Calculator{
    
    
    int add(int a, int b,int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }

    int add(int a, int b){ 
        return a+b;
    }
}

public class polymorphism1{
    public static void main(String[] achh){
    
    Calculator cal = new Calculator();

    System.out.println(cal.add(2,3));
    System.out.println(cal.add(2,3,4));
    System.out.println(cal.add(2.5,5.9));
    
    }
}
class Student {
    int rollNo;
    String name;
    int marks;

    void display(){
        System.out.println("Roll no: " + rollNo +
                           ", Name: " + name + 
                            ", Marks: " + marks);

    }

    public static void main(String[] args){

    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    s1.rollNo = 101;
    s1.name = "Achal";
    s1.marks = 78;

    s2.rollNo = 102;
    s2.name = "Anushka";
    s2.marks = 85;

    s3.rollNo = 103;
    s3.name = "Prathamesh";
    s3.marks = 82;

    Student highest = s1;

    if(s2.marks > highest.marks){
        highest = s2;
    }
    if(s3.marks > highest.marks){
        highest = s3;
    }
    System.out.println("Highest marks: ");
    highest.display();

    }

}
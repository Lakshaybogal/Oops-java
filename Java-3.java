
class Student{
    String name;
    String gender;
    String dept;
    double cgpa;
    Student(String name ,String gender ,String dept ,double cgpa)
    {
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.cgpa = cgpa;
    }
    void display() {
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Dept : " + dept);
        System.out.println("Cgpa : " + cgpa);
    }
}
class Placement extends Student{
    String indName;
    int aPackage;
    int letterNo;
    Placement(String name ,String gender ,String dept ,double cgpa,String indName, int aPackage, int letterNo)
    {
        super(name ,gender ,dept ,cgpa);
        this.indName = indName;
        this.aPackage = aPackage;
        this.letterNo = letterNo;
    }
    void display() {
        super.display();
        System.out.println("Industry name : "+indName);
        System.out.println("Package : "+aPackage);
        System.out.println("Join-in letter  : "+letterNo);
    }

}
class HigherStu extends Student{

    String DegreeNa;
    String college;
    int AdLetter;
    HigherStu(String name,String gender ,String dept,double cgpa,String DegreeNa, String college, int AdLetter)
    {
        super(name ,gender ,dept ,cgpa);
        this.DegreeNa = DegreeNa;
        this.college = college;
        this.AdLetter = AdLetter;
    }
    void display() {
        super.display();
        System.out.println("Degree name : "+DegreeNa);
        System.out.println("Collage : "+college);
        System.out.println("Admission letter no. : "+AdLetter);
    }

}

class Enterpreneur extends Student {

    String cName;
    String sector;
    int noEmployee;
    int annTurnover;

    Enterpreneur(String name, String gender, String dept, double cgpa, String cName, String sector, int noEmployee, int annTurnover) {
        super(name, gender, dept, cgpa);
        this.cName = cName;
        this.sector = sector;
        this.noEmployee = noEmployee;
        this.annTurnover = annTurnover;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Company name : "+cName);
        System.out.println("Sector : "+sector);
        System.out.println("No. of employees : "+noEmployee);
        System.out.println("Annual Turnover : "+annTurnover);
    }
}

public class Main {
    public static void main(String[] args) {
        Student []S = new Student[5];
        S[0] = new Placement("Lakshay","Male","CSE",8.27,"Google",3000000,108);
        S[0].display();
        S[1] = new HigherStu("Lakshay","Male","CSE",8.27,"Master in CSE","IIT Bombay",10809);
        S[1].display();
        S[2] = new Enterpreneur("Lakshay","Male","CSE",8.27,"Google mera hai","IT",9,900000000);
        S[2].display();
    }
}

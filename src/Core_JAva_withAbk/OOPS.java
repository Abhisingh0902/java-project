package Core_JAva_withAbk;
//
//import java.net.SocketOption;
//
//class pen{
//    String color;
//    String type;
//    public void write(){
//        System.out.println("Writing some things");
//    }
//    public void printColor(){
//        System.out.println(this.color);             // this is ude to identify call  by which obeject
//    }
//    public void printType(){
//        System.out.println(this.type);
//    }
//
//}
//class Student{
//    String name;
//    int age;
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//
//    }
////    Student(){                          //Non Paramatric constructor
////        System.out.println("Constructor called");
////    }
////    Student(String Name,int age){           //Paramatric constructor
////        this.name=Name;
////        this.age=age;
////
////    }
//    Student (Student s2){                   // copy constructor
//        this.name= s2.name;
//        this.age= s2.age;
//    }
//    Student(){
//
//    }
//}
//public class OOPS {
//    public static void main(String args[]) {
////        pen pen1=new pen();
////        pen1.color="bluue";
////        pen1.type="gel";
////        pen pen2=new pen();
////        pen2.color="red";
//
//
//
////        pen2.type="ballpoint";
////        pen1.write();
////        pen1.printColor();
////        pen1.printType();
////        pen2.printType();
////        pen2.printColor();
////        Student s1 = new Student("Abhishek kumar",23);   // for passing argumnet or parameter
//        Student s1=new Student();
//        s1.name = "Abhishek kumar";
//        s1.age = 23;
////        Student s2 = new Student("Aman kumar",24);             "/ for passing argumnet or parameter
//        Student s2=new Student(s1);
////        Student s2 =new Student();
////        s2.name = "Badal kumar";
////        s2.age = 24;
////        s1.printInfo();
//        s2.printInfo();
//    }
//}

//               ******************   POLYMORPHISM    **************  ///
//class Student{
//    String name;
//    int age;
//    public void printInfo(String name){
//        System.out.println(name);
//    }
//    public void printInfo(int age){
//        System.out.println(age);
//    }
//    public void printInfo(String name,int age){
//        System.out.println(name+" "+age);
//    }
//}
//
//
//public class OOPS {
//    public static void main(String args[]){
//    Student s1=new Student();
//    s1.name="Abhishek kumar";
//    s1.age=23;
//    s1.printInfo(s1.age);  //function overloding
//    s1.printInfo(s1.name); //function overloding
//    s1.printInfo(s1.name, s1.age);  //function overloding
//    }
//}
                    //          **************** INHERITANCE    ******************    ///////
class Shap{                                 //base class or parent class
    public void area() {
        System.out.println("display  area");
    }
}
class Tringle extends Shap{                    // single level inhereitance
    public void area(int l,int  h){
        System.out.println((l*h)/2);
    }
}
class EqulitralTringle extends Tringle{        // multi level inhereitance
    public void area(int l,int h){
        System.out.println(l*h/2);
    }
}

public class OOPS {
    public static void main(String args[]){
    Tringle t1=new Tringle();
    t1.area(4,8);

    }
}
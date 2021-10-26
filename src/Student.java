
public class Student {
    String name , address;
    int age;
    public Student(){
        this.name = "Unknown";
        this.address ="Not available" ;
        this.age = 0;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setInfo("Raj", "domb",18);
        Student s1 = new Student();
        s1.setInfo("ram", "kurla", 22);
        Student s2 = new Student();
        s2.setInfo("Fahad", "mulund", 25);
        Student s3 = new Student();
        s3.setInfo("Sunny", "vashi", 22);
        Student s4 = new Student();
        s4.setInfo("Erica", "kalyan", 24);
        Student s5 = new Student();
        s5.setInfo("Rohan", "Haldi", 23);
        Student s6 = new Student();
        s6.setInfo("Rossy", "bandra", 21);
        Student s7 = new Student();
        s7.setInfo("Arman", "diva", 22);
        Student s8 = new Student();
        s8.setInfo("Vinod", "bhopal", 25);
        Student s9 = new Student();
        s9.setInfo("Rudra", "coper", 20);
    }
    void setInfo(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Name is: "+name+ "Age is: "+age);
    }
    void setInfo(String name ,String address , int age){
        this.name = name;
        this.address = address;
        this.age = age;

        System.out.println("Name:"+name+"\t\t\tAddress:"+address+"\t\t\t\t\tAge:"+age);

    }
}
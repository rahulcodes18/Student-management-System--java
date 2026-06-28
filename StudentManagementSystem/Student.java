public class Student{
    private int id;
    private String name;
    private int age;
    private String course;

    public Student ( int id ,String name,int age, String course){
        this.id=id;
        this.name = name;
        this.age=age;
        this.course=course;

    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getcourse(){
        return name;
    }
    public void setname(String name){
        this.name = name;

    }

    public void setage(int age ){
        this. age = age;

    }
    public void setcourse(String course){
        this.course = course;
    }
    
    @Override
public String toString() {
    return "\n----------------------------" +
           "\nStudent id : " + id +
           "\nname       : " + name +
           "\nage        : " + age +
           "\ncourse     : " + course +
           "\n----------------------------";
}



    public static void main (String args[]){

    }
}
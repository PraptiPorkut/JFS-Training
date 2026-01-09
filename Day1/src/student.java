public class Student{
    String name;
    String id;
    private int age;
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public int getage(){
        System.out.println(this.name+" has "+ this.age);
        return this.age;
    }
    public void setage(int age) {
        if (age >= 20 && age <= 60) {
            System.out.println("Invalid age range.");
        } else {
            this.age = age;
            System.out.println("Age updated to: " + this.age);
        }
    }
    void ispass(){
        if (age>50){
            System.out.println("Hey, you are seniour citizen");
        }
        else {
            System.out.println("You are underage.");
        }
    }
    void introduce(){
        System.out.println("good afternoon!! I am "+name+" I am "+age+" years old "+id);
    }
}

package Eqn;

public class Student {
    public int Age;
    public int Roll;
    public int Class;

    public Student(Integer Age, int Roll, int Class) {
        this.Age = Age;
        this.Roll = Roll;
        this.Class = Class;
    }
    public int getRoll() {
        return this.Roll;
    }
}
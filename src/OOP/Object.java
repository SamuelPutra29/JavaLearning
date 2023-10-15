/*
Class of object is called class. It is a logical entity.
A class can also be defined as a blueprint from which you can create an individual object.
Class doesn't consume any space

Object have states and behaviors. Example: A dog has states: color, name , breed as well as behaviors, - wagging the tail.
An object is an instance of a class

Dalam OOP:
- Variable disebut atribut atau properti
- Fungsi disebut method


 */

package OOP;


class Student{

    String name = "Sam";
    int age =10;

    public void getInfo(){
        System.out.println("The name of this student is "+ name);
        System.out.println("The age of this student is "+ age);
    }


}

public class Object {
    public static void main(String[] args) {
          Student s1 = new Student();
          s1.name = "Aman";
          s1.age = 21;
          s1.getInfo();

    }



}

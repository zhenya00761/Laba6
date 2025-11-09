package student;

import ExceptionsCin.AgeExceptions;
import ExceptionsCin.LastNameExceptions;
import ExceptionsCin.NameExceptions;
import ExceptionsCin.SexExceptions;

public class Student implements Comparable<Student>{

    private String name;
    private String lastName;
    private String sex;
    private int age;

    //Конструкторы

    public Student(){
        this.name = "";
        this.lastName = "";
        this.sex = "";
        this.age = 0;
    }

    public Student(String name, String lastName, String sex, int age){
        setName(name);
        setLastName(lastName);
        setSex(sex);
        setAge(age);
    }

    //Геттеры

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    //Сеттеры

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new NameExceptions("Имя не может быть пустым");
        }

        if (Character.isLowerCase(name.charAt(0))){
            throw new NameExceptions("Имя должно быть с заглавной буквы");
        }

        this.name = name;

    }

    public void setLastName(String lastName) {

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new LastNameExceptions("Фамилия не может быть пустой");
        }

        if (Character.isLowerCase(lastName.charAt(0))){
            throw new LastNameExceptions("Фамилия должна быть с заглавной буквы");
        }

        this.lastName = lastName;
    }

    public void setSex(String sex) {

        if (sex == null || sex.trim().isEmpty()) {
            throw new SexExceptions("Пол не может быть пустым");
        }

        if (!sex.trim().equalsIgnoreCase("male") && !sex.trim().equalsIgnoreCase("female")){
            throw new SexExceptions("Такого пола нет");
        }

        this.sex = sex;

    }

    public void setAge(int age) {
        if (age <= 0){
            throw new AgeExceptions("Такого возраста не может быть");
        }
        this.age = age;
    }


    public int compareTo(Student other){
        if (this.getLastName().compareTo(other.getLastName()) == 0){
            return this.getName().compareTo(other.getName());
        }
        return this.getLastName().compareTo(other.getLastName());
    }

    public void Info() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Пол: " + this.getSex());
        System.out.println("Возраст: " + this.getAge());
    }

}

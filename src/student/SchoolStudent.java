package student;

import java.util.Comparator;

public class SchoolStudent extends Student{


    private int schoolNumber;
    private Lessons lessons;

    //Конструкторы

    public SchoolStudent() {
        super();
        this.lessons = null;
    }

    public SchoolStudent(Lessons lessons) {
        super();
        this.lessons = lessons;
    }

    public SchoolStudent(SchoolStudent other) {
        super();
        this.lessons = other.lessons;
    }

    //Геттеры

    public Lessons getLessons() {
        return lessons;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    //Сеттеры

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public boolean schoolStip(){
        if (lessons.checkGrades() && lessons.coolCheck()){
            return true;
        }
        return false;
    }

    @Override
    public void Info() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Пол: " + this.getSex());
        System.out.println("Возраст: " + this.getAge());
        System.out.println("Оценки за предметы: ");
        for (int i = 1; i <= 17; i++) {
            if (lessons.getGrades().get(i) != null && lessons.getGrades().get(i) != 0) {
                System.out.println("    " + lessons.getNames().get(i) + ": " + lessons.getGrades().get(i));
            }
        }

    }
}

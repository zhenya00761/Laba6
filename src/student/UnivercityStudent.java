package student;

import java.util.ArrayList;
import java.util.List;

public class UnivercityStudent extends Student{

    private int kyrs;
    private List<Subject> subjects = new ArrayList<>();

    //Коснтрукторы

    public UnivercityStudent(){
        super();
        this.kyrs = 0;
        this.subjects = new ArrayList<>();
    }

    public UnivercityStudent(String name, String sex, int age, int kyrs, List<Subject> subjects){
        super();
        this.kyrs = kyrs;
        this.subjects = subjects;
    }

    public int getKyrs() {
        return kyrs;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setKyrs(int kyrs) {
        this.kyrs = kyrs;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double averageSubj(){

        double sum = 0;
        for (Subject sub: subjects){
            sum += sub.getGrade();
        }
        return Math.round(sum / subjects.size() * 100.0) / 100.0;
    }

    public boolean univercityStip(){
        if (kyrs == 5 && averageSubj() > 4.75){
            return true;
        }
        return false;
    }

    @Override
    public void Info() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Пол: " + this.getSex());
        System.out.println("Возраст: " + this.getAge());
        for (Subject subject: subjects){
            System.out.printf("%s : %d \n", subject.getNameSubject(), subject.getGrade());
        }
    }

}

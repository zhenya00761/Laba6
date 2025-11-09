package student;

import java.util.HashMap;
import java.util.Map;

public class Lessons {

    public static final int RUSSIAN_LANGUAGE = 1;
    public static final int LITERATURE = 2;
    public static final int ALGEBRA = 3;
    public static final int GEOMETRY = 4;
    public static final int INFORMATICS = 5;
    public static final int HISTORY = 6;
    public static final int SOCIAL_STUDIES = 7;
    public static final int GEOGRAPHY = 8;
    public static final int BIOLOGY = 9;
    public static final int PHYSICS = 10;
    public static final int CHEMISTRY = 11;
    public static final int FOREIGN_LANGUAGE = 12;
    public static final int ART = 13;
    public static final int MUSIC = 14;
    public static final int TECHNOLOGY = 15;
    public static final int PHYSICAL_EDUCATION = 16;
    public static final int MATH = 17;

    private Map<Integer, Integer> grades;

    private static final Map<Integer, String> Names = new HashMap<>();

    static {
        Names.put(RUSSIAN_LANGUAGE, "Русский");
        Names.put(LITERATURE, "Литература");
        Names.put(ALGEBRA, "Алгебра");
        Names.put(GEOMETRY, "Геометрия");
        Names.put(INFORMATICS, "Информатика");

        Names.put(HISTORY, "История");
        Names.put(SOCIAL_STUDIES, "Обществознание");
        Names.put(GEOGRAPHY, "География");
        Names.put(BIOLOGY, "Биология");
        Names.put(PHYSICS, "Физика");

        Names.put(CHEMISTRY, "Химия");
        Names.put(FOREIGN_LANGUAGE, "Иностраннай язык");
        Names.put(ART, "Рисование");
        Names.put(MUSIC, "Музыка");
        Names.put(TECHNOLOGY, "Технология");

        Names.put(PHYSICAL_EDUCATION, "Физра");
        Names.put(MATH, "Математика");
    }

    // Конструкторы

    public Lessons(){
        this.grades = new HashMap<>();
    }

    public Lessons(Map<Integer, Integer> newGrades){
        this();
        for (Map.Entry<Integer, Integer> pair: newGrades.entrySet()){
            if (pair.getValue() != 0) {
                setGrades(pair.getKey(), pair.getValue());
            }
        }
    }

    public Lessons(Lessons other){
        this();
        this.grades = other.grades;
    }

    //Геттер оценок

    public Map<Integer, Integer> getGrades() {
        return grades;
    }

    public static Map<Integer, String> getNames() {
        return Names;
    }

    //Сеттеры оценок

    public void setGrades(int Key, int Value) {
        this.grades.put(Key, Value);
    }

    public void setGrades(Map<Integer, Integer> grades) {
        this.grades = grades;
    }

    //Пятерки по определенным предметам

    public boolean coolCheck(){
        Integer mathGrade = grades.get(MATH);
        Integer russianGrade = grades.get(RUSSIAN_LANGUAGE);
        Integer historyGrade = grades.get(HISTORY);
        Integer foreignLangGrade = grades.get(FOREIGN_LANGUAGE);

        return mathGrade != null && mathGrade == 5 &&
                russianGrade != null && russianGrade == 5 &&
                historyGrade != null && historyGrade == 5 &&
                foreignLangGrade != null && foreignLangGrade == 5;
    }

    public int avaregeGrade(){
        int cnt = 0;
        double sum = 0;
        for (Integer grade : grades.values()) {
            if (grade != null && grade != 0) {
                cnt += 1;
                sum += grade;
            }
        }
        return (int) Math.ceil(sum / cnt);
    }

    public boolean checkGrades(){
        for (int i = 1; i <= 17; i++){
            for (Integer grade : grades.values()) {
                if (grade != null && grade < 4) {
                    return false;
                }
            }
        }
        return true;
    }

}

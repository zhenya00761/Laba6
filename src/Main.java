import student.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<SchoolStudent> schoolStudents = new ArrayList<>();
        List<UnivercityStudent> universityStudents = new ArrayList<>();

        createSchoolStudents(schoolStudents);
        createUniversityStudents(universityStudents);

        LinkedList<Student> allStudents = new LinkedList<>();

        //1 задание

        for (SchoolStudent student: schoolStudents){
            if (student.schoolStip()){
                allStudents.add(student);
            }
        }

        for (UnivercityStudent student: universityStudents){
            if (student.univercityStip()){
                allStudents.add(student);
            }
        }

        Collections.sort(allStudents);

        System.out.println("===================1 ЗАДАНИЕ=======================");
        for (Student student: allStudents){
            student.Info();
            System.out.println("-------------------------------------------------");
        }

        //2 ZADANIE

        int maxGrade = 0;
        SchoolStudent bestS = new SchoolStudent();
        for (SchoolStudent student: schoolStudents){
            if (student.getLessons().avaregeGrade() > maxGrade){
                maxGrade = student.getLessons().avaregeGrade();
                bestS = student;
            }
        }
        System.out.println("===================2 ЗАДАНИЕ=======================");
        System.out.printf("Лучший школьник: %s %s\n", bestS.getName(), bestS.getLastName());

        double maxGradeU = 0;
        UnivercityStudent bestU = new UnivercityStudent();
        for (UnivercityStudent student: universityStudents){
            if (student.averageSubj() > maxGradeU){
                maxGradeU = student.averageSubj();
                bestU = student;
            }
        }
        System.out.printf("Лучший student: %s %s\n", bestU.getName(), bestU.getLastName());

        //3 ЗАДАНИЕ

        System.out.println("===================3 ЗАДАНИЕ=======================");
        System.out.println("Рейтинг школьников:");
        Collections.sort(schoolStudents, new SchoolStudentComparator());
        int i = 1;
        for (SchoolStudent student: schoolStudents){
            System.out.printf("%d: %s %s\n", i, student.getName(), student.getLastName());
            i++;
        }

        System.out.println("===================4 ЗАДАНИЕ=======================");
        System.out.println("Рейтинг студентов:");
        Collections.sort(universityStudents, new UnivercityStudentComparator());
        i = 1;
        for (UnivercityStudent student: universityStudents){
            System.out.printf("%d: %s %s\n", i, student.getName(), student.getLastName());
            i++;
        }
    }

    private static void createSchoolStudents(List<SchoolStudent> schoolStudents) {
        // Школьник 1 - претендент
        Map<Integer, Integer> grades1 = new HashMap<>();
        grades1.put(Lessons.MATH, 5);
        grades1.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades1.put(Lessons.HISTORY, 5);
        grades1.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades1.put(Lessons.PHYSICS, 5);
        grades1.put(Lessons.CHEMISTRY, 5);
        Lessons lessons1 = new Lessons(grades1);
        SchoolStudent student1 = new SchoolStudent(lessons1);
        student1.setName("Артем");
        student1.setLastName("Волков");
        student1.setSex("male");
        student1.setAge(15);
        schoolStudents.add(student1);

        // Школьник 2 - претендент
        Map<Integer, Integer> grades2 = new HashMap<>();
        grades2.put(Lessons.MATH, 5);
        grades2.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades2.put(Lessons.HISTORY, 5);
        grades2.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades2.put(Lessons.LITERATURE, 5);
        grades2.put(Lessons.GEOGRAPHY, 5);
        Lessons lessons2 = new Lessons(grades2);
        SchoolStudent student2 = new SchoolStudent(lessons2);
        student2.setName("Кристина");
        student2.setLastName("Лебедева");
        student2.setSex("female");
        student2.setAge(14);
        schoolStudents.add(student2);

        // Школьник 3 - претендент
        Map<Integer, Integer> grades3 = new HashMap<>();
        grades3.put(Lessons.MATH, 5);
        grades3.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades3.put(Lessons.HISTORY, 5);
        grades3.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades3.put(Lessons.INFORMATICS, 5);
        grades3.put(Lessons.PHYSICS, 5);
        Lessons lessons3 = new Lessons(grades3);
        SchoolStudent student3 = new SchoolStudent(lessons3);
        student3.setName("Роман");
        student3.setLastName("Соловьев");
        student3.setSex("male");
        student3.setAge(16);
        schoolStudents.add(student3);

        // Школьник 4 - не претендент (история 4)
        Map<Integer, Integer> grades4 = new HashMap<>();
        grades4.put(Lessons.MATH, 5);
        grades4.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades4.put(Lessons.HISTORY, 4);
        grades4.put(Lessons.FOREIGN_LANGUAGE, 5);
        Lessons lessons4 = new Lessons(grades4);
        SchoolStudent student4 = new SchoolStudent(lessons4);
        student4.setName("Алиса");
        student4.setLastName("Козлова");
        student4.setSex("female");
        student4.setAge(13);
        schoolStudents.add(student4);

        // Школьник 5 - претендент
        Map<Integer, Integer> grades5 = new HashMap<>();
        grades5.put(Lessons.MATH, 5);
        grades5.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades5.put(Lessons.HISTORY, 5);
        grades5.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades5.put(Lessons.BIOLOGY, 5);
        grades5.put(Lessons.CHEMISTRY, 5);
        Lessons lessons5 = new Lessons(grades5);
        SchoolStudent student5 = new SchoolStudent(lessons5);
        student5.setName("Максим");
        student5.setLastName("Егоров");
        student5.setSex("male");
        student5.setAge(17);
        schoolStudents.add(student5);

        // Школьник 6 - не претендент (английский 4)
        Map<Integer, Integer> grades6 = new HashMap<>();
        grades6.put(Lessons.MATH, 5);
        grades6.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades6.put(Lessons.HISTORY, 5);
        grades6.put(Lessons.FOREIGN_LANGUAGE, 4);
        Lessons lessons6 = new Lessons(grades6);
        SchoolStudent student6 = new SchoolStudent(lessons6);
        student6.setName("Виктория");
        student6.setLastName("Орлова");
        student6.setSex("female");
        student6.setAge(15);
        schoolStudents.add(student6);

        // Школьник 7 - претендент
        Map<Integer, Integer> grades7 = new HashMap<>();
        grades7.put(Lessons.MATH, 5);
        grades7.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades7.put(Lessons.HISTORY, 5);
        grades7.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades7.put(Lessons.SOCIAL_STUDIES, 5);
        grades7.put(Lessons.GEOGRAPHY, 5);
        Lessons lessons7 = new Lessons(grades7);
        SchoolStudent student7 = new SchoolStudent(lessons7);
        student7.setName("Никита");
        student7.setLastName("Жуков");
        student7.setSex("male");
        student7.setAge(16);
        schoolStudents.add(student7);

        // Школьник 8 - не претендент (русский 4)
        Map<Integer, Integer> grades8 = new HashMap<>();
        grades8.put(Lessons.MATH, 5);
        grades8.put(Lessons.RUSSIAN_LANGUAGE, 4);
        grades8.put(Lessons.HISTORY, 5);
        grades8.put(Lessons.FOREIGN_LANGUAGE, 5);
        Lessons lessons8 = new Lessons(grades8);
        SchoolStudent student8 = new SchoolStudent(lessons8);
        student8.setName("Дарья");
        student8.setLastName("Павлова");
        student8.setSex("female");
        student8.setAge(14);
        schoolStudents.add(student8);

        // Школьник 9 - претендент
        Map<Integer, Integer> grades9 = new HashMap<>();
        grades9.put(Lessons.MATH, 5);
        grades9.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades9.put(Lessons.HISTORY, 5);
        grades9.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades9.put(Lessons.ART, 5);
        grades9.put(Lessons.MUSIC, 5);
        Lessons lessons9 = new Lessons(grades9);
        SchoolStudent student9 = new SchoolStudent(lessons9);
        student9.setName("Глеб");
        student9.setLastName("Титов");
        student9.setSex("male");
        student9.setAge(15);
        schoolStudents.add(student9);

        // Школьник 10 - претендент
        Map<Integer, Integer> grades10 = new HashMap<>();
        grades10.put(Lessons.MATH, 5);
        grades10.put(Lessons.RUSSIAN_LANGUAGE, 5);
        grades10.put(Lessons.HISTORY, 5);
        grades10.put(Lessons.FOREIGN_LANGUAGE, 5);
        grades10.put(Lessons.PHYSICAL_EDUCATION, 5);
        grades10.put(Lessons.TECHNOLOGY, 5);
        Lessons lessons10 = new Lessons(grades10);
        SchoolStudent student10 = new SchoolStudent(lessons10);
        student10.setName("Полина");
        student10.setLastName("Фролова");
        student10.setSex("female");
        student10.setAge(16);
        schoolStudents.add(student10);
    }

    private static void createUniversityStudents(List<UnivercityStudent> universityStudents) {
        // Студент 1 - претендент (средний 4.8 + курсовая 5)
        List<Subject> subjects1 = Arrays.asList(
                new Subject("Математика", 5),
                new Subject("Физика", 5),
                new Subject("Программирование", 5),
                new Subject("Базы данных", 4),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student1 = new UnivercityStudent();
        student1.setName("Анна");
        student1.setLastName("Иванова");
        student1.setSex("female");
        student1.setAge(20);
        student1.setKyrs(2);
        student1.setSubjects(subjects1);
        universityStudents.add(student1);

        // Студент 2 - претендент (средний 4.75 + курсовая 5)
        List<Subject> subjects2 = Arrays.asList(
                new Subject("История", 5),
                new Subject("Философия", 5),
                new Subject("Социология", 4),
                new Subject("Политология", 5),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student2 = new UnivercityStudent();
        student2.setName("Петр");
        student2.setLastName("Сидоров");
        student2.setSex("male");
        student2.setAge(21);
        student2.setKyrs(3);
        student2.setSubjects(subjects2);
        universityStudents.add(student2);

        // Студент 3 - не претендент (нет курсовой)
        List<Subject> subjects3 = Arrays.asList(
                new Subject("Экономика", 5),
                new Subject("Менеджмент", 5),
                new Subject("Бухгалтерия", 5)
        );
        UnivercityStudent student3 = new UnivercityStudent();
        student3.setName("Мария");
        student3.setLastName("Петрова");
        student3.setSex("female");
        student3.setAge(19);
        student3.setKyrs(1);
        student3.setSubjects(subjects3);
        universityStudents.add(student3);

        // Студент 4 - претендент (средний 5.0 + курсовая 5)
        List<Subject> subjects4 = Arrays.asList(
                new Subject("Химия", 5),
                new Subject("Биология", 5),
                new Subject("Анатомия", 5),
                new Subject("Генетика", 5),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student4 = new UnivercityStudent();
        student4.setName("Иван");
        student4.setLastName("Кузнецов");
        student4.setSex("male");
        student4.setAge(22);
        student4.setKyrs(4);
        student4.setSubjects(subjects4);
        universityStudents.add(student4);

        // Студент 5 - не претендент (средний 4.5)
        List<Subject> subjects5 = Arrays.asList(
                new Subject("Литература", 5),
                new Subject("Искусство", 4),
                new Subject("Культурология", 5),
                new Subject("Дизайн", 4),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student5 = new UnivercityStudent();
        student5.setName("Елена");
        student5.setLastName("Васильева");
        student5.setSex("female");
        student5.setAge(20);
        student5.setKyrs(2);
        student5.setSubjects(subjects5);
        universityStudents.add(student5);

        // Студент 6 - претендент (средний 4.8 + курсовая 5)
        List<Subject> subjects6 = Arrays.asList(
                new Subject("Механика", 5),
                new Subject("Термодинамика", 5),
                new Subject("Электротехника", 4),
                new Subject("Материаловедение", 5),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student6 = new UnivercityStudent();
        student6.setName("Дмитрий");
        student6.setLastName("Смирнов");
        student6.setSex("male");
        student6.setAge(23);
        student6.setKyrs(5);
        student6.setSubjects(subjects6);
        universityStudents.add(student6);

        // Студент 7 - не претендент (курсовая 4)
        List<Subject> subjects7 = Arrays.asList(
                new Subject("Психология", 5),
                new Subject("Педагогика", 5),
                new Subject("Социальная работа", 5),
                new Subject("Дефектология", 5),
                new Subject("Курсовая работа", 4)
        );
        UnivercityStudent student7 = new UnivercityStudent();
        student7.setName("Ольга");
        student7.setLastName("Попова");
        student7.setSex("female");
        student7.setAge(21);
        student7.setKyrs(3);
        student7.setSubjects(subjects7);
        universityStudents.add(student7);

        // Студент 8 - претендент (средний 4.8 + курсовая 5)
        List<Subject> subjects8 = Arrays.asList(
                new Subject("Юриспруденция", 5),
                new Subject("Криминалистика", 5),
                new Subject("Международное право", 4),
                new Subject("Гражданское право", 5),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student8 = new UnivercityStudent();
        student8.setName("Алексей");
        student8.setLastName("Федоров");
        student8.setSex("male");
        student8.setAge(20);
        student8.setKyrs(2);
        student8.setSubjects(subjects8);
        universityStudents.add(student8);

        // Студент 9 - претендент (средний 5.0 + курсовая 5)
        List<Subject> subjects9 = Arrays.asList(
                new Subject("Маркетинг", 5),
                new Subject("Реклама", 5),
                new Subject("PR", 5),
                new Subject("Брендинг", 5),
                new Subject("Курсовая работа", 5)
        );
        UnivercityStudent student9 = new UnivercityStudent();
        student9.setName("Светлана");
        student9.setLastName("Морозова");
        student9.setSex("female");
        student9.setAge(19);
        student9.setKyrs(1);
        student9.setSubjects(subjects9);
        universityStudents.add(student9);

        // Студент 10 - не претендент (нет предметов)
        UnivercityStudent student10 = new UnivercityStudent();
        student10.setName("Сергей");
        student10.setLastName("Новиков");
        student10.setSex("male");
        student10.setAge(22);
        student10.setKyrs(4);
        universityStudents.add(student10);
    }
}
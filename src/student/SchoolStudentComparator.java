package student;

import java.util.Comparator;

public class SchoolStudentComparator implements Comparator<SchoolStudent> {

    @Override
    public int compare(SchoolStudent s1, SchoolStudent s2) {
        if (s1.getLessons().avaregeGrade() == s2.getLessons().avaregeGrade()){
            if (s1.getSchoolNumber() > s2.getSchoolNumber()) {
                return 1;
            }else{
                return -1;
            }
        }
        if (s1.getLessons().avaregeGrade() > s2.getLessons().avaregeGrade()) {
            return -1;
        }
        return 0;
    }
}

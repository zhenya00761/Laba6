package student;

import java.util.Comparator;

public class UnivercityStudentComparator implements Comparator<UnivercityStudent> {

    @Override
    public int compare(UnivercityStudent s1, UnivercityStudent s2) {
        if (s1.averageSubj() > s2.averageSubj()){
            return -1;
        }
        if (s1.averageSubj() == s2.averageSubj()){
            return 0;
        }
        return 1;
    }
}

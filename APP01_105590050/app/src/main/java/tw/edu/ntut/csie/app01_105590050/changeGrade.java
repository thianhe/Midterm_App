package tw.edu.ntut.csie.app01_105590050;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */


public class changeGrade {
    public String letterGrade(int score){
        if(score > 100 || score<0)
            return "grade = 'X'";
        else if(score >= 90)
            return "grade = 'A'";
        else if(score >= 80)
            return "grade = 'B'";
        else if(score >= 70)
            return "grade = 'C'";
        else if(score >= 60)
            return "grade = 'D'";
        else
            return "grade = 'F'";
    }
}


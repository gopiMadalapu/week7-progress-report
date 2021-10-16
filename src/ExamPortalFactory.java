/**
 * This class implements the factory design pattern
 */

public class ExamPortalFactory {
    public ExamPortal getItem(String Answer, String grade){
        if(Answer == null){
            return null;
        }
        if(Answer.equalsIgnoreCase("Answering")) {
            ExamPortal g= new Answering();
            ((Answering) g).selectGrade(grade);
            return g;
        }
        else if(Answer.equalsIgnoreCase("Evaluating")){
            ExamPortal g= new Evaluating();
            ((Evaluating) g).selectGrade(grade);
            return g;
        }
        else if(Answer.equalsIgnoreCase("Grading")) {
            ExamPortal g= new Grading();
            ((Grading) g).selectGrade(grade);
            return g;
        }
        return null;
    }
}
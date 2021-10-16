public abstract class ExamPortal {
    int marks;
    GradeAdapter grade;

    abstract void setMarks(int marks);

    public int calculateMarks(int units){
        return units*marks;
    }
}
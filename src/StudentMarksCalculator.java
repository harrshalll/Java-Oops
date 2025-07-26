public class StudentMarksCalculator {
    public static void main(String[] args) {
       Student Aman = new Student("Aman",78,96,70);
       Student Rakesh = new Student("Rakesh",89,95,78);

    }
}

class Student{
    String name;
    int mathMarks;
    int scienceMarks;
    int englishMarks;

    Student(String name, int math, int science, int english) {
        this.name = name;
        this.mathMarks = math;
        this.scienceMarks = science;
        this.englishMarks = english;
        System.out.println(this.name + "'s Average: " + calculateAverage(this.mathMarks, this.scienceMarks, this.englishMarks));


    }

    static int calculateAverage(int maths, int sci, int eng){
        int average = (maths + sci + eng)/ 3;
        return average;
    }
}

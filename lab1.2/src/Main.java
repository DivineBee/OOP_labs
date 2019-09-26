public class Main {
    public static void main(String[] args) {
        System.out.println("Average of all students is " +(Average(Data())));
    }
    private static University[] Data() {
//1st university students
        Student OxfordStudent1 = new Student("Milly", 21, 8.3f);
        Student OxfordStudent2 = new Student("David", 21, 9.6f);
        Student OxfordStudent3 = new Student("Carol", 22, 9.4f);
        Student OxfordStudent4 = new Student("Dave", 21, 9.0f);
        //array for students of the same university
        Student[] OxfordStudents = {OxfordStudent1, OxfordStudent2,OxfordStudent3,OxfordStudent4};
//2nd university students
        Student CambridgeStudent1 = new Student("Ari", 24, 10.0f);
        Student CambridgeStudent2 = new Student("Helen", 22, 7.9f);
        Student CambridgeStudent3 = new Student("Sarah", 21, 8.6f);
        Student[] CambridgeStudents = {CambridgeStudent1, CambridgeStudent2,CambridgeStudent3};
//3rd university students
        Student StanfordStudent1 = new Student("Kale", 23, 9.4f);
        Student StanfordStudent2 = new Student("Danny", 20, 7.9f);
        Student[] StanfordStudents = {StanfordStudent1, StanfordStudent2};
//creating universities objects
        University Oxford = new University("Oxford", OxfordStudents);
        University Cambridge = new University("Cambridge", CambridgeStudents);
        University Stanford = new University("Stanford", StanfordStudents);
//creating array of 3 universities
        University[] universities = new University[3];
        universities[0] = Oxford;
        universities[1] = Cambridge;
        universities[2] = Stanford;
        return universities;
    }
//method for calculating average mark
    private static float Average(University[] universities) {
        float sum = 0;
        int numberOfStudents = 0;
        for (University university : universities) {
            Student[] students = university.getStudents();
            for (Student student : students) {
                sum = student.getMark() + sum;
            }
            numberOfStudents += university.getStudents().length;
        }
        return sum / numberOfStudents;
    }
}

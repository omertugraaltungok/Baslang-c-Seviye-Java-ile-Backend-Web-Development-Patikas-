package PratikÖğrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.30); // %30 sözlü
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.20);   // %20 sözlü
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25);   // %25 sözlü

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(60, 60, 60);
        s1.addBulkSozluNote(90, 90, 90);  // sözlü notlar
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(30, 50, 70);
        s2.addBulkSozluNote(60, 80, 75);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(80, 90, 40);
        s3.addBulkSozluNote(60, 40, 100);
        s3.isPass();
    }
}

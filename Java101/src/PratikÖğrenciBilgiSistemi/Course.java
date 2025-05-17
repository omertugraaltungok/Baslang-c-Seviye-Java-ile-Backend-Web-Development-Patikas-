package PratikÖğrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;        // Sınav notu
    int sozluNote;   // Sözlü notu
    double sozluOrani; // Sözlü notun etkisi (0.20 gibi)

    public Course(String name, String code, String prefix, double sozluOrani) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
        this.sozluOrani = sozluOrani;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double getOrtalama() {
        double sinavOrani = 1 - sozluOrani;
        return (this.note * sinavOrani) + (this.sozluNote * sozluOrani);
    }
}

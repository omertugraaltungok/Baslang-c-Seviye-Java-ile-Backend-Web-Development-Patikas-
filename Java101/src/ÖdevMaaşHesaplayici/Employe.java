import java.util.jar.Attributes.Name;

public class Employe {

    String name;
    double salary;
    double vergi;
    double bonus;
    double maasArtis;
    int workHours;
    int hireYear;

    Employe(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary > 1000) {
            this.vergi = salary * 0.03;
            System.out.println("Vergi : " + this.vergi);
        } else {
            System.out.println("Vergi : " + this.vergi);
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (workHours - 40) * 30;
            System.out.println("Bonus : " + this.bonus);
        } else {
            System.out.println("BOnus : " + this.bonus);
        }
    }

    void raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            this.maasArtis = salary * 0.05;
            System.out.println("Maaş Artışı : " + this.maasArtis);
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            this.maasArtis = salary * 0.1;
            System.out.println("Maaş Artışı : " + this.maasArtis);
        } else if (2021 - this.hireYear > 19) {
            this.maasArtis = salary * 0.15;
            System.out.println("Maaş Artışı : " + this.maasArtis);
        }
    }

    @Override
    public String toString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.vergi));
        System.out.println("Toplam Maaş : " + (this.maasArtis + this.salary + this.bonus - this.vergi));
        return super.toString();
    }

}

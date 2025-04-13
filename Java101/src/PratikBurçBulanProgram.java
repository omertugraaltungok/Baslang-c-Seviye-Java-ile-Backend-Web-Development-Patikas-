import java.util.Scanner;

public class PratikBurçBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        String burç = "";

        System.out.print("Doğduğunuz ayı giriniz : ");
        int month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        int day = input.nextInt();

        if (month == 1) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burç = "Oğlak";
                } else {
                    burç = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if ((day >= 1) && (day <= 29)) {
                if (day <= 19) {
                    burç = "Kova";
                } else {
                    burç = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 20) {
                    burç = "Balık";
                } else {
                    burç = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 20) {
                    burç = "Koç";
                } else {
                    burç = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burç = "Boğa";
                } else {
                    burç = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burç = "İkizler";
                } else {
                    burç = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burç = "Yengeç";
                } else {
                    burç = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burç = "Aslan";
                } else {
                    burç = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burç = "Başak";
                } else {
                    burç = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burç = "Terazi";
                } else {
                    burç = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 21) {
                    burç = "Akrep";
                } else {
                    burç = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burç = "Yay";
                } else {
                    burç = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz");
        } else {
            System.out.println(burç + " burcusunuz. ");
        }

    }
}

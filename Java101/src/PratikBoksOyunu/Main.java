package PratikBoksOyunu;

public class Main {
    public static void main(String[] args) {
      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 40);
      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 50);
      Match r = new Match(marc,alex , 90 , 100);
      r.run();
    }
}
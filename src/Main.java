public class Main {
    public static void main(String[] args) {

        int check = 100;
        int mUp = 1010;
        int bonus = mUp / 100;

        if (mUp >= 1000) {
            bonus = mUp + bonus + check;
        } else {
            bonus = 0;
        }
        System.out.println(bonus + "итог");
    }
}
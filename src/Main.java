public class Main {
    public static void main(String[] args) {

        int check = 100;
        int mUp = 300;
        int bonus = mUp / 100;

        if (bonus < 1000) {
             bonus = (mUp + check) / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus + "итог");
        }


    }
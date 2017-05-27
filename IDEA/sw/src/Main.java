public class Main {

    public static void main(String[] args) {
//        String sw = "Eli";
//
//        switch (sw) {
//            case "bah":
//                System.out.println("This word is bah");
//                break;
//            case "eli":
//                System.out.println("this is eli's name");
//                break;
//            case "Assa":
//                System.out.println("word is assa");
//                break;
//            default:
//                System.out.println("this is a default word");
//                break;
        int a;
        a = 200;
        for (int i = 2; i < a; i++) {
            if (isPrime(i))
                System.out.println(i);

        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}

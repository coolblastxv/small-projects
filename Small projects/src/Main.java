public class Main {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static String test() {
        try {
            return "try";
        } finally {
            return "finally";
        }
    }
}
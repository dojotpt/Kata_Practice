public class EndsLy {
    public static String str = "o";
    public static void main (String[] args) {
        endsLy(str);
    }
    public static boolean endsLy(String str) {
        if(str.length()<2) {
            System.out.println("insufficient string length");
            return false;
        }
        if(str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y') {
                System.out.println("true");
                return true;
        }
        System.out.println(false);
        return false;
    }
}

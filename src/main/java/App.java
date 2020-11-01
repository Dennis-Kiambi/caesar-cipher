import sun.security.krb5.internal.crypto.Aes128;

public class App {
//    private String message;
//  private int rotateBy;

    public static void main(String[] args) {
        char message = 'c';
        String cipher = Caesar.rotate();
        System.out.println(cipher);

    }

}

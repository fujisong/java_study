package common.pass;

public class EncryptionAndDecryption1 {
    public static String  main(String[] args) {
        String str = System.getProperty("password");
        return new StringBuffer(str).reverse().toString();
    }
}

package common.pass;

public class EncryptionByFun {
    public String reverse(String a){
        return new StringBuffer(a).reverse().toString();
    }
    public static void main(String[] args) {
       EncryptionByFun encry= new EncryptionByFun();
       System.out.print(encry.reverse("hello,world"));
    }
}

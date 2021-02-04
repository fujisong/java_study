import java.util.Scanner;
public class ggg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入上次考试成绩");
        int first = scanner.nextInt();
        System.out.println("请输入本次考试成绩");
        int second = scanner.nextInt();
        float up = (second-first)/first*100;
        System.out.printf("本次成绩提高百分比:%.2f%%",up);
    }
}
class Bmi {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("请输入体重（kg）：");
         int first = scanner.nextInt();
         System.out.print("请输入身高（m）：");
         float second = scanner.nextFloat();
         float bmi = (float) first/(second*second);
         System.out.printf("bmi为%.2f",bmi);

    }
}
class Cal{
    public static void main(String[] args){
        int sum=0;
        int m=20;
        int n=100;
        while (m<=n){
            sum+=m;
            m+=1;
        }
        System.out.println(sum);
    }
}

class Arr{
    public static void main(String[] args){
        int ar[]={1,2,3};
        System.out.print(ar);00
    }
}

class Bl{
    public static void main(String[] args){
        int i = 1;
        {
            //错误，同一个作用域范围的包裹下局部变量和局部变量不可以变量名相同
            int i = 0;
    }
}
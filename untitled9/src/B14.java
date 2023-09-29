import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
class B14 {
    Scanner sc =new Scanner(System.in);
    SecureRandom random = new SecureRandom();
    static void in(){
        System.out.println("Введите сколько будет рядов");
    }
    int a = sc.nextInt();
    static void in1(){
        System.out.println("Введите длину");
    }
    int b = sc.nextInt();
    double[][] mas = new double[a][b];

    @Override
    public String toString() {
        return super.toString();
    }
    String v = "";

    void z1(){
        for(int i = 0; i < a; i++){
            for(int i1 = 0; i1 < b; i1++){
                double a = random.nextDouble(4,9);
                String b = a+"";
                for(int i3 = 0; i3 < 4; i3++){
                   v = v + b.charAt(i3);
                }
                double d = Double.parseDouble(v);
                mas[i][i1] = d;
                v = "";
            }

        }
        System.out.println(Arrays.deepToString(mas));
    }
}

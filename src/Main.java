import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] abserv = new int[3];
        abserv[0] = 1;
        abserv[1] = 2;
        abserv[2] = 3;

        double[] caps = {1.57, 7.654, 9.986};
        int [] my = {3, 6 ,92, 34, 54, 4};

//1 dz
        for (int i = 0; i < abserv.length; i++) {
            System.out.print(abserv[i]);
            if ((i + 1) < abserv.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < caps.length; i++) {
            System.out.print(caps[i]);
            if ((i + 1) < caps.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < my.length; i++) {
            System.out.print(my[i]);
            if ((i + 1) < my.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print(abserv[2] + ", " + abserv[1] + ", " + abserv[0]);
        System.out.println();
        System.out.print(caps[2] + ", " + caps[1] + ", " + caps[0]);
        System.out.println();
        for (int i = (my.length-1); i >= 0; i--) {
            System.out.print(my[i]);
            if (i  != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //2 i 3 dz
        for (int i = 0; i < abserv.length; i++) {
            if (abserv[i] % 2 != 0) {
                abserv[i] = abserv[i] + 1;
            }
        }
        System.out.println(Arrays.toString(abserv));
        //4 dz
    }
}
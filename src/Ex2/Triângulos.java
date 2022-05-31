package Ex2;

import java.util.Scanner;

public class Triângulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if (lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado2 + lado1) || lado1 < Math.abs(lado2 - lado3) || lado2 < Math.abs(lado1 - lado3) || lado3 < Math.abs(lado2 - lado1)) {
            System.out.println("Não é triângulo");
            return;
        }

        while (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado2 + lado1) || lado1 > Math.abs(lado2 - lado3) || lado2 > Math.abs(lado1 - lado3) || lado3 > Math.abs(lado2 - lado1)) {
            if(lado1 == lado2 && lado2 == lado3 && lado2 == lado3) {
                System.out.println("Equilátero");
            }
            if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("Escaleno");
            }
            //if()
            break;
        }
        //FALTA ISOCELES


    }
}

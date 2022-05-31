package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelefoneEncriptado {
//    ABC -> 2
//    DEF -> 3
//    GHI -> 4
//    JKL -> 5
//    MNO -> 6
//    PQRS -> 7
//    TUV -> 8
//    WXYZ -> 9

//    Entrada
//    A entrada consiste em uma expressão. Cada expressão possui C
//    caracteres, onde 1 ≤ C ≤ 30.

//    Saída
//    Para cada expressão você deve imprimir o número de telefone
//    correspondente.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos caracteres possui a expressão? ");
        int c = scan.nextInt();
        //List<String> letra = new ArrayList<>();
        String letra;
        int count;
        List<String> saída = new ArrayList<>();
            for (count = 0; count < c; count++) {
                letra = scan.next();
                letra.toUpperCase();
                if (letra.equals("A") || letra.equals("B") || letra.equals("C")) {
                    saída.add(count, "2");
                }
                if (letra.equals("D") || letra.equals("E") || letra.equals("F")) {
                    saída.add(count, "3");
                }
                if (letra.equals("G") || letra.equals("H") || letra.equals("I")) {
                    saída.add(count, "4");
                }
                if (letra.equals("J") || letra.equals("K") || letra.equals("L")) {
                    saída.add(count, "5");
                }
                if (letra.equals("M") || letra.equals("N") || letra.equals("O")) {
                    saída.add(count, "6");
                }
                if (letra.equals("P") || letra.equals("Q") || letra.equals("R") || letra.equals("S")) {
                    saída.add(count, "7");
                }
                if (letra.equals("T") || letra.equals("U") || letra.equals("V")) {
                    saída.add(count, "8");
                }
                if (letra.equals("W") || letra.equals("X") || letra.equals("Y") || letra.equals("Z")) {
                    saída.add(count, "9");
                }
                if (letra.equals("1")) {
                    saída.add(count, "1");
                }
                if (letra.equals("0")) {
                    saída.add(count, "0");
                }
                if (letra.equals("-")) {
                    saída.add(count, "-");
                }
            }
            System.out.println(saída);
        }
    }
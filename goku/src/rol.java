
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAR
 */
public class rol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Usted inicia con 1000 fichas");
        int[] fichas = new int[1];
        fichas[0] = 1000;
        String[][] matriz = new String[3][5];
        String tirar = "k";
        do {
            do {
                System.out.println("Apostar 60 creditos (s/n");
                Scanner leer = new Scanner(System.in);
                tirar = leer.next();
                if (tirar.equals("n")) {
                    System.out.println("Gracias Vuelva pronto");
                    break;
                } else {
                    fichas[0] = fichas[0] - 30;
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < 5; j++) {
                            matriz[i][j] = (String.valueOf((char) ('☻' + Math.random() * 10)));
                        }
                    }
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (matriz[i][0].equals("☻")) {
                                matriz[i][0] = (String.valueOf((char) ('♥')));
                            }
                            if (matriz[i][4].equals("☻")) {
                                matriz[i][4] = (String.valueOf((char) ('♥')));
                            }
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println("");
                    }

                    premioH(matriz, fichas);
                    premiod1(matriz, fichas);
                    premiod2(matriz, fichas);
                    premiod6(matriz, fichas);
                    premiod7(matriz, fichas);
                    premiow(matriz, fichas);
                    premiowi(matriz, fichas);
                    bonus(matriz, fichas);
                    System.out.println("SALDO " + fichas[0]);
                }
            } while (fichas[0] < 30);

        } while (tirar.equals("s"));

    }

    public static void premioH(String matriz[][], int[] cont) {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].equals(matriz[i][1]) || matriz[i][1].equals("☻")) {
                cont[0] = cont[0] + (valores00(matriz) * 2);
                System.out.println("Premio en linea " + (i + 1));
                if (matriz[i][2].equals("☻") || matriz[i][0].equals(matriz[i][2])) {
                    cont[0] = cont[0] + (valores00(matriz) * 8);
                    if (matriz[i][3].equals("☻") || matriz[i][0].equals(matriz[0][3])) {
                        cont[0] = cont[0] + (valores00(matriz) * 10);
                        if (matriz[i][0].equals(matriz[0][4])) {
                            cont[0] = cont[0] + (valores00(matriz) * 15);
                            System.out.println("LINEA COMPLETA");     
                        }
                    }
                }
            }
        }
    }

    public static void premiod6(String matriz[][], int[] cont) {
        if (matriz[0][0].equals(matriz[0][1]) || matriz[0][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);
            System.out.println("Premio en linea 6");
            if (matriz[1][2].equals("☻") || matriz[0][2].equals(matriz[1][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[2][3].equals("☻") || matriz[0][0].equals(matriz[2][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[0][0].equals(matriz[2][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void premiod7(String matriz[][], int[] cont) {
        if (matriz[2][0].equals(matriz[2][1]) || matriz[2][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);
            System.out.println("Premio en linea 7");
            if (matriz[1][2].equals("☻") || matriz[2][0].equals(matriz[1][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[0][3].equals("☻") || matriz[0][0].equals(matriz[0][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[0][0].equals(matriz[0][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void premiod1(String matriz[][], int[] cont) {
        if (matriz[0][0].equals(matriz[1][1]) || matriz[1][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);
            System.out.println("Premio en linea 4");
            if (matriz[2][2].equals("☻") || matriz[0][0].equals(matriz[2][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[1][3].equals("☻") || matriz[0][0].equals(matriz[1][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[0][0].equals(matriz[0][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void premiod2(String matriz[][], int[] cont) {
        if (matriz[2][0].equals(matriz[1][1]) || matriz[1][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);;
            System.out.println("Premio en linea 5");
            if (matriz[0][2].equals("☻") || matriz[0][0].equals(matriz[0][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[1][3].equals("☻") || matriz[0][0].equals(matriz[1][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[0][0].equals(matriz[2][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void premiow(String matriz[][], int[] cont) {
        if (matriz[0][0].equals(matriz[1][1]) || matriz[1][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);
            System.out.println("Premio en linea 8");
            if (matriz[0][2].equals("☻") || matriz[0][0].equals(matriz[0][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[1][3].equals("☻") || matriz[0][0].equals(matriz[1][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[0][0].equals(matriz[0][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void premiowi(String matriz[][], int[] cont) {
        if (matriz[2][0].equals(matriz[1][1]) || matriz[1][1].equals("☻")) {
            cont[0] = cont[0] + (valores00(matriz) * 3);
            System.out.println("Premio en linea 9");
            if (matriz[2][2].equals("☻") || matriz[0][0].equals(matriz[2][2])) {
                cont[0] = cont[0] + (valores00(matriz) * 10);
                if (matriz[1][3].equals("☻") || matriz[0][0].equals(matriz[1][3])) {
                    cont[0] = cont[0] + (valores00(matriz) * 15);
                    if (matriz[2][0].equals(matriz[2][4])) {
                        cont[0] = cont[0] + (valores00(matriz) * 25);
                        System.out.println("LINEA COMPLETA");
                    }
                }
            }
        }
    }

    public static void bonus(String matriz[][], int[] cont) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][0].equals("♥") && matriz[i][4].equals("♥")) {
                    System.out.println("BONUS");
                    cont[0] = cont[0] + 250;
                }
            }
        }
    }

    public static int valores00(String matriz[][]) {
        int n = 0;
        for (int i = 0; i < 3; i++) {

            switch (matriz[i][0]) {

                case "☼":
                    n = 1;

                    break;
                case "♁":
                    n = 1;

                    break;
                case "♂":
                    n = 4;

                    break;
                case "☾":
                    n = 1;

                    break;
                case "☽":
                    n = 2;

                    break;
                case "♃":
                    n = 1;

                    break;
                case "☿":
                    n = 1;

                    break;
                case "☻":
                    n = 0;

                    break;

                case "♄":
                    n = 1;

                    break;

                case "♀":
                    n = 5;

                    break;
            }
        }
        return n;
    }
}

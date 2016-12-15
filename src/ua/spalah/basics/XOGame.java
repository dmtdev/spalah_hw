package ua.spalah.basics;

import java.util.Scanner;

/**
 * Created by dmitry.dev on 14.12.2016.
 */
public class XOGame {


    public static void main(String[] args) {

        XOGameStart();
        DrawDesc(GameDesc);

    }

        private static Scanner scanner = new Scanner(System.in);
        private static int turn=0;
        private static String[][]  GameDesc = {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        private static String FirstPlayer ="";  //x
        private static String SecondPlayer =""; //o

        public static void XOGameStart() {

            System.out.println("First Player name? X");
            FirstPlayer=scanner.nextLine();
            System.out.println("Second Player name? O");
            SecondPlayer=scanner.nextLine();

        }
        public boolean CheckLine(String check)
        {
            return false;
        }
        public static void DrawDesc(String[][] desc)
        {
            for (int i = 0; i <GameDesc.length ; i++) {
                for (int j = 0; j <GameDesc[i].length ; j++) {
                    System.out.print(GameDesc[i][j]);
                }
                System.out.println();

            }
        }



}

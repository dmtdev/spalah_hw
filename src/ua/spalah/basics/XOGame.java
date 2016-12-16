package ua.spalah.basics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dmitry.dev on 14.12.2016.
 */
public class XOGame {

    //private static boolean winner;

    public static void main(String[] args)
        {
            XOGameStart();
        }

        private static Scanner scanner = new Scanner(System.in);
        private static int turn=0;
        private static String FirstPlayer ="";  //x
        private static String SecondPlayer =""; //o
        private static String[][]  GameDesc = {
                    {"-","-","-"},
                    {"-","-","-"},
                    {"-","-","-"}
        };
        //123
        private static String[] lines = new String[8];
        //private static boolean winner = false;
     public static void XOGameStart() {

            System.out.println("First Player name? X");
            FirstPlayer=scanner.nextLine();
            System.out.println("Second Player name? O");
            SecondPlayer=scanner.nextLine();
            DrawDesc(GameDesc);
            do {
                System.out.println("Enter coordinates for "+(turn%2==0?"X":"O")+", 1x2");
                String position = scanner.nextLine();
                if(!CheckRegexp(position,"^[1-3]{1}+x+[1-3]{1}$"))
                {
                    System.out.println("Wrong input, 1x2");
                }
                else
                {
                    String[] coords = position.split("x");
                    int i = Integer.parseInt(coords[0])-1;
                    int j = Integer.parseInt(coords[1])-1;
                    if (GameDesc[i][j].equals("-"))
                    {
                        if (turn%2==0)
                        {
                            GameDesc[i][j] = "X";
                            turn ++;
                        }
                        else
                        {
                            GameDesc[i][j] = "O";
                            turn ++;
                        }
                    }
                    else
                    {
                        System.out.println("Field not empty, another coordinates");
                    }
                    DrawDesc(GameDesc);
                }
            }
            while(!CheckLine(GameDesc) && turn<9);

//            for (String line: lines)
//            {
//                if(line!=null) {
//                    if (line.equals("XXX")) {
//                        System.out.println("Winner: " + FirstPlayer);
//                        winner = true;
//                        break;
//
//                    } else if (line.equals("OOO")) {
//                        System.out.println("Winner: " + SecondPlayer);
//                        winner = true;
//                        break;
//                    }
//                }
//            }
            if(Arrays.asList(lines).contains("XXX"))
            {
                System.out.println("Winner: " + FirstPlayer);
                //winner = true;
            }
            else if(Arrays.asList(lines).contains("OOO"))
            {
                System.out.println("Winner: " + SecondPlayer);
                //winner = true;
            }
            //if(!winner)
            else
            {
                System.out.println("There are no winners in this game...");
            }
        }
        private static boolean CheckLine(String[][] check)
        {
            int clines = 0;
            for (int i=0;i<2;i++)
            {
                lines[clines]=String.join("",new String[]{check[i][0], check[i][1], check[i][2]});
                clines ++;
                lines[clines]=String.join("",new String[]{check[0][i], check[1][i], check[2][i]});
                clines ++;
            }
            lines[6]=String.join("",new String[]{check[0][0], check[1][1], check[2][2]});
            lines[7]=String.join("",new String[]{check[2][0], check[1][1], check[0][2]});
//            for (String line: lines)
//            {
//                if(line != null) {
//
//                    if (line.equals("XXX") || line.equals("OOO")) {
//                        return true;
//                    }
//                }
//            }
            if(Arrays.asList(lines).contains("XXX") || Arrays.asList(lines).contains("OOO"))
            {
                return true;
            }
            return false;
        }

        private static void DrawDesc(String[][] desc)
        {
           for (int i = 0; i <GameDesc.length ; i++) {
                for (int j = 0; j <GameDesc[i].length ; j++) {
                    System.out.print(GameDesc[i][j]+" ");
                }
                System.out.println();
             }
        }
        private static boolean CheckRegexp(String s,String rx)
        {
            Pattern pattern = Pattern.compile(rx);
            Matcher matcher = pattern.matcher(s);
            return matcher.matches();
        }
}

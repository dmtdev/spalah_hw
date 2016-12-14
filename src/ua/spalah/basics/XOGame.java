package ua.spalah.basics;

/**
 * Created by dmitry.dev on 14.12.2016.
 */
public class XOGame {

    private static int turn=0;
    static String[][]  GameDesc = {
            {"o","x","x"},
            {"o","x","x"},
            {"o","x","x"}
    };
    String FirstPlayer ="";  //x
    String SecondPlayer =""; //o

    public static void main(String[] args) {
        DrawDesc(GameDesc);
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

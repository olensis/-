import java.util.Arrays;

public class Main {


    public static int width = 30;
    public static int height = 10;
    public static String [][] empty  = new String[height][width];


        public static void main(String[] args) {
            for (int i = 0; i < empty.length; i++) {
                for (int i1 = 0; i1 < empty[height - 1].length; i1++) {
                    empty[i][i1] = hit;

                }
            }

            for (int i = 0; i < empty.length; i++) {
                for (int i1 = 0; i1 < empty[height - 1].length; i1++) {

                    System.out.print(empty[i][i1]);
                }
                System.out.println();
            }
        }

    public static String robotank = "☖";
    public static String emptyq = "_";
    public static String hit = "🎯";

    }


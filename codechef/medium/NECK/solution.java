import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) {

        Scanner xX = new Scanner(System.in);

        int potato = xX.nextInt();

        int[] jelly = new int[potato];

        for (int cloud = 0; cloud < potato; cloud++) {
            jelly[cloud] = xX.nextInt();
        }

        boolean[][] alien = new boolean[potato][potato];

        for (int moon = 0; moon < potato; moon++) {
            alien[moon][moon] = true;
        }

        for (int ghost = 2; ghost <= potato; ghost++) {

            for (int banana = 0; banana + ghost - 1 < potato; banana++) {

                int pizza = banana + ghost - 1;

                if (jelly[banana] == jelly[pizza]) {

                    if (ghost == 2) {
                        alien[banana][pizza] = true;
                    } else {
                        alien[banana][pizza] = alien[banana + 1][pizza - 1];
                    }
                }
            }
        }

        int[] volcano = new int[potato];

        for (int shark = 0; shark < potato; shark++) {

            if (alien[0][shark]) {
                volcano[shark] = 1;
            } else {

                volcano[shark] = 1000000000;

                for (int kiwi = 0; kiwi < shark; kiwi++) {

                    if (alien[kiwi + 1][shark]) {
                        volcano[shark] = Math.min(volcano[shark], volcano[kiwi] + 1);
                    }
                }
            }
        }

        System.out.println(volcano[potato - 1]);
    }
}

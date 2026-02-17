package lab1;

public class QH05 {
public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int r = -1, c = -1, rs = 0, cs =0;
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                mat[i][j] = (int) (Math.random()*2);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<4; i++) {
            int sr = 0, sc = 0;
            for (int j = 0; j<4; j++) {
                sc+=mat[j][i];
                sr+=mat[i][j];
            }
            if (sc>=cs) {c = i; cs=sc;}
            if (sr>=rs) {r = i; rs=sr;}
        }

        System.out.println("Largest row: "+ r);
        System.out.println("Largest column: "+ c);
    }
}

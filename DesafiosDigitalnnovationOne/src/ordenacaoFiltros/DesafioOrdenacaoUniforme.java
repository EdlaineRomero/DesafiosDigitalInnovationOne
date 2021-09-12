package ordenacaoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class DesafioOrdenacaoUniforme {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String owner, l, color, size;
        Tshirt[] tshirts;
        Tshirt tshirt = null;
        int N;

        while (!(l = read()).equals("0")) {
        N = toInt(l);
        tshirts = new Tshirt[9];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(read());
                tshirt = new Tshirt(st.nextToken(),read(),st.nextToken());
                tshirts[i] = tshirt;;
            }
         Arrays.sort(tshirts, new Comparator<Tshirt>() {
            public int compare(Tshirt t1, Tshirt t2) {
                String color1 = t1.getColor();
                String color2 = t2.getColor();
                int diffCor = color1.compareTo(color2);
                if (diffCor != 0) {
                    return diffCor;
                }else{
                    String tam1 = t1.getSize();
                    String tam2 = t2.getSize();
                    int diffTam = tam1.compareTo(tam2);
                    if(diffTam == 0) {
                        String nome1 = t1.getOwner();
                        String nome2 = t2.getOwner();
                        int diffNome = nome1.compareTo(nome2);
                        if (diffNome < 0) {
                            return -1;
                        }else{
                            return 1;
                        }
                    }else if(diffTam < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });

        for (Tshirt uniforme : tshirts) {
            System.out.println(uniforme);
        }

        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
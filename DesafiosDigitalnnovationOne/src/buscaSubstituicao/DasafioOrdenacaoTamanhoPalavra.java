package buscaSubstituicao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DasafioOrdenacaoTamanhoPalavra {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int casoTeste = Integer.parseInt(in.readLine());
        for(int i=0;i<casoTeste;i++){
            String novaLinha = "";
            String[] palavras = in.readLine().split(" ");
            Arrays.sort(palavras, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length()== o2.length()){
                        int diff = o1.compareTo(o2);
                        if(diff== 0){
                            return 0;
                        }else if(diff>0){
                            return 1;
                        }else{
                            return -1;
                        }
                    }else if(o1.length()< o2.length()){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            });
            for (String palavra : palavras) {
                novaLinha = novaLinha.concat(palavra + " ");
            }
            System.out.println(novaLinha);
        }

    }
}
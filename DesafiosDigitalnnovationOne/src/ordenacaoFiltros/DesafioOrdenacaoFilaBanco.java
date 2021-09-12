package ordenacaoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DesafioOrdenacaoFilaBanco {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int casoTeste = Integer.parseInt(in.readLine());
        for(int i=0;i<casoTeste;i++){
            int qtSenhas = Integer.parseInt(in.readLine());
            int count = 0;
            String[] senhas =in.readLine().split(" ");
            Integer[] senhasOrdenadas = new Integer[qtSenhas];
            for(int j =0;j<qtSenhas;j++){
                senhasOrdenadas[j]=Integer.parseInt(senhas[j]);
            }
            Arrays.sort(senhasOrdenadas,Collections.reverseOrder());
            for(int k =0;k<qtSenhas;k++){
                if(senhasOrdenadas[k]==Integer.parseInt(senhas[k])){
                    count +=+1;
                }
            }

            System.out.println(count);

        }
    }
}
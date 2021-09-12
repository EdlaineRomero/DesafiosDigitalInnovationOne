package ordenacaoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class DesafioOrdenacaoListaCompras {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int qtdLista = Integer.parseInt(br.readLine());

            for (int i = 0; i < qtdLista; i++) {
                String novaLinha = "";
                String lista[] = br.readLine().split(" ");
                lista = new HashSet<String>(Arrays.asList(lista))
                        .toArray(new String[0]);
                Arrays.sort(lista);
                for (String str : lista) {
                    novaLinha = novaLinha.concat(str + " ");
                }
                System.out.println(novaLinha);
            }

        }
}

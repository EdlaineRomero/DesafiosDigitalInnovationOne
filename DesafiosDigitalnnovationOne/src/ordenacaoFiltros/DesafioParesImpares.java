package ordenacaoFiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesafioParesImpares {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int tamanho = Integer.parseInt(br.readLine());

                List<Integer> list = new ArrayList<Integer>();

            for(int i =0;i<tamanho;i++){

                int valor = Integer.parseInt(br.readLine());
                list.add(valor);
            }

            list.stream()
                    .filter(numero -> numero % 2 == 0)
                    .sorted()
                    .forEach(numero -> System.out.println(numero));

            list.stream()
                    .filter(numero -> numero % 2 != 0)
                    .sorted(Collections.reverseOrder())
                    .forEach(numero -> System.out.println(numero));

        }

    }
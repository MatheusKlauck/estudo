package estudo.recursao;

public class subsequencias {
    static String displayArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1)
                sb.append(",");
        }

        sb.append("]");

        // System.out.println(sb.toString());
        return sb.toString();
    }

    static int[] NovoRamo(int[] arrBase, int[] arrAtual, int indiceAtual) {
        System.out.print("            Gerou novo ramo");
        int[] nwSubs = new int[arrAtual.length + 1];
        // copia os valores da subsequencia atual
        for (int i = 0; i < arrAtual.length; i++) {
            nwSubs[i] = arrAtual[i];
        }
        nwSubs[nwSubs.length - 1] = arrBase[indiceAtual]; // Adicionou o valor do arraybase na nova posicao criada
        System.out.println("  n.r add(" + arrBase[indiceAtual] + ")");
        return nwSubs;
    }

    static void GerarSequencia(int[] arrBase, int indiceAtual, int[] ramoAtual) {
        if (indiceAtual >= arrBase.length) {
            // Ao percorrer todo o array base, exibe a subsequencia gerada
            System.out.println("=>subs:" + displayArr(ramoAtual));
            return;
        } else {
            System.out.println("        trabalhando no ramo:" + displayArr(ramoAtual));
        }

        // gera "ramo" que usará o valor do array base na posição "indiceAtual"
        int[] novoRamo = NovoRamo(arrBase, ramoAtual, indiceAtual);
        GerarSequencia(arrBase, indiceAtual + 1, novoRamo); // Explora o novo ramo, que inclui o elemento mais recente
        GerarSequencia(arrBase, indiceAtual + 1, ramoAtual);// Explora o ramo sem o elemento mais recente
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

        GerarSequencia(arr, 0, new int[0]);
    }
}

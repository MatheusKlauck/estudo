package estudo.recursao;

public class subsequencias_crescentes {

    private static int[] ramificar(int[] arr, int[] arrAtual, int indiceAtual) {
        int[] newRamif = new int[arrAtual.length + 1];

        for (int i = 0; i < arrAtual.length; i++) {
            newRamif[i] = arrAtual[i];
        }

        newRamif[newRamif.length - 1] = arr[indiceAtual];

        System.out.println("        Nova ramif." + estudo.recursao.subsequencias.displayArr(newRamif));
        return newRamif;
    }

    private static void GerarNovaSubsequencia(int[] arr, int indiceAtual, int[] arrAtual) {
        // caso base: percorri todo o array base
        if (indiceAtual == arr.length) {
            System.out.println("=>Subs:" + estudo.recursao.subsequencias.displayArr(arrAtual));
            return;
        }

        // Gerando uma nova rmificacao do array

        // Gerando novas subsequencias a partir da nova ramificacao
        if (arrAtual.length == 0 || arr[indiceAtual] > arrAtual[arrAtual.length - 1]) {
            int[] nwRam = ramificar(arr, arrAtual, indiceAtual);
            GerarNovaSubsequencia(arr, indiceAtual + 1, nwRam);
        }
        // Gerando nova subsequencia a partir do array atual
        GerarNovaSubsequencia(arr, indiceAtual + 1, arrAtual);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 10, 33, 4, 32, 34 };

        GerarNovaSubsequencia(arr, 0, new int[0]);
    }
}

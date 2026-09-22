package estudo.recursao;

// Preencher toda a area informada com cubos geometricos; em formato de L (2 empilhados, 1 ao lado, 1 vazio), ou simples, 1 cubo simples (1 tile preenchido e 3 vazios)
public class cubos {

    // calcular o tamanho da area a ser preenchida
    // calcular a area que cada cubo preenche

    private static boolean preencher(int area, int areaVazia) {
        System.out.println("Area total: " + area + " restante: " + areaVazia);

        if (areaVazia == 0) {
            System.out.println("Area totalmente preenchida");
            return true;
        }

        double countL = areaVazia / 3;
        if (countL > 0.0) {
            System.out.println("Preencheu com L");
            if (preencher(area, areaVazia - 3)) {
                // Se preencheu toda a area, propaga a informacao para cima da cadeia da
                // recursao
                return true;
            }
        }

        System.out.println("Preencheu com 1 simples");
        if (preencher(area, areaVazia - 1)) {
            // Preencheu toda a area nessa tentativa, propaga a info p/ o restante da cadeia
            // de recursao
            return true;
        }

        return false; // Nao preencheu toda a area, entao retenta
    }

    public static void main(String[] args) {
        preencher(2 * 4, 2 * 4);
    }
}

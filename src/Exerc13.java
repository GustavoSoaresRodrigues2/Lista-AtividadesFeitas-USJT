import javax.swing.JOptionPane;

public class Exerc13 {
    
    public static void verifPregos() {
        int numPregos = 10;
        int[][] vetor = new int[numPregos][2];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i][0] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o comprimento do prego Nº" + (i + 1) + " em milímetros.")
            );
            vetor[i][1] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o diâmetro do prego Nº" + (i + 1) + "  em milímetros.")
            );
        }

        int somaCompri = 0;
        int somaDiame = 0;
        int maiorComprimento = vetor[0][0]; // Inicializa com o comprimento do primeiro prego
        int maiorDiametro = vetor[0][1];    // Inicializa com o diâmetro do primeiro prego

        for (int j = 0; j < vetor.length; j++) {
            somaCompri += vetor[j][0];
            somaDiame += vetor[j][1];

            // Verifica se o comprimento atual é maior que o maiorComprimento
            if (vetor[j][0] > maiorComprimento) {
                maiorComprimento = vetor[j][0];
            }

            // Verifica se o diâmetro atual é maior que o maiorDiametro
            if (vetor[j][1] > maiorDiametro) {
                maiorDiametro = vetor[j][1];
            }
        }

        double mediaCompri = somaCompri / numPregos;
        double mediaDiame = somaDiame / numPregos;

        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do comprimento é: " + mediaCompri, 
            "Média da soma do comprimento.", 
            1
        );
        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do diâmetro é: " + mediaDiame, 
            "Média da soma do diâmetro.", 
            1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior comprimento é: " + maiorComprimento,
                "Maior comprimento.",
                1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior diâmetro é: " + maiorDiametro,
                "Maior diâmetro.",
                1
        );
    }

    public static void main(String[] args) {
        verifPregos();
    }
}

import javax.swing.JOptionPane;

public class Exerc14 {
    
    public static void jogoVetor() {
        String opcao;

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 12;
        }

        do {
            opcao = JOptionPane.showInputDialog(
                    "( + ) : Para ir no próximo elemento. \n" +
                    "( - ) : Para ir no elemento anterior. \n" + 
                    "( . ) : Para sair. \n" +
                    "\n" +
                    "Elemento do Vetor: " + vetor[cont]
            );

            switch (opcao) {
                case "+":
                    if (cont == 9) {
                        cont = 0;
                    } else {
                        cont++;
                    }
                    break;
                case "-":
                    if (cont == 0) {
                        cont = 9;
                    } else {
                        cont--;
                    }
                    break;
            }
        } while (!opcao.equals("."));
    }
    
    public static void main(String[] args) {
        jogoVetor();
    }
}

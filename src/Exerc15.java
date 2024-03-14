import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exerc15 {
    int palpite;

    public Exerc15(int palpite) {
        this.palpite = palpite;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }
    
    public static void joguinho() {
        List<Exerc15> lista = new ArrayList<>();

        String opcao;
        int numeroBonus = 54;

        do {
            opcao = JOptionPane.showInputDialog(
                    "( A ) : Inserir número secreto. \n" +
                    "( B ) : Jogar. \n" + 
                    "( C ) : Apresentar resultados. \n" +
                    "( D ) : Sair."
            );

            switch (opcao) {
                case "A":{
                    int numSecret;
                    numSecret = Integer.parseInt(
                        JOptionPane.showInputDialog("Insira o número secreto.")
                    );

                    if (numSecret == numeroBonus) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você acertou o número secreto !!!", 
                            "Acertou !!!", 
                            1
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você Errou o número secreto !!!", 
                            "Errou !!!", 
                            1
                        );
                    }
                }
                    break;
                case "B":{
                    int palpite;
                    palpite = Integer.parseInt(
                        JOptionPane.showInputDialog("Qual o número secreto?")
                    );

                    var fazerLista = new Exerc15(palpite);
                    lista.add(fazerLista);

                    if (palpite == numeroBonus) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "O número que você escreveu parece falimiar.", 
                            "Interessante.", 
                            1
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você Errou o número secreto !!!", 
                            "Errou !!!", 
                            1
                        );
                    }
                }
                    break;
                case "C":{
                    StringBuilder sb = new StringBuilder();

                    for (Exerc15 palpite : lista) {
                        sb.append(palpite.getPalpite());
                        sb.append("\n");
                    }

                    JOptionPane.showMessageDialog(
                            null, 
                            sb.toString(), 
                            "Lista de palpites", 
                            1
                    );
                }
                    break;
            }

        } while (!opcao.equals("D"));
    }

    public static void main(String[] args) {
        joguinho();
    }
}

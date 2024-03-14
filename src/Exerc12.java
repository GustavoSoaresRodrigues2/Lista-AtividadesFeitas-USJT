import javax.swing.JOptionPane;

public class Exerc12 {
    
    public static boolean ehPrimo() {
        int numero;
        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero maior que zero.")
        );
        
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (ehPrimo()) {
            JOptionPane.showMessageDialog(
                null, 
                "O número é primo", 
                "Primo",
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "O número não é primo", 
                "Não é primo",
                0
            );
        }
    }
}

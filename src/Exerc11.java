import javax.swing.JOptionPane;

public class Exerc11 {

    public static void resolveEquacao() {
        int A, B, C;
        double delta, X_P, X_N;

        A = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de A: ")
        );
        B = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de B: ")
        );
        C = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de C: ")
        );

        delta = (B * B) - 4 * A * C;
        System.out.println("Delta: " + delta);
        
        X_P = (-B + Math.sqrt(delta)) / 2 * A;
        X_N = (-B - Math.sqrt(delta)) / 2 * A;
        System.out.println("X¹: " + X_N + ", e X²: " + X_P);

        if (delta == 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e iguais." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ = 0", 
                1
            );
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são imaginárias.", 
                "Δ < 0", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e diferentes." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ > 0", 
                1
            );
        }
    }

    public static void main(String[] args) throws Exception {
        resolveEquacao();
    }
}

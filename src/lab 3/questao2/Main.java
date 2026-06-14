package questao2;

public class Main {
    public static void main(String[] args) { // [cite: 34]
        CalculadoraBinariaExistente binaria = new CalculadoraBinariaExistente();
        Calculadora calculadoraDecimal = new CalculadoraAdapter(binaria);

        System.out.println("soma decimal (10 + 5): " + calculadoraDecimal.somar(10, 5));
        System.out.println("subtração decimal (10 - 5): " + calculadoraDecimal.subtrair(10, 5));
        System.out.println("multiplicação decimal (10 * 5): " + calculadoraDecimal.multiplicar(10, 5));
    }
}
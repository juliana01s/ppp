package questao2;

public class CalculadoraAdapter implements Calculadora {
    private CalculadoraBinariaExistente calcBinaria;

    public CalculadoraAdapter(CalculadoraBinariaExistente calcBinaria) {
        this.calcBinaria = calcBinaria;
    }

    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calcBinaria.somar(binA, binB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBinario = calcBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
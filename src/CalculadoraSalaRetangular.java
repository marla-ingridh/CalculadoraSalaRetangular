public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double largura, double altura) {
        double valorArea;
        valorArea = largura * altura;
        return valorArea;
    }

    @Override
    public double calcularPerimetro(double largura, double altura) {
        double valorPerimetro;
        valorPerimetro = 2 * (largura + altura );
        return valorPerimetro;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcular Dimensões de uma Sala Retangular!");

        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
        System.out.println("Area da sala: "+ sala1.calcularArea(7,8));
        System.out.println("Perímetro da Sala: " + sala1.calcularPerimetro(7,8) );

    }
}
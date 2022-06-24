import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = " );
        int y = scanner.nextInt();
        BaseFigura baseFigura = new BaseFigura(x, y);
        TringleFigera tringleFigera = new TringleFigera(x, y);
        CircleFigura circleFigura = new CircleFigura(x, y);

        System.out.println(baseFigura.area());
        System.out.println(tringleFigera.area());
        System.out.println(circleFigura.area());
    }

}
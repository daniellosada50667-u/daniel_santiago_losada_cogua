public class App {
    // Método, no espera retorno:
    public static void Saludo() {
        System.out.println("Hola desde un método");
    }

    // Función, si espera retorno
    public static String FuncionSaludo() {
        String saludo_bienvenida = "Hola desde una función";
        return saludo_bienvenida;
    }

    public static int NumeroFecha() {
        int fecha_hoy = 29;
        return fecha_hoy;
    }

    public static double ValorPi() {
        return 3.1416;
    }

    public static void MostrarValorPi() {
        System.out.println(ValorPi());
    }

    public static void CalcularAreaCirculo() {
        double radio = 10.0;
        double formula_area = Math.pow(radio, 2) * ValorPi();
        System.out.println(formula_area);
    }

    public static void main(String[] args) throws Exception {
        Saludo();
        MostrarValorPi();
        CalcularAreaCirculo();
        // FuncionSaludo();
        System.out.println(FuncionSaludo());
        System.out.println(NumeroFecha());
    }
}

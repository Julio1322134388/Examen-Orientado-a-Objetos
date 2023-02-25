public class Figura {
    private int base;
    private int altura;
    private final double PI = 3.1416;
    private double radio;
    private int lado;
    private final String UNIDAD = "cm";
    private String nombre;
    private double areaCirculo;
    private double perimetroCirculo;
    private double areaTriangulo;
    private double perimetroTriangulo;
    private double radioCuadrado;
    private String tipoTriangulo;
    private double hipotensaTriangulo;
    private double areaCuadrado;
    private double perimetroCuadrado;
    private double areaRectangulo;
    private double perimetroRectangulo;


    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.nombre = "Triangulo";


    }

    public Figura(double radio) {
        this.radio = radio;
        this.nombre = "Circulo";
    }

    public Figura( int lado){
        this.lado = lado;
        this.nombre = "Cuadrado";
    }

    public Figura(double areaRectangulo, double perimetroRectangulo){
        this.altura = altura;
        this.base = base;
        this.nombre = "Rectangulo";
    }

    public double areaCirculo(int n){
        double resultado  =0;
        this.radio = n;
        radioCuadrado = radio * radio;
        this.areaCirculo = radioCuadrado * PI;


        return resultado;

    }

    public double perimetroCirculo(int n){
        double resultado  =0;
        this.radio = n;
        this.perimetroCirculo = 2* PI * radio;


        return resultado;

    }

    public void areaTriangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        areaTriangulo = base * altura;
        areaTriangulo = areaTriangulo / 2;



    }

    public void perimetroTriangulo(int base, int altura, int laltura){
        if(base == altura && altura == laltura){
            this.tipoTriangulo = "Equilatero";
            this.perimetroTriangulo = 3 * altura;
        }else if(base != altura && altura == laltura){
            this.tipoTriangulo = "Isoceles";
            this.perimetroTriangulo = 2 * altura + base;
        }else{
            this.tipoTriangulo = "Escaleno";
            this.perimetroTriangulo = base + altura + laltura;
        }


    }

    public void hipotenusaTriangulo(double a, int b){
        this.nombre = "Hipotenusa";
        double potencias = Math.pow(a, 2) + Math.pow(b, 2);
        this.hipotensaTriangulo = Math.sqrt(potencias);
    }

    public void areaCuadrado(double lado){
        this.areaCuadrado = Math.pow(lado, 2);

    }

    public void perimetroCuadrado(double lado){
        this.perimetroCuadrado = 4 * lado;

    }

    public void areaRectangulo(double b, double a){
        this.areaRectangulo = b * a;
    }

    public void perimetroRectangulo(double a, double b){
        this.perimetroRectangulo = 2*a + 2*b;

    }



    @Override
    public String toString() {
        if(this.nombre.equalsIgnoreCase("Circulo")){
            return "Figura: " + nombre +  "\n Radio: " + radio +  "\n Radio al Cuadrado: "  + radioCuadrado + "\n Area: " +  areaCirculo + " \n Perimetro: " + perimetroCirculo;
        }else if(this.nombre.equalsIgnoreCase("Triangulo")){
            return "Figura: \n" + nombre + " Tipo de Triangulo: " + tipoTriangulo + " \n Perimetro:" + perimetroTriangulo;
        }else if(this.nombre.equalsIgnoreCase("Hipotenusa")){
            return "Figura: \n" + nombre +  " \n Hipotenusa:" + hipotensaTriangulo;
        }else if(this.nombre.equalsIgnoreCase("Circulo")){
            return "Figura: \n" + nombre +  " \n Area:" +areaCuadrado + " \n Perimetro: " +  perimetroCuadrado ;
        }else if(this.nombre.equalsIgnoreCase("Rectangulo")){
            return "Figura: \n" + nombre +  " \n Area:" +areaRectangulo + " \n Perimetro: " +  perimetroRectangulo ;
        }
        return "";
    }

}

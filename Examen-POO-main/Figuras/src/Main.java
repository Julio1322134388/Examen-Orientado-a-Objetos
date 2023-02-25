import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Bienvenido---------------------");
        int opc;
        do{
            System.out.println("------------------Ingrese que figura quiere calcular--------------------------");
            System.out.println("[1] Triangulo");
            System.out.println("[2] Rectangulo");
            System.out.println("[3] Circulo");
            System.out.println("[4] Cuadrado");
            System.out.println("[5] Hipotenusa");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("-------------------Triangulo------------------------------------");
                    System.out.println("Ingresa la base");
                    int base = sc.nextInt();
                    System.out.println("Ingresa el segundo lado");
                    int altura = sc.nextInt();
                    System.out.println("Ingresa el segundo lado");
                    int laltura  = sc.nextInt();
                    Figura f2 = new Figura(base, altura);

                    f2.areaTriangulo(base,altura );
                    f2.perimetroTriangulo(base, altura, laltura);

                    System.out.println(f2);
                    break;
                case 2:
                    System.out.println("-------------------Rectangulo------------------------------------");
                    System.out.println("Ingresa la base");
                    double rbase = sc.nextInt();
                    System.out.println("Ingresa la altura");
                    double raltura = sc.nextInt();
                    Figura f3 = new Figura(rbase, raltura);
                    f3.perimetroRectangulo(raltura,rbase);
                    f3.areaRectangulo(rbase,raltura);
                    System.out.println(f3);
                    break;
                case 3:
                    System.out.println("-------------------------Circulo----------------------------");
                    Figura f1 = new Figura(15.5);

                    System.out.println("Ingresa tu radio");
                    int radio  = sc.nextInt();
                    f1.areaCirculo(radio);
                    f1.perimetroCirculo(radio);
                    System.out.println(f1);
                    break;
                case 4:
                    System.out.println("-------------------------Cuadrado----------------------------");
                    System.out.println("Ingresa el primer lado");
                    int n = sc.nextInt();
                    Figura f4 = new Figura(n);
                    f4.perimetroCuadrado(n);
                    f4.areaCuadrado(n);
                    System.out.println(f4);
                    break;
                case 5:
                    Figura f5 = new Figura(15, 10);
                    System.out.println("Ingresa el primer lado");
                    int a = sc.nextInt();
                    System.out.println("Ingresa el segundo lado");
                    int b = sc.nextInt();

                    f5.hipotenusaTriangulo(a, b);

                    System.out.println(f5);
                    break;
                case 6:
                    System.out.println("Adios");
                    System.exit(0);
                break;
                default:
                    System.out.println("Opcion no valida");
                break;

            }

        }while(opc != 6);
    }
}
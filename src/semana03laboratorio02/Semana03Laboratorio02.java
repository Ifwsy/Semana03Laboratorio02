package semana03laboratorio02;
import java.util.Scanner;
public class Semana03Laboratorio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int op, minuto, cliP,cliN;
        String nom;
        Plan p = new Plan("Plan preferencial");
        Plan n = new Plan("Plan normal");
        Calcule c = new Calcule();
        op = 0;
        cliP = 0;
        cliN = 0;
        do{
            System.out.println("Bienvenido a nuestra compañia de telecomunicaciones");
            System.out.println("***Plan preferencial / Plan normal***");
            System.out.println("Ingrese el tipo de plan que tiene: ");
            nom = leer.nextLine();
            if("Plan preferencial".equals(nom)){
                System.out.println("Usted eligio el plan preferencial");
                p.setNombre(nom);
                p.setCosto_mantencion(15000);
                p.setValor_minuto(80);
                cliP += 1;
                p.setCantidad_cliente(cliP);
                System.out.println("Ingrese los minutos que utiliza: ");
                minuto = leer.nextInt();
                while(minuto <= 0){
                    System.out.println("Ingrese los minutos que utiliza: ");
                    minuto = leer.nextInt();
                }
                System.out.println("El monto total a pagar es "+c.Calculo(p, minuto)+" pesos");
                System.out.println("La cantidad de clientes hasta el momento es de "+cliP);
                //System.out.println("La cantidad de clientes hasta el momento es de "+c.Contador(p));
                System.out.println("Desea continuar presione 0");
                op = leer.nextInt();
            }else if ("Plan normal".equals(nom)){
                System.out.println("Usted eligio el plan normal");
                n.setNombre(nom);
                n.setCosto_mantencion(7000);
                n.setValor_minuto(120);
                cliN += 1;
                n.setCantidad_cliente(cliN);
                System.out.println("Ingrese los minutos que utiliza: ");
                minuto = leer.nextInt();
                while(minuto <= 0){
                    System.out.println("Ingrese los minutos que utiliza: ");
                    minuto = leer.nextInt();
                }
                System.out.println("El monto total a pagar es "+c.Calculo(n, minuto)+" pesos");
                System.out.println("La cantidad de clientes hasta el momento es de "+cliN);
                //System.out.println("La cantidad de clientes hasta el momento es de "+c.Contador(n));
                System.out.println("Desea continuar presione 0");
                op = leer.nextInt();
            }
            //System.out.println("Desea continuar presione 0");
            //op = leer.nextInt();
        }while(op == 0);
    }
}

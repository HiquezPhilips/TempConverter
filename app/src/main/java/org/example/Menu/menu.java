package org.example.Menu;

import java.util.Scanner;

import org.example.Conversao.conversorFahrenheit;
import org.example.Conversao.conversorCelsius;

public class menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        conversorFahrenheit fahrenheit = new conversorFahrenheit();
        conversorCelsius celsius = new conversorCelsius();
        String continuar = "Sim";

        while (continuar.equalsIgnoreCase("Sim")) {

            System.out.println("Informe se a conversão deve ser feita para Celsius ou Fahrenheit");

            String escolha = sc.next();

            if (escolha.equalsIgnoreCase("Celsius")) {
                System.out.println("Informe a temperatura em Fahrenheit");
                float temperatura = sc.nextFloat();

                String result = fahrenheit.conversao(temperatura);

                System.out.println(result);
            } else if (escolha.equalsIgnoreCase("Fahrenheit")) {
                System.out.println("Informe a temperatura em Celsius");
                float temperatura = sc.nextFloat();

                String result = celsius.conversao(temperatura);

                System.out.println(result);
            }

            System.out.println("Deseja continuar?");
            continuar = sc.next();
        }
    }
}

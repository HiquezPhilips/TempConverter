package org.example.Conversao;

public class conversorCelsius {

    public String conversao(float temperatura) {

        double fahrenheit = (temperatura * 9 / 5) + 32;
        String result = String.format("Conversão para Fahrenheit: %.2f", fahrenheit);
        return result;
    }

}

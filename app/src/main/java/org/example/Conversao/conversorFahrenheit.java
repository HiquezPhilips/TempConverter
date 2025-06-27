package org.example.Conversao;

public class conversorFahrenheit {

    public String conversao(float temperatura) {

        double celsius = (temperatura - 32) * 5 / 9;
        String result = String.format("hahahahahaha Conversão para Celsius: %.2f", celsius);
        return result;
    }
}

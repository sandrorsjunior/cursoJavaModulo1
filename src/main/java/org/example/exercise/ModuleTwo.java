package org.example.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ModuleTwo {
    public float FuelCharge(float money, float price){
        final int DEFAULT_SCALE = 3;
        float result;

        try {
            result = BigDecimal.valueOf(money)
                    .divide(
                            BigDecimal.valueOf(price),
                            DEFAULT_SCALE,
                            RoundingMode.HALF_UP
                    ).floatValue();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public float heavyInMart(float terra_mass){
        final float MART_GRAVITY = 0.3812436289F;
        return terra_mass * MART_GRAVITY;
    }

    public float OrderTotal(int p, int m, int g){
        final float PRICE_SIZE_P = 10;
        final float PRICE_SIZE_M = 12;
        final float PRICE_SIZE_G = 15;

        return (PRICE_SIZE_P * p) + (PRICE_SIZE_M * m) + (PRICE_SIZE_G * g);
    }

    public double moneySaved(int moedas1euro, int moedas2euros,
                              int moedas50cent, int moedas20cent,
                              int moedas10cent, int moedas5cent
                            )
    {

        double total = 0;
        total += moedas1euro * 1.0;
        total += moedas2euros * 2.0;

        total += moedas50cent * 0.50;
        total += moedas20cent * 0.20;
        total += moedas10cent * 0.10;
        total += moedas5cent * 0.05;

        return total;
    }

    public double litersPurchased(int canP, int canM, int canG) {

        double totalLitros = 0;

        totalLitros += canP * 0.350;
        totalLitros += canM * 0.600;
        totalLitros += canG * 2.0;

        return totalLitros;
    }
}

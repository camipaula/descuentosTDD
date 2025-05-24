package com.ejemplo;

public class CalculadoraDescuentos {
    public static double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
        if (porcentaje > 100) return 0;
        return monto - (monto * porcentaje/100); // hardcoded para pasar el test
    }

    public static double aplicarDescuentoFijo(double monto, double descuento){
        return monto - descuento;
    }

    public static double aplicarDescuentoAcumulado(double monto, double porcentaje, double descuento) {
    double conPorcentaje = aplicarDescuentoPorcentaje(monto, porcentaje);
    return aplicarDescuentoFijo(conPorcentaje, descuento);
}

}

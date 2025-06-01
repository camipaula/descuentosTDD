package com.ejemplo;

/**
 * Clase que proporciona métodos para aplicar distintos tipos de descuentos.
 */
public class CalculadoraDescuentos {

  /**
   * Aplica un descuento porcentual al monto dado.
   *
   * @param monto      el monto original
   * @param porcentaje el porcentaje de descuento
   * @return el monto con descuento aplicado; 0 si el porcentaje es mayor a 100
   */
  public static double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
    if (porcentaje > 100) {
      return 0;
    }
    return monto - (monto * porcentaje / 100);
  }

  /**
   * Aplica un descuento fijo al monto dado.
   *
   * @param monto     el monto original
   * @param descuento el valor del descuento fijo
   * @return el monto con descuento aplicado
   */
  public static double aplicarDescuentoFijo(double monto, double descuento) {
    return monto - descuento;
  }

  /**
   * Aplica un descuento porcentual y luego un descuento fijo.
   *
   * @param monto      el monto original
   * @param porcentaje el porcentaje de descuento
   * @param descuento  el valor del descuento fijo
   * @return el monto con ambos descuentos aplicados
   */
  public static double aplicarDescuentoAcumulado(
      double monto, double porcentaje, double descuento) {
    double conPorcentaje = aplicarDescuentoPorcentaje(monto, porcentaje);
    return aplicarDescuentoFijo(conPorcentaje, descuento);
  }
}

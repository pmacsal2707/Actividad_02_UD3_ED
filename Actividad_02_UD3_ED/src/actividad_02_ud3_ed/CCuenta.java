/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * Clase que representa una cuenta
 * @author pmacsal2707
 * @version 1.0
 */
public class CCuenta {  


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * Constructor de la clase CCuenta
    * @param nom Nombre del titular de la cuenta
    * @param cue
    * @param sal
    * @param tipo 
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Asigna un nombre a la variable nombre
   * @param nom 
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * Devuelve el nombre
    * @return 
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return 
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * Controla que la cantidad a  ingresar sea positiva
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Controla que la cantidad que se desea retirar sea positiva y que esté en la cuenta
    * @param cantidad
    * @throws Exception 
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * Devuelve 
     * @return 
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Modifica la cuenta
   * @param cuenta 
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

/**
 * Modifica  el saldo
 * @param saldo 
 */  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Devuelve el tipo de interes
  * @return 
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Modifica el tipo de interés
   * @param tipoInterés 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}

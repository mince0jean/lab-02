
package com.mycompany.laboratorio2;


public class Plan {
    private String tipo_plan;
    private int costo_mantencion;
    private int costo_minuto;
    private int cantidad_plan;
    
  

    public Plan(String tipo_plan, int costo_mantencion, int costo_minuto) {
        this.tipo_plan = tipo_plan;
        this.costo_mantencion = costo_mantencion;
        this.costo_minuto = costo_minuto;

    
    }

    public String getTipo_plan() {
        return tipo_plan;
    }

    public void setTipo_plan(String tipo_plan) {
        this.tipo_plan = tipo_plan;
    }

    public int getCosto_mantencion() {
        return costo_mantencion;
    }

    public void setCosto_mantencion(int costo_mantencion) {
        this.costo_mantencion = costo_mantencion;
    }

    public int getCosto_minuto() {
        return costo_minuto;
    }

    public void setCosto_minuto(int costo_minuto) {
        this.costo_minuto = costo_minuto;
    }

    public int getCantidad_plan() {
        return cantidad_plan;
    }

    public void setCantidad_plan(int cantidad_plan) {
        this.cantidad_plan = cantidad_plan;
    }
    
    public void cantidad_plan(){
        System.out.println("La cantidad de personas del plan "+ tipo_plan+ " es de: "+ cantidad_plan);

    }
    
}

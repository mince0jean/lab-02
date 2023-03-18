
package com.mycompany.laboratorio2;


public class Cliente {
    private String nombre;
    private Plan plan;
    private int min_conexion;
    private int total;

    public Cliente(String nombre,Plan plan ,int min_conexion) {
        this.nombre = nombre;
        this.plan = plan;
        this.min_conexion = min_conexion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getMin_conexion() {
        return min_conexion;
    }

    public void setMin_conexion(int min_conexion) {
        this.min_conexion = min_conexion;
    }

    
    public void pagar_total(int Costo_M,int Costo_min){
        total= Costo_M +Costo_min*min_conexion;
        System.out.println(nombre +" el total a pagar es de: "+ total);
       }
    }
   
    
    
   
package org.example;

public class dobleNodo {

    public int dato;
    public dobleNodo siguiente;
    public dobleNodo anterior;


//constructor para cuando ya hay nodos
public dobleNodo(int elemento, dobleNodo si, dobleNodo an){
    dato=elemento;
    siguiente=si;
    anterior=an;
}
//constructor cuando no hay datos
    public dobleNodo(int elemento){

        this(elemento, null, null);
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public dobleNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(dobleNodo siguiente) {
        this.siguiente = siguiente;
    }

    public dobleNodo getAnterior() {
        return anterior;
    }

    public void setAnterior(dobleNodo anterior) {
        this.anterior = anterior;
    }
}

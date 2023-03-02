package org.example;

import javax.swing.*;

public class Lista_Doblemente_enlazada {

private dobleNodo inicio;
private dobleNodo fin;

public Lista_Doblemente_enlazada(){

    inicio=fin=null;

}

public boolean estavacia(){

    return inicio==null;
}

public void agregarinicio(int elemento){
    if (!estavacia()){

        inicio=new dobleNodo(elemento, inicio, null);
        inicio.siguiente.anterior=inicio;
    }else{
        inicio=fin=new dobleNodo(elemento);
    }

}

    public void agregarfin(int elemento){
        if (!estavacia()){

            fin=new dobleNodo(elemento, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new dobleNodo(elemento);
        }

    }
public void mostrar_lista_de_inicio_a_final(){
if (!estavacia()){
String concatenar="<<->>";
dobleNodo auxiliar=inicio;
while(auxiliar!=null){
    concatenar=concatenar + "(" + auxiliar.dato + ")<<->>";
    auxiliar=auxiliar.siguiente;
}
    JOptionPane.showMessageDialog(null, concatenar,"Mostrando datos de "+ "inicio al final de la lista",JOptionPane.INFORMATION_MESSAGE);
}

}

    public void mostrar_lista_de_fin_a_inicio(){
        if (!estavacia()){
            String concatenar="<<->>";
            dobleNodo auxiliar=fin;
            while(auxiliar!=null){
                concatenar=concatenar + "(" + auxiliar.dato + ")<<->>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, concatenar,"Mostrando datos de "+ "inicio al final de la lista",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public int eliminar_elemento_de_inicio(){
int elemento=inicio.dato;
if (inicio==fin){
    inicio=fin=null;
}else{
    inicio=inicio.siguiente;
    inicio.anterior=null;
}
return elemento;


    }


    public int eliminar_elemento_de_fin(){
        int elemento=inicio.dato;
        if (inicio==fin){
            inicio=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return elemento;


    }

}

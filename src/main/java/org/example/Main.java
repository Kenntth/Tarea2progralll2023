package org.example;

public class Main {
    public static void main(String[] args) {


Lista_Doblemente_enlazada prueba=new Lista_Doblemente_enlazada();
        prueba.agregarinicio(20);
        prueba.agregarinicio(80);
        prueba.agregarinicio(60);
        prueba.agregarinicio(10);
        prueba.mostrar_lista_de_inicio_a_final();
        prueba.mostrar_lista_de_fin_a_inicio();
        prueba.agregarfin(45);
        prueba.agregarfin(75);
        prueba.mostrar_lista_de_inicio_a_final();
        prueba.mostrar_lista_de_fin_a_inicio();
        prueba.eliminar_elemento_de_inicio();
        prueba.mostrar_lista_de_inicio_a_final();
        prueba.mostrar_lista_de_fin_a_inicio();
        prueba.eliminar_elemento_de_fin();
        prueba.mostrar_lista_de_inicio_a_final();
        prueba.mostrar_lista_de_fin_a_inicio();


   }
}
package Listas;
import Objetos.*;

public class ListaOjos {

    private Nodo cabeza;
    private int longitud = 0;

    private class Nodo {

        public Ojo ojo;
        public Nodo siguiente = null;

        public Nodo(Ojo ojo) {
            this.ojo = ojo;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarPrincipio(Ojo ojo) {
        Nodo nodo = new Nodo(ojo);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Ojo ojo) {
        Nodo nodo = new Nodo(ojo);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public void insertarDespues(int n, Ojo ojo) {
        Nodo nodo = new Nodo(ojo);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public Ojo obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return puntero.ojo;
            }
        }
    }

    public int contar() {
        return this.longitud;
    }

    public void eliminarPrincipio() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    }

    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                cabeza = null;
                longitud--;
            } else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente == null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }

    public void eliminarOjo(int n) {
        if (n == 0) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        } else if (n < longitud) {
            if (cabeza != null) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }
}
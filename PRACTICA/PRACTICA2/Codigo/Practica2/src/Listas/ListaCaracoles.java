package Listas;
import Objetos.*;

public class ListaCaracoles {

    private Nodo cabeza;
    private int longitud = 0;

    private class Nodo {

        public Caracol caracol;
        public Nodo siguiente = null;

        public Nodo(Caracol caracol) {
            this.caracol = caracol;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarPrincipio(Caracol caracol) {
        Nodo nodo = new Nodo(caracol);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Caracol caracol) {
        Nodo nodo = new Nodo(caracol);
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

    public void insertarDespues(int n, Caracol caracol) {
        Nodo nodo = new Nodo(caracol);
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

    public Caracol obtener(int n) {
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
                return puntero.caracol;
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

    public void eliminarCaracol(int n) {
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
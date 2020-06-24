
package Listas;
import Objetos.*;

public class ListaNave {

    private Nodo cabeza;
    private int longitud = 0;

    private class Nodo {

        public Nave nave;
        public Nodo siguiente = null;

        public Nodo(Nave nave) {
            this.nave = nave;
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarPrincipio(Nave nave) {
        Nodo nodo = new Nodo(nave);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Nave nave) {
        Nodo nodo = new Nodo(nave);
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

    public void insertarDespues(int n, Nave nave) {
        Nodo nodo = new Nodo(nave);
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

    public Nave obtener(int n) {
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
                return puntero.nave;
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

    public void eliminarNave(int n) {
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
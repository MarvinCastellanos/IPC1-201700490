
package Lista;


public class Nodo {
    private Objeto dato;
    private Nodo siguiente;

    public Nodo(Objeto dato) {
        this.dato = dato;
    }

    /**
     * @return the dato
     */
    public Objeto getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Objeto dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}


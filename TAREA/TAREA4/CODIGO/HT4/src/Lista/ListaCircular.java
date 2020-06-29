package Lista;

import javax.swing.JOptionPane;

public class ListaCircular {

    Nodo cabeza;
    int longitud;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int longitud() {
        return this.longitud;
    }

    public void insertar(Objeto dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        } else {
            Nodo auxiliar = cabeza;
            while (auxiliar.getSiguiente() != cabeza) {
                auxiliar = auxiliar.getSiguiente();
            }
            nuevo.setSiguiente(cabeza);
            auxiliar.setSiguiente(nuevo);
        }
        longitud++;
    }

    public String getCodigoGraphviz() {
        String codigo = "";
        Nodo nodoAuxiliar = cabeza;
        codigo += "digraph G {\n";
        if (cabeza == null) {
            codigo += "";
        } else {
            while (nodoAuxiliar.getSiguiente() != cabeza) {
                codigo += "" + nodoAuxiliar.getDato().getID() + "[label=\""
                        + nodoAuxiliar.getDato().getValor() + "\"]\n";
                codigo += "" + nodoAuxiliar.getDato().getID() + "->"
                        + nodoAuxiliar.getSiguiente().getDato().getID() + "\n";
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
            codigo += "" + nodoAuxiliar.getDato().getID() + "[label=\""
                    + nodoAuxiliar.getDato().getValor() + "\"]\n";
            codigo += "" + nodoAuxiliar.getDato().getID() + "->"
                    + nodoAuxiliar.getSiguiente().getDato().getID() + "\n";

        }
        codigo += "}";
        return codigo;
    }

    public void actualizar(int id, String valor) {
        Nodo nodoAuxiliar = this.cabeza;
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
        } else {
            while (nodoAuxiliar.getSiguiente() != cabeza) {
                if (nodoAuxiliar.getDato().getID() == id) {
                    nodoAuxiliar.getDato().setValor(valor);
                    break;
                }else{
                    nodoAuxiliar = nodoAuxiliar.getSiguiente();
                }
            }
            if (nodoAuxiliar.getDato().getID()==id) {
                nodoAuxiliar.getDato().setValor(valor);
            }else{
                JOptionPane.showMessageDialog(null,"Ese ID no se encuentra registrado");
            }
        }
    }
}

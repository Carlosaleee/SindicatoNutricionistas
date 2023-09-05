package Classes;

import java.util.ArrayList;
import java.util.List;

public class ListaConsulta {
    private static final List<Consulta> ListaConsulta = new ArrayList<>();

    public static List<Consulta> Listar() {
        return ListaConsulta;
    }

    public static void Adicionar(Consulta consulta) {
        ListaConsulta.add(consulta);
    }

    public static void remove(int posConsulta) {
        if (posConsulta >= 0 && posConsulta < ListaConsulta.size()) {
            ListaConsulta.remove(posConsulta);
        } else {
            System.out.println("Índice inválido.");
        
    }
    }
    
}
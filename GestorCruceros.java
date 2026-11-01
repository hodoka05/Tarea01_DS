import java.util.ArrayList;
import java.util.List;

public class GestorCruceros {
    private ArrayList<Crucero> cruceros;

    public GestorCruceros() {
        this.cruceros = new ArrayList<>();
    }

    public void agregarCrucero(Crucero crucero) {
        this.cruceros.add(crucero);
    }

    public Crucero buscarCrucero(String idCrucero) {
        for (Crucero c : cruceros) {
            if (c.getIdCrucero().equalsIgnoreCase(idCrucero)) {
                return c;
            }
        }
        return null;
    }

    public List<Crucero> getCruceros() {
        return cruceros;
    }
}
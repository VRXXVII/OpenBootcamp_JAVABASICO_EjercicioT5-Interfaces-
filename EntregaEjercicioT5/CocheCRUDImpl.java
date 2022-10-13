package EntregaEjercicioT5;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
    }

    @Override
    public void findAll() {
    }

    @Override
    public void delete() {
    }

    String save = "Coche almacenado";
    String findAll = "Mostrar listado de coches";
    String delete = "Borrar Coche";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}

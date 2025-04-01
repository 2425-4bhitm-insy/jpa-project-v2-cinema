package at.htl.leonding.control;

import at.htl.leonding.entity.Equipment;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EquipmentRepo implements PanacheRepository<Equipment> {

    public List<Equipment> getAll() {
        return listAll().stream().toList();
    }

    public Equipment findById(int id) {
        return findById(id);
    }
}

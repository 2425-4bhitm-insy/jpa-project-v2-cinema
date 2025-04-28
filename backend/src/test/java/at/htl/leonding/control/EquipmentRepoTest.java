package at.htl.leonding.control;

import at.htl.leonding.entity.Equipment;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class EquipmentRepoTest {

    @Inject
    EquipmentRepo equipmentRepo;

    @BeforeEach
    @Transactional
    void setUp() {
        equipmentRepo.deleteAll();

        Equipment equipment1 = new Equipment("Projector", "HD Projector", 500.0);
        Equipment equipment2 = new Equipment("Sound System", "Surround Sound", 300.0);
        equipmentRepo.persist(equipment1);
        equipmentRepo.persist(equipment2);
    }

    @Test
    void testGetAll() {
        var allEquipment = equipmentRepo.getAll();
        assertNotNull(allEquipment);
        assertEquals(2, allEquipment.size());
        assertTrue(allEquipment.stream().anyMatch(eq -> eq.getName().equals("Projector")));
        assertTrue(allEquipment.stream().anyMatch(eq -> eq.getName().equals("Sound System")));
    }

    @Test
    void testFindEquipmentById() {
        Equipment equipment = equipmentRepo.getAll().get(0);
        Equipment foundEquipment = equipmentRepo.findEquipmentById(equipment.getId());

        assertNotNull(foundEquipment);
        assertEquals(equipment.getId(), foundEquipment.getId());
        assertEquals(equipment.getName(), foundEquipment.getName());
        assertEquals(equipment.getDescription(), foundEquipment.getDescription());
    }

    @Test
    void testFindEquipmentByIdNotFound() {
        Equipment equipment = equipmentRepo.findEquipmentById(999L);
        assertNull(equipment);
    }
}

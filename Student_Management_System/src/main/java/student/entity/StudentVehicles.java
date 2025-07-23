package student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentVehicles {

    @Id
    private int vehicleId;
    private String vehicleName;
    private String vehicleType;

    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    @Override
    public String toString() {
        return "StudentVehicles [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType="
                + vehicleType + "]";
    }
    
}

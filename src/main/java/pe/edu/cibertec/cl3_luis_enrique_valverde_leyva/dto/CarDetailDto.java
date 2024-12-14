package pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.dto;

import java.util.Date;

public record CarDetailDto(Integer carId,
                           String make,
                           String model,
                           Integer Year,
                           String vin,
                           String licensePlate,
                           String ownerName,
                           String ownerContact,
                           Date purchaseDate,
                           Integer mileage,
                           String engineType,
                           String color,
                           String insuranceCompany,
                           String insurancePolicyNumber,
                           Date registrationExpirationDate,
                           String serviceDueDate) {
}

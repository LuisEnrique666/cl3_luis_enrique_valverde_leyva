package pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.service;

import pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.dto.CarDetailDto;
import pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}

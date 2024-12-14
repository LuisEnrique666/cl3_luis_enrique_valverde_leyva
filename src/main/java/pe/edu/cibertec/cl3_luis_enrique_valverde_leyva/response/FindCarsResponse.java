package pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.response;

import pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}

package pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.response;

import pe.edu.cibertec.cl3_luis_enrique_valverde_leyva.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car) {
}

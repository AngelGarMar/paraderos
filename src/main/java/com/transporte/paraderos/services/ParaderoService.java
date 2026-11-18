package com.transporte.paraderos.services;

import com.transporte.paraderos.dto.ParaderosRequest;
import com.transporte.paraderos.models.ResponseService;
import jakarta.servlet.http.HttpServletRequest;

public interface ParaderoService {
    ResponseService getListParaderos();
    ResponseService getParadero(Integer idParadero);
    ResponseService existParaderos(ParaderosRequest request, HttpServletRequest servletRequest);
}

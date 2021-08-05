package com.formacionbdi.microservicios.app.usuario.services;

import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.usuario.models.repository.AlumnoRepository;
import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formaciondbi.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {
	
	

}

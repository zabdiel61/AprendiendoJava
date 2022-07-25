package com.zd.www.servicio;

import com.zd.www.dao.AlumnoDAO;
import com.zd.www.domain.Alumno;
import java.util.List;

public class ServicioAlumno {

    private AlumnoDAO alumnoDAO = new AlumnoDAO();

    public List<Alumno> listarAlumnos() {
        return alumnoDAO.listar();
    }

    public void guardarAlumno(Alumno alumno) {
        if (alumno != null && alumno.getIdAlumno() == null) {
            alumnoDAO.insertar(alumno);
        } else {
            alumnoDAO.modificar(alumno);
        }
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnoDAO.eliminar(alumno);
    }

    public Alumno encontrarAlumno(Alumno alumno) {
        return alumnoDAO.buscarPorId(alumno);
    }

}

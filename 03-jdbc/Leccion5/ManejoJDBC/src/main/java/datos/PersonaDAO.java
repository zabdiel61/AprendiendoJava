/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface PersonaDAO {

    public List<PersonaDTO> select() throws SQLException;

    public int insert(PersonaDTO personaDTO) throws SQLException;

    public int update(PersonaDTO personaDTO) throws SQLException;

    public int delete(PersonaDTO personaDTO) throws SQLException;

}

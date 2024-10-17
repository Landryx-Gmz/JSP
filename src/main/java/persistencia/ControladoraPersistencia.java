package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;


public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //Operación CREATE
    public void crearUsuario (Usuario usu) {
        usuJpa.create(usu);
        
    }
    
    //Operación READ
    
    public List<Usuario> traerUsuarios () {
        return usuJpa.findUsuarioEntities();
    }

    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}


package com.portfolio.IntegratorProject.Security.Repository;

import com.portfolio.IntegratorProject.Security.Entity.Rol;
import com.portfolio.IntegratorProject.Security.Enuns.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

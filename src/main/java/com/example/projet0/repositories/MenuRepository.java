package com.example.projet0.repositories;

import com.example.projet0.entities.Menu;
import com.example.projet0.entities.TypeMenu;
import com.example.projet0.entities.Typecomposant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuRepository extends CrudRepository<Menu,Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float prix);

    @Query("select m.libelleMenu from Menu m where m.typeMenu = :typeMenu order by m.prixTotal asc")
    List <Menu> findByTypeMenuAndOrderByPrixTotal(TypeMenu typeMenu);


    @Query("select m.libelleMenu from Menu m  join m.composants c where c.detailcomposant  = :typeComposant")
    List <Menu> findByTypeComposant(Typecomposant typeComposant);

}

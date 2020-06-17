/**
 * 
 */
package com.algawork.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.patrimonio.model.item;

/**
 * @author Mario
 *
 */
public interface itemRepository extends JpaRepository<item, Long> {

}

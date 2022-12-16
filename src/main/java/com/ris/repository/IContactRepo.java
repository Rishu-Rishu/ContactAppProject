/**
 * 
 */
package com.ris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ris.binding.Contact;

/**
 * @author Rishu
 *
 */
@Repository
public interface IContactRepo extends JpaRepository<Contact, Integer> {

}

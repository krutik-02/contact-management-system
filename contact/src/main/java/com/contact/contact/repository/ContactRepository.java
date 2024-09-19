package com.contact.contact.repository;



import com.contact.contact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ContactRepository extends JpaRepository<Contact, Long> {
    }


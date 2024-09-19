package com.contact.contact.controller;

import com.contact.contact.model.Contact;
import com.contact.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/contacts")
    @CrossOrigin // To allow requests from your React app
    public class ContactController {

        @Autowired
        private ContactRepository contactRepository;

        @GetMapping
        public List<Contact> getAllContacts() {
            return contactRepository.findAll();
        }

        @PostMapping
        public Contact createContact(@RequestBody Contact contact) {
            return contactRepository.save(contact);
        }

        @DeleteMapping("/{id}")
        public void deleteContact(@PathVariable Long id) {
            contactRepository.deleteById(id);
        }
    }


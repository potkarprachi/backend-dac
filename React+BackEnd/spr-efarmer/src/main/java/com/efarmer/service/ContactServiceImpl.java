package com.efarmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarmer.PDto.contactDto;
import com.efarmer.dao.ContactDao;
import com.efarmer.model.ContactUs;

@Service
public class ContactServiceImpl implements ContactService{

	ContactDao contactdao;
	
	@Autowired
	public ContactServiceImpl(ContactDao contactdao) {
		this.contactdao = contactdao;
	}

	@Override
	public Object createQuery(contactDto contactdto) {
          System.out.println(contactdto.getContact());
		 ContactUs contact1 = mapToEntity(contactdto);
		 ContactUs cu = contactdao.save(contact1);
		 return mapToDTO(cu);
	}
	
	public contactDto mapToDTO(ContactUs contact)
    {
        contactDto cd = new contactDto();
         cd.setId(contact.getId()); 
        cd.setContact(contact.getContact());
        cd.setName(contact.getName());
        cd.setQuery(contact.getQuery());
        return cd;
    }
    public ContactUs mapToEntity(contactDto contactdto)
    {
        ContactUs contact = new ContactUs();
        contact.setEmail(contactdto.getEmail());
        contact.setName((contactdto.getName()));
        contact.setQuery(contactdto.getQuery());
        contact.setContact(contactdto.getContact());

        return contact;

    }

}

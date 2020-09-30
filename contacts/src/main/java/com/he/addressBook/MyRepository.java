package com.he.addressBook;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@org.springframework.stereotype.Repository
public interface MyRepository extends CrudRepository<Contact, String> {
	
	
//	@Query("select * from contact where name like %name")
//	existsByName(@Param String name);

}

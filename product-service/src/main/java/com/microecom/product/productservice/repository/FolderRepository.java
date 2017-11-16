package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Folder;

public interface FolderRepository extends MongoRepository<Folder, String> {

}

package org.pm.cloudinventoryapp.repository;

import org.pm.cloudinventoryapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
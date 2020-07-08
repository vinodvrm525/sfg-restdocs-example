package com.example.sfgrestdocsexample.repositories;

import com.example.sfgrestdocsexample.domain.Beer;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jt on 2019-05-17.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

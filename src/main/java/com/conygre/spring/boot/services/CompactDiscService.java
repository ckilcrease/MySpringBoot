package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.CompactDisc;

import java.util.Collection;

public interface CompactDiscService {
    Iterable<CompactDisc> getCatalog();
}

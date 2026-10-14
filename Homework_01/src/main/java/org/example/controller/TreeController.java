package org.example.controller;

import org.example.repository.TreeRepository;

public class TreeController extends AppController {
    public TreeController(TreeRepository repository) {
        super(repository);
    }
}
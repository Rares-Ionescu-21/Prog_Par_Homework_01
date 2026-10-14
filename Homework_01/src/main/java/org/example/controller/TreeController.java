package org.example.controller;

import org.example.repository.TreeRepository;
import org.example.view.ConsoleView;

public class TreeController extends AppController {
    public TreeController(TreeRepository repository, ConsoleView view) {
        super(repository, view);
    }
}
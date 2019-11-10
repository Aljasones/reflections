package ru.itpark.implementation.controller;

import lombok.RequiredArgsConstructor;
import ru.itpark.framework.annotation.Component;
import ru.itpark.framework.annotation.Controller;
import ru.itpark.implementation.service.AutoService;

import java.util.Collections;
import java.util.List;

@Component
@Controller
@RequiredArgsConstructor
public class AutoController {
  private final AutoService service;

  public List<String> doSearch(String name) {
    return Collections.emptyList();
  }
}g

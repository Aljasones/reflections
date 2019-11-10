package ru.itpark.implementation.router;

import lombok.AllArgsConstructor;
import ru.itpark.framework.annotation.Component;
import ru.itpark.implementation.controller.AutoController;
import ru.itpark.framework.router.Router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@AllArgsConstructor
public class RouterImpl implements Router {
  private final AutoController autoController;

  @Override
  public Object route(HttpServletRequest request, HttpServletResponse response) {
    switch (request.getRequestURI()) {
      case "/doSearch":
        return autoController.doSearch("sample");
      default:
        // 404
        return null;
    }
  }
}

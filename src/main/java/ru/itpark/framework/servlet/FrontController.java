package ru.itpark.framework.servlet;

import ru.itpark.framework.container.Container;
import ru.itpark.framework.annotation.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrontController extends HttpServlet {
  @Override
  public void init() throws ServletException {
    final Map<Class, Object> components = Container.init();
    final List<Object> controllers = components.values().stream()
        .filter(o -> o.getClass().isAnnotationPresent(Controller.class))
        .collect(Collectors.toList());

    // -> /doSearch?name=text -> method
  }

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    router.route(req, resp);
  }
}


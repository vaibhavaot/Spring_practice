package academy.ennate;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//front controller is also called as Dispatcher Servlet
public class Appinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Application.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/api/*"};
    }
}

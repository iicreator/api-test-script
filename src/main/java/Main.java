import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ren.eatbox.config.DemoConfiguration;
import ren.eatbox.service.DemoService;

/**
 * @ClassName: APITestScript
 * @Description: TODO
 **/
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
        DemoService demoService = (DemoService) context.getBean("demoService");
        demoService.testLogin();
    }

}

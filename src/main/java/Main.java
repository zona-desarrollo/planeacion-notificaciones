
import mx.gob.conabio.config.AppConfig;
import mx.gob.conabio.config.MainConfig;
import mx.gob.conabio.config.PersistenceConfig;
import mx.gob.conabio.service.RecordatoriosService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koshi
 */
public class Main {

    public static void main(String... args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(PersistenceConfig.class,MainConfig.class,AppConfig.class);
        ctx.refresh();
        RecordatoriosService svc = ctx.getBean(RecordatoriosService.class);
        svc.generaNotificaciones();
    }
}

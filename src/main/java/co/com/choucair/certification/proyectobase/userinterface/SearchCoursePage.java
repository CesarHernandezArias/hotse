package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
public static final Target BUTTON_UC = Target.the("Selecciona cursos y certificaciones")
        .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));
public static final Target INPUT_COURSE = Target.the("Buscar el curso")
        .located(By.id("coursesearchbox"));
public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
        .located(By.xpath("//button[@class='btn btn-secondary']"));
public static final Target SELECT_COURSE = Target.the("Da click en el curso")
        .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[2]/div/div/a/div[2]/h4"));
public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso")
        .located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div/div[1]/h3/a"));
}

package main;
import views.View;
import models.Model;
import controllers.Controller;
/**
 *
 * @author lupita
 */
public class Main {
private static View views;
private static Model models;
private static Controller controllers;

    public static void main(String[] mgfc) {
        
        Model models = new Model();
        View  views=  new View();
        Controller controllers = new Controller(views,models);
        
        // TODO code application logic here
    }
    
}

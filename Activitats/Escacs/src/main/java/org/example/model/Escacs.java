package org.example.model;

import builder.Car;
import builder.CarBuilder;
import builder.Director;
import factory.CircleFactory;
import factory.Rectangle;
import factory.Shape;
import factory.ShapeFactory;
import singleton.Jugador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Escacs {
    public static void main(String[] args) {
        Escacs escacs = new Escacs();
        escacs.init();
    }

    public void init() {
        Peca rei = new Rei();
        Peca reina = new Reina();

        Peca dama1 = new Dama();
        Peca dama2 = new Dama();
        Peca dama3 = new Dama();
        Peca dama4 = new Dama();

        List<Peca> pecas = new ArrayList<>();
        List<Peca> pecas2 = new LinkedList<>();

        //if (isPotMoureCapEnrere(dama1)) {
        if (dama1.isPotMoureCapEnrere()) {
            System.out.println("Peça cap enrere");
        } else {
            System.out.println("No es pot moure cap enrere");
        }

        Usuari joan = new UsuariBuilder()
                .setCognom2("Riera").build();
        System.out.println(joan.getCognom1());

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.suv(builder);

        Car car = builder.getResult();
        System.out.println("El meu cotxe té " + car.getSeats() + " seients");

        Jugador jugador1 = Jugador.getInstance();
        jugador1.setNom("Jugador 1");
        System.out.println("El jugador 1 es diu " + jugador1.getNom());

        Jugador jugador2 = Jugador.getInstance();
        jugador2.setNom("Jugador 2");

        System.out.println(
                "El jugador 1 es diu " + jugador1.getNom() + ". " +
                        "El jugador 2 es diu " + jugador2.getNom()
        );

        /* FACTORY PATTERN */
        //Shape rectangle = new Rectangle();
        //ShapeFactory shapeFactory = new ShapeFactory();
        //Shape rectangle = shapeFactory.getShape("RECTANGLE");
        //rectangle.draw();

        Shape circle = new CircleFactory().create();
        circle.draw();

    }

    /*public boolean isPotMoureCapEnrere (Peca peca) {
        if (peca instanceof Rei) {
            return true;
        } else if (peca instanceof Reina) {
            return true;
        } else if (peca instanceof Dama) {
            return false;
        }
        return false;
    }*/


}

package com.sayem.abstraction.demo1;

public class Main {

    public static void main(String [] args){

        GameObject menu = new Menu();
        GameObject player = new PLayer();

        //player.someMethod();  - ERROR

        //menu.draw();
        //player.draw();

        GameObject[] gameObjects = new GameObject[2];
        gameObjects[0] = player;
        gameObjects[1] = menu;

        for (GameObject object : gameObjects){
            object.draw();
        }
    }
}

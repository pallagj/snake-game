package controllers;

public interface Controllable {
    default void up(){}
    default void right(){}
    default void down(){}
    default void left(){}

    default void escape(){}
    default void enter(){}
}

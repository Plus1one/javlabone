package com.company;
import java.util.Scanner;

public class BD {
    private BD next = null;
    private String value = null;
    /**
     * Геттер для ссылки на следующий элемент списка после текущего.
     * @return next ссылка на сл. эл-т
     */
    public BD getNext(){
        return next;
    }
    /**
     * @param nod1 Сеттер для ссылки на сл эл-т (:
     */
    public void setNext(BD nod1)
    {
        next = nod1;
    }
    /**
     * Геттер для значения элемента
     * @return valuee значение элемента
     */
    public String getValue()
    {
        return value;
    }
    /**
     * @param valuee
     * Сеттер для значения в параметре
     */
    public void setValue(String valuee)
    {
        value = valuee;
    }
}

package com.proyecto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.bean.Proyecto;

public class App {

	public static void main(String[] args) {
		ApplicationContext prueba = new ClassPathXmlApplicationContext("beans.xml");

		Proyecto pl = (Proyecto) prueba.getBean("proyecto");
        System.out.println(pl.getId()+ "otro elemento " + pl.getNombre());
	}

}

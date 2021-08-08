package com.sys4soft;

import java.time.*;

public class IntroducaoDataHora {

	public static void main(String[] args) {

		System.out.println(LocalDate.now().toString());
		System.out.println(LocalDate.now().getYear());
		System.out.println(LocalDate.now().getDayOfYear());
		System.out.println(LocalDate.now().getMonthValue());

		System.out.println(LocalTime.now().toString());
		System.out.println(LocalTime.now().getHour());
		System.out.println(LocalTime.now().getMinute());

		int hora = LocalTime.now().getHour();
		System.out.println(hora);

	}

}

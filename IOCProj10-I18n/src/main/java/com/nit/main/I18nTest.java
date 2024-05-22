package com.nit.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;

public class I18nTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter language code: ");
		String lang=sc.next();
		System.out.println("Enter Country Code: ");
		String country=sc.next();
		Locale locale=new Locale(lang,country);
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		String msg1=ctx.getMessage("wish.msg", new Object[] {" Nithin"}, locale);
		String msg2=ctx.getMessage("seeu.msg", new Object[] {"Nithin"}, locale);
		System.out.println(msg1+" "+msg2);
		ctx.close();
		sc.close();
		
	}

}

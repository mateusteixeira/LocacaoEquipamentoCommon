package com.datacoper.locacaoequipamentos.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface ColumnTableSearch {
	String header();
	int width();
}
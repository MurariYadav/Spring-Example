package com.app.product;

import com.app.interfac.IModel;
import com.app.modelimpl.ModelImpl;

public class Product {

private IModel m;

public Product() {
	super();
}

public IModel getM() {
	return m;
}

public void setM(IModel m) {
	this.m = m;
}

@Override
public String toString() {
	return "Product [m=" + m + "]";
}

}

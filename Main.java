package com.company;

public class Main {

    public static void main(String[] args) {
	User user = new NotLoggedVisitor();

	user.display();
	user.validate();
    }
}

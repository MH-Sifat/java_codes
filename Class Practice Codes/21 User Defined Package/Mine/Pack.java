package userPackage;
// Packages are a feature of the Java programming language that help us to organize and structure our classes and their relationships to one another.

// package is a group of related classes, interfaces and sub packages.
// There are two types of packages in java.
// 1. Built-in-package : Already defined packages like java.io.*, java.lang.* etc. are known as built-in packages
// 2. User Defined Package: The package we create is called user-defined package.
// Packages can be considered as data encapsulation (or data-hiding).

/*
// example of buit-in-package:
import java.util.*;

public class Pack{
	public static void main(String[] args){
		Scanner sc = new Scanner();
	}
}
*/

// 2 ta class ek e package / folder e thakle ekta arektar dara object create korte parbe.
// 2 ta bhinno folder e thakle seta or package theke import kore nite hobe.
/*
// er mane ey package er sob kihcu import kora hoyeche 
import A.*;
// er mane ey package er shudhu Cat class e import kora hoyeche
import B.Cat;

public class Pack{
	public static void main(String[] args){
		System.out.println("Start");
		Dog a = new Dog();
		Cat b = new Cat();
		B.Dog c = new B.Dog();

	}
}
*/


// 2 ta bhinno package e ek e name er class thakte parbe.
// dog class same name er 2 ta ache kintu 2 ta bhinno package etai ar ekhne 
// packageName.className diye bole deowa hoyeche je amra kon class tar object create korte chai.
/*
public class Pack{
	public static void main(String[] args){
		System.out.println("Start");
		B.Dog d = new B.Dog();
		
	}
}
*/

// We can create a hierarchy of packages. 
// The general form of a multileveled package statement is shown here:
//package A.B.C;
// er mane A package er bhitore B package ache and package er bhitore C package ache;

// The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names.

// to run code we have to write : javac -d . FileName => then => java packageName.className
// amra onno package er class use kori tahole run korar time e amdr oi file gular name diye run korte hobe
// example: javac -d . Main.java One.java Two.java  => then => java MainClasspackageName.MainClassName

// Hierarchy of Packages
// Java allows packages to be organized hierarchically. This means packages can contain sub-packages.
//package A.B.C;

// Package names should generally be in lowercase.
// To avoid name conflicts, it's a good practice to use your domain name in reverse as the package name (e.g., com.example).

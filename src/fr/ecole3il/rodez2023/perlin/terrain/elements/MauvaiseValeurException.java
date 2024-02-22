package fr.ecole3il.rodez2023.perlin.terrain.elements;
/**@author EnzoFAVRET*/
/**@constructor --> constructor d'une exception pour gérer les mauvaises valeurs des données du terrain*/
public class MauvaiseValeurException extends IllegalArgumentException {
	public MauvaiseValeurException(String message) {
		super(message);
	}
}
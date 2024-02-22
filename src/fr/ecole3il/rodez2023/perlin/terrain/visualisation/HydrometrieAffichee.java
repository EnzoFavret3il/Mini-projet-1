package fr.ecole3il.rodez2023.perlin.terrain.visualisation;
/**@author EnzoFAVRET*/
/**@Enum --> Différents types d'hydrometrie*/
public enum HydrometrieAffichee {
	SEC(0.33),
    MOYEN(0.66),
    HUMIDE(1.0);

	
	/**@ResteCode --> Gestion des valeurs*/
    private final double valeurLimite;

    HydrometrieAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }
    /**Renvoie la valeur limite pour gérer les biomes*/
    public double getValeurLimite() {
        return valeurLimite;
    }
}

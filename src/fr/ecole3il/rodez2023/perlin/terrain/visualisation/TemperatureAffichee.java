package fr.ecole3il.rodez2023.perlin.terrain.visualisation;
/**@Enum --> Différents types de temperature*/
public enum TemperatureAffichee {
	FROID(0.0),
    TEMPERE(10.0),
    CHAUD(20.0);

	
	/**@ResteCode --> Gestion des valeurs*/
    private final double valeurLimite;

    TemperatureAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }
    /**Renvoie la valeur limite pour gérer les biomes*/

    public double getValeurLimite() {
        return valeurLimite;
    }
}

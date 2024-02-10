package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum HydrometrieAffichee {
	SEC(0.33),
    MOYEN(0.66),
    HUMIDE(1.0);

    private final double valeurLimite;

    HydrometrieAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }

    public double getValeurLimite() {
        return valeurLimite;
    }
}

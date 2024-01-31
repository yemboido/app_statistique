package app.rapport.statistique.domain;

import app.rapport.statistique.config.MetierException;

public interface Statistique {
	public StatistiqueFileService getFileToTrait(String extension) throws MetierException;
	
}

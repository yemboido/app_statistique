package app.rapport.statistique.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.lang.*;

import org.springframework.stereotype.Service;

import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.domain.Statistique;
import app.rapport.statistique.domain.StatistiqueFileService;
import app.rapport.statistique.models.StatistiqueModel;


@Service
public class StatistiqueImpl implements Statistique {

	@Override
	public StatistiqueFileService getFileToTrait(String extension) throws MetierException {
		switch (extension.toLowerCase()) {
		case "json": {
			
			return new StatistiqueJsonFileImpl();
		}
		case "xml": {
			return new StatistiqueXmlFileImpl();
		}
		case "csv": {
			return new StatistiqueCsvFileImpl();
		}
		default:
			throw new MetierException("extension "+extension.toUpperCase()+" du fichier transmit n'est pas prise en charge: ");
		}
	}

}

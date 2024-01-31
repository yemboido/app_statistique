package app.rapport.statistique.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.models.StatistiqueModel;

public interface StatistiqueFileService {

	public List<StatistiqueModel> extractFile(String path) throws MetierException;
	

    default public Map<String,Double> moyenneSalaireParProfessionPourToutes(List<StatistiqueModel> persons)throws MetierException {
    	try {
    		Map<String, List<StatistiqueModel>>  response =  persons.stream()
                    .collect(Collectors.groupingBy(StatistiqueModel::getProfession
                    ));
        	Map<String, Double> data = new HashMap();
        	response.forEach((key, value) -> {
        		data.put(key, value.stream()
        	            .mapToDouble(StatistiqueModel::getSalaire)
        	            .average().getAsDouble());
        	    System.out.println("Clé : " + key + ", Valeur : " + value.stream()
        	            .mapToDouble(StatistiqueModel::getSalaire)
        	            .average());
        	});
        	return data;
		} catch (Exception e) {
			throw new MetierException("impossible de traiter le fichier");
		}
    }
}

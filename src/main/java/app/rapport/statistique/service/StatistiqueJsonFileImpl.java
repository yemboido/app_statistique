package app.rapport.statistique.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.domain.StatistiqueFileService;
import app.rapport.statistique.models.StatistiqueModel;

@Service
public class StatistiqueJsonFileImpl implements StatistiqueFileService {

	@Override
	public List<StatistiqueModel> extractFile(String path) throws MetierException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		TypeReference<List<StatistiqueModel>> typeReference = new TypeReference<List<StatistiqueModel>>() {};
		
		byte[] decodedBytes = Base64.getDecoder().decode(path);

        try {
        	InputStream inputStream = new ByteArrayInputStream(decodedBytes);
        	List<StatistiqueModel> model = objectMapper.readValue(inputStream, typeReference);
        	return model;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MetierException("Impossible de prendre en charge le fichier");
		}

		
	}

}

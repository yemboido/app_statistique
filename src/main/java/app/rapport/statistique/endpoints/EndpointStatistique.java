package app.rapport.statistique.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.rapport.statistique.config.ApiError;
import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.domain.Statistique;
import app.rapport.statistique.domain.StatistiqueFileService;
import app.rapport.statistique.models.StatistiqueFile;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/statistique")
@RequiredArgsConstructor
public class EndpointStatistique {

	@Autowired
	private Statistique statistique;
	
	@PostMapping("/")
    public ResponseEntity<?> upload(@RequestBody StatistiqueFile data)
    {
		
		try {
			StatistiqueFileService stat =  statistique.getFileToTrait(data.getTypeFile());
			
	    	return ResponseEntity.ok(stat.moyenneSalaireParProfessionPourToutes(stat.extractFile(data.getBase64()))); 
		} catch (MetierException e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiError(HttpStatus.BAD_REQUEST, e.getMessage()));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body(new ApiError(HttpStatus.GATEWAY_TIMEOUT, "Impossible de traiter la requete, le contenue est illisible"));
		}
    }

}

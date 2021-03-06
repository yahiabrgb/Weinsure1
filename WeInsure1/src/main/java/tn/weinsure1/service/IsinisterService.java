package tn.weinsure1.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.weinsure1.entities.Contract;
import tn.weinsure1.entities.User;
import tn.weinsure1.entities.sinister;
import tn.weinsure1.entities.sinisterstatus;

public interface IsinisterService {

	 List<sinister> retrieveAllSinistres(); 
	 sinister addSinistre(sinister s , Long id);
	 void deleteSinistre(String id);
	 sinister updateSinistre(sinister s);
	 sinister retrieveSinistre(String id);
	 List<sinister> findByStatus(sinisterstatus sins);
	 List<sinister> findByDescription(String name);
	 List<sinister> findByYear(String year) ;
	 List<sinister> findByAny(String any);
	 List<sinister> findSinisterByStatusRejected()  ;
	 List<sinister> findSinisterByStatusEnAttente()  ;
	 void CheckStatus() ; 
	 float CVE(Long idU , Long idC  ) ; 
	 void SendMail() ;
	 List<sinister> findbyuserid(Long id);
	 int findcontractdurationBysinister(Long id );
	 float CapitalCasDéces(Long idS , Long idC) throws ParseException ;
	 float CapitalDécesPeriodique(Long idS , Long idC  ) throws ParseException ;
	 float TDEMPRUNTEUR(Long idS , Long idC  ) throws ParseException ;
	 void affecterUserSinister(Long SinId , Long UserId) ; 
	 void affecterSinisterUser(Long SinId, Long userId);
	 List<sinister> findSinisterDescriptionwithUR( Long id);
	 double CreditSimulator( Long idS , Long idC) ;
	 void UpdateSinDescription(Long idS ,String description ) ;
	 String yallacurrent() ;
	 float GetSalaireMoyenUsersContractSinister();
	 float GetPrixContratContractSinister();
	 

}

<<<<<<< HEAD
package tn.weinsure1.service;

import tn.weinsure1.entities.TableMortalité;

public interface ITableMortaliteService {

	TableMortalité Addtm(TableMortalité t);
	float findBySurvivantsLx(int ageClient);
	float findByDecesDx(int deces);
	 float calcull(float capital , int ageClient, int AgeMax, double taux);
	 float findProbaByAgeClient(int ageClient);
}
=======
package tn.weinsure1.service;

import tn.weinsure1.entities.Contract;
import tn.weinsure1.entities.TableMortalité;

public interface ITableMortaliteService {

	TableMortalité Addtm(TableMortalité t);

}
>>>>>>> branch 'master' of https://github.com/yahiabrgb/Weinsure1.git

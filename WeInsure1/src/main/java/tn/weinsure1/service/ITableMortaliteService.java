package tn.weinsure1.service;

import tn.weinsure1.entities.TableMortalit√©; 

public interface ITableMortaliteService {

	TableMortalit√© Addtm(TableMortalit√© t);
	float findBySurvivantsLx(int ageClient);
	float findByDecesDx(int deces);
	 float calcull(float capital , int ageClient, int AgeMax, double taux);
	 float findProbaByAgeClient(int ageClient);
	 int findAgeMax();
}

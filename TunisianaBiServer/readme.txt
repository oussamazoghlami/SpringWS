Pour importer le projet sous eclipse :
	1/ lancer la commande     mvn eclipse:eclipse    sous la racine du projet
	2/ Copier le projet sous votre Workspace
	3/ Importer le projet depuis Eclipse
	
Pour compiler le projet et construire le .war de l'application
	1/ lancer la commande     mvn clean install     sous la racine du projet
	2/ copier le .war localisé sous   project_path/target sous votre conteneur 
	   de servlet
	   
Pour generer les classes Java associées aux descripteurs '.xsd' avec le 
plugin JAXB, lancer la commande suivante :
	1/ mvn jaxb2:generate
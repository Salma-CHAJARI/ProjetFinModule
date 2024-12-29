# MindCare : Système d'intervention en santé mentale utilisant l'intelligence linguistique

## Aperçu

Ce dépôt contient l'implémentation d'un système de classification et de recommandation de l'humeur utilisant un jeu de données et un chatbot. Le système fournit un soutien et des conseils en matière de santé mentale grâce à des réponses préprogrammées, l'extraction d'informations émotionnelles, des recommandations d'activités et des recommandations musicales.

## Stack Technique

![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) ![Python](https://img.shields.io/badge/python-%233776AB.svg?style=for-the-badge&logo=python&logoColor=white) ![Django](https://img.shields.io/badge/django-%23092E20.svg?style=for-the-badge&logo=django&logoColor=white) ![Rasa](https://img.shields.io/badge/rasa-%235A9DD8.svg?style=for-the-badge&logo=rasa&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-%234479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)

## Architecture du Système

L'architecture du système comprend les composants suivants :

1. **Interface Chatbot** : Le point d'interaction principal avec l'utilisateur fournissant support et conseils avec des réponses préprogrammées. Il collecte des données émotionnelles à partir des entrées utilisateur.
2. **Pré-traitement des Données** : Implique le nettoyage et la transformation des données textuelles ou vocales, qui sont converties en texte via des outils de reconnaissance vocale.
3. **Gestion des Données** : Le jeu de données, contenant des données textuelles ou vocales étiquetées, est divisé en ensembles d'entraînement et de test.
4. **Détection des Émotions** : Les intentions, entités et réponses sont créées pour différentes émotions (Neutre, Heureux, Triste, Amour, Colère) en utilisant le framework Rasa.
5. **Génération de Réponses** : En fonction des émotions prédites, le système génère des réponses textuelles, audio et d'activités appropriées.
6. **Analyse des Sentiments** : Les progrès hebdomadaires sont analysés à l'aide de modèles comme Naive Bayes pour fournir des aperçus des sentiments.
7. **Services Basés sur la Localisation** : Les API ou bases de données déterminent la localisation de l'utilisateur pour fournir des conseils professionnels personnalisés basés sur l'analyse des sentiments.
8. **Recommandation d'Activités et de Musique** : Des exercices spécifiques ou des playlists personnalisées sont recommandés en fonction de l'état émotionnel de l'utilisateur.

## Parcours Utilisateur

1. **Inscription** : Les nouveaux utilisateurs créent des comptes et fournissent les informations nécessaires à la personnalisation.
2. **Connexion** : Les utilisateurs se connectent avec leurs identifiants. L'authentification assure un accès sécurisé.
3. **Fonctionnalités Principales** :
   - **Suivi des Progrès** : Les utilisateurs suivent leurs progrès en santé mentale au fil du temps.
   - **Chatbot** : Permet des conversations textuelles pour le support et les conseils.
   - **Activités** : Exercices personnalisés adaptés aux besoins individuels.
   - **Consultations Professionnelles** : Accès à des experts en santé mentale pour des consultations.
4. **Interaction** : Les utilisateurs saisissent du texte pour initier des conversations, et le système classe et répond à l'entrée en utilisant des techniques de traitement du langage naturel.
5. **Fin de Session** : Les utilisateurs peuvent terminer leur interaction à tout moment en utilisant l'option "Arrêt".

## Implémentation

### Pré-traitement des Données

1. **Chargement du Jeu de Données** : Le jeu de données contenant les tweets et leurs émotions associées est chargé.
2. **Nettoyage des Tweets** : Les caractères spéciaux, URLs et mentions sont supprimés, et le texte est converti en minuscules.
3. **Encodage des Étiquettes** : Les étiquettes d'émotion sont converties en valeurs numériques.
4. **Traitement et Sauvegarde des Données** : Chaque tweet est traité, nettoyé et sauvegardé dans un nouveau fichier CSV avec des étiquettes encodées.
5. **Sortie Finale** : Un jeu de données nettoyé prêt pour une analyse ultérieure ou l'entraînement de modèles d'apprentissage automatique.

### Framework Rasa

#### Compréhension du Langage Naturel (NLU)

La classification des intentions est effectuée pour mapper le texte d'entrée aux intentions prédéfinies. L'objectif est d'attribuer une distribution de probabilité sur les intentions étant donné un texte d'entrée, représenté comme P(intention | x), où intention est l'une des intentions prédéfinies.

## Fonctionnalités

- **Interface Chatbot** : Engage les utilisateurs dans des conversations textuelles et fournit des recommandations personnalisées.
- **Recommandation d'Activités** : Suggère des exercices ou activités basés sur les besoins émotionnels.
- **Recommandation de Musique** : Offre des playlists personnalisées pour améliorer l'humeur ou la relaxation.
- **Analyse des Sentiments** : Fournit une analyse et des aperçus des progrès hebdomadaires.
- **Services Basés sur la Localisation** : Délivre des conseils professionnels basés sur la localisation de l'utilisateur.
- **Authentification Sécurisée** : Assure un accès sécurisé via la validation des identifiants.
- **Visualisation des Progrès** : Les utilisateurs peuvent visualiser leurs progrès en santé mentale au fil du temps.

## Vidéo de Démonstration

https://github.com/user-attachments/assets/4c7e0da8-6aa1-43b9-817a-6210aefa64cd



## Installation

Pour configurer le projet localement sous Windows en utilisant l'Invite de Commandes, suivez ces étapes :

#### Prérequis

##### Note : Vous pouvez télécharger ces éléments depuis le dossier Prerequisites. Ce projet fonctionne sous Windows.

Python 3.8.10 <a href="https://www.python.org/downloads/release/python-3810/">Cliquez ici pour télécharger Python | Installateur Windows (64-bit)</a>

Serveur Xamp | <a href="https://drive.google.com/drive/folders/1VWBui22ZbwpNicrmTKjjtMuAU2Eyn0sb?usp=drive_link">Cliquez ici pour télécharger XAMP et la Base de données</a> <br>
Après avoir terminé l'installation et la configuration, créez une nouvelle base de données nommée 'mind_care' et importez la base de données dans phpMyAdmin.

### Invite de Commandes 1

1. Clonez le dépôt :
   ```sh
   git clone https://github.com/Roopesh519/Mindcare-Conversation-Chatbot-Rasa-Framework.git
   cd Mindcare-Conversation-Chatbot-Rasa-Framework
   ```

2. Créez un environnement virtuel nommé `venv` :
   ```sh
   python -m venv venv
   ```

3. Activez l'environnement virtuel :
   ```sh
   venv\Scripts\activate
   ```

4. Installez les dépendances requises :
   ```sh
   cd Mindcare
   pip install -r requirement.txt
   ```

5. Naviguez vers le répertoire du modèle Rasa :
   ```sh
   cd MindCareModal
   ```

6. Lancez le serveur Rasa avec l'API et CORS activés :
   ```sh
   rasa run --enable-api --cors "*"
   ```

### Invite de Commandes 2

1. Ouvrez une nouvelle Invite de Commandes et naviguez vers le répertoire du dépôt cloné :
   ```sh
   cd chemin\vers\Mindcare-Conversation-Chatbot-Rasa-Framework
   ```

2. Activez l'environnement virtuel :
   ```sh
   venv\Scripts\activate
   ```

3. Naviguez vers le répertoire du modèle Rasa :
   ```sh
   cd Mindcare\MindCareModal
   ```

4. Lancez le serveur d'actions Rasa :
   ```sh
   rasa run actions
   ```

### Invite de Commandes 3

1. Ouvrez une autre nouvelle Invite de Commandes et naviguez vers le répertoire du dépôt cloné :
   ```sh
   cd chemin\vers\Mindcare-Conversation-Chatbot-Rasa-Framework
   ```

2. Activez l'environnement virtuel :
   ```sh
   venv\Scripts\activate
   ```

3. Naviguez vers le répertoire de l'application Django :
   ```sh
   cd Mindcare\MindCare
   ```

4. Lancez le serveur de développement Django :
   ```sh
   python manage.py runserver
   ```

## Utilisation

1. **Démarrez le serveur Rasa** : Suivez les étapes de l'Invite de Commandes 1.
2. **Démarrez le serveur d'actions Rasa** : Suivez les étapes de l'Invite de Commandes 2.
3. **Démarrez le serveur Django** : Suivez les étapes de l'Invite de Commandes 3.

Vous pouvez maintenant interagir avec le chatbot et utiliser le système d'intervention en santé mentale via l'interface web fournie par le serveur Django.

## Licence

Ce projet est sous licence MIT 

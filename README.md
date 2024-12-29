# Application Android de Suivi de Santé Mentale avec Chatbot et Analyse Faciale


<img width="395" alt="1" src="https://github.com/user-attachments/assets/9a6d79be-b91e-40a1-902f-d345592e485f" />

Application Android mobile permettant le suivi de l'état mental des utilisateurs en combinant trois technologies clés : un chatbot conversationnel intelligent, une analyse faciale des émotions via TFLite, et diverses fonctionnalités de bien-être personnalisées.

## 📑 Table des matières

- [Vue d'ensemble](#vue-densemble)
- [Architecture système](#architecture-système)
- [Technologies](#technologies)
- [Fonctionnalités principales](#fonctionnalités-principales)
- [Structure du projet](#structure-du-projet)
- [Installation](#installation)
- [Configuration](#configuration)
- [Contribution](#contribution)
- [Auteurs](#auteurs)

## 🎯 Vue d'ensemble

Notre solution se compose de trois parties principales :
- Application mobile Android pour l'interaction utilisateur
- Backend Spring Boot pour la gestion des données
- Interface web pour l'administration et les statistiques
- Serveur RASA pour le traitement du chatbot

## 🏗 Architecture système

Notre système suit une architecture distribuée avec trois composants principaux interconnectés :

### 1. Application Mobile (Frontend Android)
- **Fonctionnalités principales** :
  - Emergency Contacts
  - Habit Tracker
  - Ambient
  - ToDoList
  - Mood Tracker
  - Self Assessment
  - HelpLinet
  - Authentification
  - Breathe
- **Statistiques de suivi** :
  - Module de détection de visage
  - Chatbot

### 2. Services Backend (Spring Boot)
- **Spring Data JPA** :
  - Gestion des entités
  - Mapping objet-relationnel
  - Persistance des données
- **Spring REST Controllers** :
  - APIs RESTful
  - Gestion des requêtes
  - Routing
- **Base de données MySQL** :
  - Stockage relationnel
  - Gestion des utilisateurs
  - Historique des interactions

### 3. Composants Spécialisés

#### Module d'Analyse Faciale :
- Module caméra
- TFLite Interpreter
- Modèle de détection de visage .tflite
- Processeur d'émotion

#### Serveur RASA :
- Rasa Server pour le NLU
- Rasa Core pour le dialogue
- Rasa NLU pour la compréhension
- Modèle entraîné
- Actions personnalisées

#### Interface Web (HTML, CSS, JavaScript) :
- Authentification
- Activity
- Chatbot
- Statistiques



![Architecture](https://github.com/user-attachments/assets/11186566-17a1-4de9-b708-160b6789fd5c)


## 🛠 Technologies

### Frontend Mobile (Android)
- Java Android pour la logique métier
- XML pour les layouts
- Retrofit pour les appels API REST
- TFLite pour l'analyse faciale
- CameraX pour la capture d'images
- MPAndroidChart pour les visualisations

### Backend (Spring Boot)
- Spring Data JPA
- Spring REST Controllers
- MySQL Database
- Maven pour la gestion de dépendances

### Frontend Web
- HTML5 pour la structure
- CSS3 pour le style
- JavaScript pour l'interactivité
- Charts.js pour les visualisations
- Fetch API pour les requêtes REST

### Intelligence Artificielle
- RASA Framework
- TensorFlow Lite
- Modèles pré-entraînés pour la détection faciale

## ✨ Fonctionnalités principales

### 1. Application Mobile
- **Gestion des contacts** :
  - Liste des contacts d'urgence
  - Appel rapide
  
- **Suivi des activités** :
  - Habit Tracker
  - Mood Tracker
  - Self Assessment
  
- **Outils de bien-être** :
  - Exercices de respiration
  - ToDoList personnalisée
  - Ambient sounds

### 2. Analyse Faciale
- Détection en temps réel
- Classification des émotions
- Historique et tendances
- Rapports personnalisés

### 3. Interface Web
- **Dashboard administrateur** :
  - Suivi des activités utilisateurs
  - Statistiques globales
  - Gestion des comptes
- **Interface chatbot** :
  - Historique des conversations
  - Analyse des interactions
  - Configuration des réponses

## 📁 Structure du projet

```
projet/
├── mobile/
│   ├── app/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   ├── activities/
│   │   │   │   │   ├── adapters/
│   │   │   │   │   ├── models/
│   │   │   │   │   ├── network/
│   │   │   │   │   ├── utils/
│   │   │   │   │   └── ml/
│   │   │   │   └── res/
│   │   │   └── assets/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/project/
│   │   │   │       ├── controllers/
│   │   │   │       ├── models/
│   │   │   │       ├── repositories/
│   │   │   │       └── services/
│   │   │   └── resources/
├── web/
│   ├── public/
│   │   ├── css/
│   │   ├── js/
│   │   └── assets/
│   └── index.html
└── rasa/
    ├── data/
    ├── models/
    └── actions/
```

## 🚀 Installation

### Prérequis
- Android Studio pour le développement mobile
- JDK 17 ou supérieur
- SDK Android (API 21 minimum)
- MySQL 8.0
- Python 3.8+ pour RASA
- Node.js pour le développement web


### Installation de RASA
```bash
pip install rasa
rasa train
rasa run
```

## ⚙️ Configuration

### 1. Configuration Backend (application.properties)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mental_health_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
server.port=8083
```

### 2. Configuration TFLite
```java
// Initialisation du détecteur facial
private Interpreter tflite;
private final String MODEL_PATH = "emotion_model.tflite";

private void initializeTFLite() {
    try {
        Interpreter.Options options = new Interpreter.Options();
        options.setNumThreads(4);
        tflite = new Interpreter(loadModelFile(MODEL_PATH), options);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

### 3. Configuration RASA
```yaml
# config.yml
language: fr
pipeline:
  - name: WhitespaceTokenizer
  - name: RegexFeaturizer
  - name: LexicalSyntacticFeaturizer
  - name: CountVectorsFeaturizer
  - name: CountVectorsFeaturizer
    analyzer: char_wb
    min_ngram: 1
    max_ngram: 4
  - name: DIETClassifier
    epochs: 100
```

## 🤝 Contribution

Nous encourageons les contributions ! Voici comment participer :

1. Forkez le projet
2. Créez votre branche (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Committez vos changements (`git commit -m 'Ajout nouvelle fonctionnalité'`)
4. Pushez vers la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Ouvrez une Pull Request

### Guide de contribution
- Respectez les conventions de code
- Ajoutez des tests unitaires
- Mettez à jour la documentation
- Vérifiez que tous les tests passent

## ✍️ Auteurs

- **SAKHR Niama** 
- **CHAJARI Salma** 

### Contact

Pour toute question ou suggestion, n'hésitez pas à nous contacter :
- Email : chajarisalma27@gmail.com
- GitHub : [Profil GitHub](https://github.com/Salma-CHAJARI)

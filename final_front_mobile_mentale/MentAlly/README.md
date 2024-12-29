# Application Android de Suivi de Santé Mentale avec Chatbot et Analyse Faciale

Application Android mobile permettant le suivi de l'état mental des utilisateurs en combinant trois technologies clés : un chatbot conversationnel intelligent, une analyse faciale des émotions via TFLite, et diverses fonctionnalités de bien-être personnalisées.

## 📑 Table des matières

- [Architecture logicielle](#architecture-logicielle)
- [Technologies](#technologies)
- [Fonctionnalités principales](#fonctionnalités-principales)
- [Structure du projet](#structure-du-projet)
- [Installation](#installation)
- [Configuration](#configuration)
- [Démo](#démo)
- [Contribution](#contribution)
- [Auteurs](#auteurs)

## 🏗 Architecture logicielle

L'application suit une architecture client-serveur moderne avec :

- **Client Android** : Application native Java optimisée pour les performances
- **APIs** : Communication robuste via Retrofit et Volley
- **ML Model** : Modèle TFLite optimisé pour la détection faciale en temps réel

## 🛠 Technologies

### Frontend
- Java Android 
- XML pour les layouts responsifs
- Retrofit pour les appels API REST
- Volley pour les requêtes réseau optimisées
- TFLite pour l'analyse faciale en temps réel
- CameraX pour la capture d'images haute qualité
- Firebase pour l'authentification et le stockage
- MPAndroidChart pour la visualisation des données

## ✨ Fonctionnalités principales

### 1. Chatbot Intelligent
- Interface conversationnelle intuitive
- Analyse des réponses en temps réel
- Historique des conversations sécurisé
- Suggestions personnalisées basées sur l'historique

### 2. Analyse Faciale avec TFLite
- Détection précise des expressions en temps réel
- Classification des émotions avec score de confiance
- Suivi temporel des changements émotionnels
- Génération de rapports d'analyse

### 3. Interface Utilisateur
- Design Material moderne et intuitif
- Navigation fluide entre les fonctionnalités
- Dashboard interactif personnalisable
- Thèmes clair/sombre adaptables

### 4. Fonctionnalités Bien-être
- Bibliothèque de musique relaxante intégrée
- Exercices de respiration guidés
- To-do list intelligente
- Suivi de progression personnalisé

## 📁 Structure du projet

```
app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── activities/
│   │   │   ├── adapters/
│   │   │   ├── models/
│   │   │   ├── network/
│   │   │   ├── utils/
│   │   │   └── ml/
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   ├── values/
│   │   │   └── drawable/
│   │   └── assets/
│   │       └── models/
```

## 🚀 Installation

### Prérequis
- Android Studio 
- JDK 17 ou supérieur
- SDK Android (min API 21)
- Git

### Étapes d'installation

1. **Clonage du projet**
```bash
git clone https://github.com/Salma-CHAJARI/ProjetFinModule.git
```

2. **Configuration de l'environnement**
```gradle
android {
    compileSdk 34
    defaultConfig {
        minSdk 21
        targetSdk 34
    }
}
```

3. **Dépendances principales**
```gradle
dependencies {
    // Android Core
    implementation 'androidx.appcompat:appcompat:1.7.0'
    implementation 'com.google.android.material:material:1.12.0'
    
    // Glide
    implementation 'com.github.bumptech.glide:glide:4.8.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.4.0'
    
    // Material Design
    implementation "com.google.android.material:material:1.6.1"
    
    // RecyclerView
    implementation "androidx.recyclerview:recyclerview:1.2.1"
    
    // Networking
    implementation 'com.squareup.okhttp3:okhttp:4.10.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    
    // Machine Learning
    implementation 'org.tensorflow:tensorflow-lite:2.11.0'
    implementation 'org.tensorflow:tensorflow-lite-gpu:2.10.0'
    implementation 'org.tensorflow:tensorflow-lite-support:0.4.3'
    
    // Camera
    implementation 'androidx.camera:camera-core:1.4.1'
    implementation 'androidx.camera:camera-camera2:1.4.1'
    implementation 'androidx.camera:camera-lifecycle:1.4.1'
    implementation 'androidx.camera:camera-view:1.0.0-alpha30'
    
    // UI Components
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.25'
    implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'
    
    // Google Services
    implementation 'com.google.android.gms:play-services-base:18.5.0'
    implementation 'com.google.android.gms:play-services-auth:21.3.0'
}
```

## ⚙️ Configuration

### 1. Configuration TFLite
```java
// Initialisation du détecteur facial
emotion_model.tflite
```

### 2. Configuration Retrofit
```properties
# local.properties
base.url=http://localhost:8083/
```

## 🎯 Démo

https://github.com/user-attachments/assets/ef66ecb7-915b-4364-ad2c-a5a1f048926c

## 🤝 Contribution

Nous encourageons les contributions ! Voici comment participer :

1. Forkez le projet
2. Créez votre branche (`git checkout -b feature/nouvelle-fonctionnalite`)
3. Committez vos changements (`git commit -m 'Ajout nouvelle fonctionnalité'`)
4. Pushez vers la branche (`git push origin feature/nouvelle-fonctionnalite`)
5. Ouvrez une Pull Request

## ✍️ Auteurs

- **SAKHR Niama**
- **CHAJARI Salma**

Below is a ready‑to‑paste README.md (English).
Copy it into the root of your repo and commit + push.

markdown
Copy
Edit
# Personalized Delivery App

An Android application that lets independent couriers accept, manage, and track deliveries in real time.  
Built with **Android Studio**, **Material 3 UI**, **Firebase** (Auth, Realtime DB, Storage) and **Google Maps**.

---

## Features

| Category | Highlights |
|----------|------------|
| **Courier workflow** | • Accept / reject incoming jobs<br>• Optimized stop sequence (distance‑based)<br>• Status updates: *Picked Up* → *On The Way* → *Delivered* |
| **Live tracking** | Real‑time map for courier, business, and end‑customer (shareable link) |
| **Multiplatform Firebase** | Secure login (Email/Password), live DB sync, photo uploads (proof‑of‑delivery) |
| **Full Hebrew & English support** | UI is currently locked to **English‑only** (LTR) for consistency |

---

## Tech Stack

| Layer | Library / Tool | Version |
|-------|----------------|---------|
| **Language** | Kotlin / Java mix | 1.9.24 / 17 |
| **Android Gradle Plugin** | **8.4.2** |
| **Gradle Wrapper** | **8.7‑all** |
| **UI** | Material 3, ConstraintLayout |
| **Maps** | `com.google.android.gms:play‑services‑maps:18.2.0` |
| **Backend** | Firebase BOM 33.1.0 (Auth, DB, Storage) |

---

## Folder Structure (5‑folder layout)

/ (project root)
│
├── 1_gradle/ Gradle wrapper & global props
├── 2_project/ Project‑level Gradle + settings
├── 3_app_module/ Module Gradle file (app/build.gradle)
├── 4_app_src/ All source & resources
│ └── res/values/ strings.xml / styles.xml / colors.xml
└── 5_misc/ ProGuard rules, docs, etc.

yaml
Copy
Edit

---

## Prerequisites

* Android Studio **Jellyfish 2023.3.1** or newer  
* Android SDK Platform 34  
* A Firebase project (Download `google-services.json` and place under `app/`)  
* A Google Maps API key (add to `local.properties` or via manifest‑placeholder)

---

## Build & Run

```bash
# 1. Clone
git clone https://github.com/<your‑user>/Personalized-delivery-app.git
cd Personalized-delivery-app

# 2. Open in Android Studio
#    – OR –
./gradlew app:installDebug    # command‑line install (device must be connected)
If Android Studio prompts “Update Gradle Wrapper to 8.7” just accept.
When the Gradle sync completes, press Run ▶︎.

Release Signing (optional)
Generate a keystore:
keytool -genkeypair -v -keystore courier.keystore -alias courier -keyalg RSA -keysize 2048 -validity 10000

Add to gradle.properties:

properties
Copy
Edit
MY_KEYSTORE_FILE=/absolute/path/courier.keystore
MY_KEY_ALIAS=courier
MY_KEY_PASSWORD=*****
MY_STORE_PASSWORD=*****
In app/build.gradle, enable the release signingConfig block.

Contributing
Pull‑requests and feature suggestions are welcome!
Please open an Issue before submitting large changes.

License
This project is licensed under the MIT License – see LICENSE for details.

Contact
Author: Yahav Yosef Gal
Email: yahav.yg@gmail.com
Feel free to reach out for bugs, ideas, or collaboration.

# Security for Wildfly and Firebase example application

This code is a proof-of-concept using Firebase Admin to authenticate users via a configured Firebase project. It has been tested on wildfly-preview-26.1.0.Final (EE9) and wildfly-26.1.0.Final (EE8).
Follow the instrucations for setting up the auth mechanism under
https://github.com/dajevtic/wildfly-firebase-mechanism

Under src/main/webapp/login/login.xhtml add your configuration for wildfly. see
YOUR_FIREBASE_CONFIG_HERE and YOUR_CLIENT_ID_HERE

Use the experimental extension for your firebase project under
https://github.com/FirebaseExtended/experimental-extensions/tree/next/firestore-auth-claims
to assign roles to your users.
